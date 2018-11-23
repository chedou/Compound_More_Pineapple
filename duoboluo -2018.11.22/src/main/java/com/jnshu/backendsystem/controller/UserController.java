package com.jnshu.backendsystem.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.backendsystem.pojo.Result;
import com.jnshu.backendsystem.pojo.User;
import com.jnshu.backendsystem.service.UserService;
import com.jnshu.backendsystem.utils.ChinaPhone;
import org.apache.ibatis.annotations.Param;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.jnshu.backendsystem.utils.MsmUtil.sendSmsCode;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    //日志打印
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    // TODO: 2018/11/14 查询用户列表（待完善）
    //@PostMapping("/a/user/list")
    //public Result qureyUserList(String roleName, String name,
    //                            @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
    //                            @RequestParam(value = "size", required = false, defaultValue = "10") Integer size) {
    //    logger.info("------------输入请求参数------------");
    //    logger.info("roleName:" + roleName + "\n" + "name:" + name + "\n" + "page:" + page + "\n" + "size:" + size + "\n");
    //    logger.info("------------------------");
    //
    //    Result result = new Result();
    //    HashMap data = new HashMap();
    //    List list = new ArrayList();
    //    try {
    //        PageHelper.startPage(page, size);
    //        List<User> positionInfoList = userService.qureyUserList(roleName, name);
    //        PageInfo<User> pageInfo = new PageInfo<User>(positionInfoList);
    //        data.put("total", pageInfo.getTotal());
    //        data.put("qureyUserList", pageInfo.getList());
    //        logger.info("查询返回的结果为：" + pageInfo.getList());
    //        result.setCode(1);
    //        result.setMessage("SUCCESS");
    //        result.setData(data);
    //        return result;
    //    } catch (RuntimeException e) {
    //        logger.info(e.toString());
    //        result.setCode(1);
    //        result.setMessage("系统异常，请稍后再试");
    //        return result;
    //
    //    }
    //}

    // TODO: 2018/11/14 获取短信验证码
    @PostMapping(value = "/a/verification")
    public Result getPhoneCode(String phoneNumber) {
        Result result = new Result();
        HashMap data = new HashMap();
        long startTime = System.currentTimeMillis();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date(startTime);
        String time = formatter.format(date);
        int verrificationCode = (int) ((Math.random() * 9 + 1) * 100000);
        if (ChinaPhone.isPhoneLegal(phoneNumber)) {
            logger.info("接收到的手机号码为：" + phoneNumber);
            logger.info("\n手机号码格式正确");
            int count = 1;
            logger.info("\n该号码今天已经发送了" + count + "次验证请求");
            if (redisTemplate.opsForValue().get(time + phoneNumber) != null) {
                logger.info("\n该号码今天已经获取过验证码了。");
                count = (int) redisTemplate.opsForValue().get(time + phoneNumber);
                logger.info("\ncount++=" + count);
            }
            if (count < 5) {
                try {
                    SendSmsResponse response = sendSmsCode(phoneNumber, String.valueOf(verrificationCode));
                    logger.info("\n短信接口返回的数据----------------");
                    logger.info("\nCode=" + response.getCode());
                    logger.info("\nMessage=" + response.getMessage());
                    logger.info("\nRequestId=" + response.getRequestId());
                    logger.info("\nBizId=" + response.getBizId());
                    result.setCode(1);
                    result.setMessage("SUCCESS");
                    data.put("verificationCode", verrificationCode);
                    result.setData(data);
                    redisTemplate.opsForValue().set("phone" + phoneNumber, String.valueOf(verrificationCode), 360, TimeUnit.MINUTES);
                    logger.info("\n缓存的手机验证码为：" + redisTemplate.opsForValue().get("phone" + phoneNumber));
                    redisTemplate.opsForValue().set(time + phoneNumber, ++count, 24, TimeUnit.HOURS);
                    return result;
                } catch (Exception e) {
                    logger.info(e.toString());
                    logger.info("\n发送异常");
                    result.setCode(400000);
                    result.setMessage("发送验证码异常，请查看日志");
                }
            } else {
                logger.info("该号码获取验证码次数已经超过5次，请明天后再试或者换个号码注册！");
            }
        } else {
            logger.info("\n输入的号码错误。请重新输入");
        }
        return result;
    }

    //TODO: 2018/11/15 注册、新增用户信息
    @PostMapping(value = "/a/user")
    public Result insertUserInfo(User user, @Param("psd") String psd, @Param("verrificationCode") String verrificationCode) {
        Result result = new Result();
        logger.info("----------传进来的参数---------");
        logger.info(user.toString() + "\n" + "psd=" + psd + "\n" + "verrificationCode=" + verrificationCode + "\n");
        logger.info("-------------------------------");
        String verrificationCodeRedis = redisTemplate.opsForValue().get("phone" + user.getPhoneNum()).toString();
        logger.info(verrificationCodeRedis);
        if (!userService.qureyPhoneNumber(user.getPhoneNum())) {
            if (!userService.qureyUserName(user.getName())) {
                if (verrificationCode.equals(verrificationCodeRedis) && user.getPassword().equals(psd)){
                    try {
                        userService.insertUserInfo(user);
                    } catch (RuntimeException e) {
                        logger.info(e.toString());
                        result.setCode(400001);
                        result.setMessage("系统异常，请查看日志信息，稍后再试");
                        return result;
                    }
                    result.setCode(1);
                    result.setMessage("SUCCESS");
                    return result;
                } else {
                    logger.info("验证码错误或者两次输入密码不一致");
                    result.setCode(400002);
                    result.setMessage("验证码错误或者两次输入密码不一致");
                }
            } else {
                logger.info("该用户名已经被注册，请更换用户名注册");
                result.setCode(400003);
                result.setMessage("该用户名已经被注册，请更换用户名注册");
                return result;
            }
        } else {
            logger.info("该手机号码已经被注册，请更换手机号码注册");
            result.setCode(400004);
            result.setMessage("该手机号码已经被注册，请更换手机号码注册");
            //return result;
        }
        return result;
    }

}
