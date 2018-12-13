package com.jnshu.backendsystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.backendsystem.pojo.BannerShow;
import com.jnshu.backendsystem.pojo.PositionInfo2;
import com.jnshu.backendsystem.pojo.Result;
import com.jnshu.backendsystem.service.BannerShowService;
import com.jnshu.backendsystem.service.impl.BannerShowServiceImpl;
import com.sun.xml.internal.bind.v2.*;
import io.swagger.models.auth.In;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController

public class BannerShowController {

    @Autowired
    private BannerShowService bannerShowService;
    //日志打印
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    // TODO: 2018/11/6 首页banner图 
    @RequestMapping(value = "/duoboluo/u/banner_list", method = RequestMethod.GET)
    public Result getBannerShowBytype(@RequestParam(value = "type", required = false, defaultValue = "1") Integer type, @RequestParam(value = "size", required = false, defaultValue = "4") Integer size) {
        HashMap data = new HashMap();
        List list = new ArrayList();
        Result result = new Result();
        logger.info("------------输入请求参数------------");
        logger.info("type:" + type + "\n" + "size:" + size + "\n");
        logger.info("------------------------");
        try {
            list.addAll(bannerShowService.selectBannerShowByType(type, size));
            data.put("getBannerShowBytype", list);
            logger.info("Banner图接口查询出来的结果为：" + list.toString());
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("系统异常，请稍后再试！");
            return result;
        }
    }

    // TODO: 2018/11/10 获取bannei图列表
    @PostMapping("/a/banner")
    public Result getBannerList(String tilesName, Integer isOnline, Integer type, String createBy, Long createAtStart, Long createAtEnd,
                                @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                @RequestParam(value = "size", required = false, defaultValue = "10") Integer size) {
        logger.info("------------输入请求参数------------");
        logger.info("tilesName:" + tilesName + "\n" + "isOnline:" + isOnline +
                "\n" + "type:" + type + "\n" + "createBy:" + createBy + "\n" +
                "createAtStart:" + createAtStart + "\n" + "createAtEnd:" + createAtEnd +
                "\n" + "page:" + page + "\n" + "size:" + size + "\n");
        logger.info("------------------------");
        Result result = new Result();
        HashMap data = new HashMap();
        try {
            PageHelper.startPage(page, size);
            List<BannerShow> bannerShowList = bannerShowService.bannerList(tilesName, isOnline, type, createBy, createAtStart, createAtEnd);
            PageInfo<BannerShow> pageInfo = new PageInfo<BannerShow>(bannerShowList);
            data.put("total", pageInfo.getTotal());
            data.put("bannerShowList", pageInfo.getList());
            logger.info("查询返回的结果为：" + pageInfo.getList());
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("查询异常，重新输入查询条件");
            return result;
        }
    }

    // TODO: 2018/11/10 新增banner图
    @PostMapping(value = "/a/banner/insert")
    public Result insertPositionInfo(BannerShow record) {
        Result result = new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n" + "record:" + record + "\n");
        logger.info("--------------------------------");
        try {
            Integer i = bannerShowService.insertBannerInfo(record);
            result.setCode(i);
            result.setMessage("SUCCESS");
            return result;
        } catch (RuntimeException e) {
            e.toString();
            result.setCode(40001);
            result.setMessage("系统繁忙，请稍后重试");
            return result;
        }
    }

    // TODO: 2018/11/10 更新banner图上线状态
    @PutMapping(value = "/a/banner/isOnline/{id}")
    public Result updateBannerIsOnline(@PathVariable Long id, Integer isOnline) {
        Result result = new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n" + "id:" + id + "\n" + "isOnline:" + isOnline + "\n");
        logger.info("--------------------------------");
        Long onlineTime = new Date().getTime();
        try {
            int i = bannerShowService.updateBannerIsOnline(id, isOnline, onlineTime);
            result.setCode(i);
            result.setMessage("SUCCESS");
            return result;
        }catch (RuntimeException e){
            logger.info(e.toString());
            result.setCode(400001);
            result.setMessage("系统异常，请稍后再试");
            return result;
        }
    }

    // TODO: 2018/11/10 更新banner图单个信息
    @PutMapping(value = "/a/banner/{id}")
    public Result updateBannerInfoById(@PathVariable Long id,BannerShow record) {
        Result result = new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n" + "id:" + id + "\n" + "record:" + record + "\n");
        logger.info("--------------------------------");
        //Long onlineTime = new Date().getTime();
        try {
            int i = bannerShowService.updateBannerInfoById(record);
            result.setCode(i);
            result.setMessage("SUCCESS");
            return result;
        }catch (RuntimeException e){
            logger.info(e.toString());
            result.setCode(400001);
            result.setMessage("系统异常，请稍后再试");
            return result;
        }
    }

    // TODO: 2018/11/10 查询单个banner图信息
    @GetMapping("/a/banner_info/{id}")
    public Result qureyModuleInfoById(@PathVariable Long id){
        Result result=new Result();
        HashMap data=new HashMap();
        logger.info("-----------输入请求参数---------");
        logger.info("\n"+"id:"+id+"\n" );
        logger.info("--------------------------------");
        try{
            List list=bannerShowService.qureyOneBannerInfo(id);
            result.setCode(1);
            result.setMessage("SUCCESS");
            data.put("qureyOneBannerInfo",list);
            result.setData(data);
            return result;
        }catch (RuntimeException e){
            e.toString();
            result.setCode(40001);
            result.setMessage("系统繁忙，请稍后重试");
            return result;
        }
    }

    // TODO: 2018/11/10 删除banner图
    @DeleteMapping(value = "/a/banner/{id}")
    public Result deleteBannerById(@PathVariable Long id) {
        Result result = new Result();
        logger.info("-----------输入请求参数---------");
        logger.info("\n" + "id:" + id + "\n");
        logger.info("--------------------------------");
        int statue = bannerShowService.queryBannerStatue(id);
        if (statue == 0) {
            try {
                Integer i = bannerShowService.deleteBannerById(id);
                result.setCode(i);
                result.setMessage("SUCCESS");
                return result;
            } catch (RuntimeException e) {
                e.toString();
                result.setCode(40001);
                result.setMessage("系统繁忙，请稍后重试");
                return result;
            }
        } else {
            result.setCode(40000);
            result.setMessage("存在上线Banner图信息，请先下架该Banner图信息，再进行删除");
            return result;
        }
    }
}
