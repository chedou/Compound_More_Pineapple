package com.jnshu.backendsystem.service.impl;

import com.jnshu.backendsystem.dao.UserMapper;
import com.jnshu.backendsystem.pojo.User;
import com.jnshu.backendsystem.service.UserService;
import com.jnshu.backendsystem.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    // TODO: 2018/11/13 查询用户列表
    //@Override
    //public List<User> qureyUserList(String roleName, String name) {
    //    return userMapper.qureyUserList(roleName,name);
    //}

    // TODO: 2018/11/15 查询用户名是否已经被注册
    @Override
    public Boolean qureyUserName(String name) {
        return userMapper.qureyUserName(name);
    }

    // TODO: 2018/11/15 查询手机号码 是否已经被注册
    @Override
    public Boolean qureyPhoneNumber(String phoneNum) {
        return userMapper.qureyPhoneNumber(phoneNum);
    }

    // TODO: 2018/11/15 新增用户信息
    @Override
    public Integer insertUserInfo(User user) {
        //    得到加密盐
        String salt = Md5Util.getSalt();
        //    明文密码
        String oldPassword = user.getPassword();
        //    加盐后的密码
        String saltPassword = Md5Util.getSaltMD5(oldPassword, salt);
        user.setName(user.getName());
        user.setPassword(saltPassword);
        user.setPhoneNum(user.getPhoneNum());
        user.setSalt(salt);
        user.setHeadImage(user.getHeadImage());
        return userMapper.insertUserInfo(user);
    }

    @Override
    public User qureyPasswordByName(String name) {
        return userMapper.qureyPasswordByName(name);
    }

    // TODO: 2018/11/15 登录判断
    @Override
    public Boolean jugdeUser(String name, String password) {
        User user = userMapper.qureyPasswordByName(name);
        String password1 = Md5Util.getSaltMD5(password, user.getSalt());
        String DBPassword = user.getPassword();
        if ((!(user == null)) && password1 == DBPassword) {
            return true;
        } else {
            return false;
        }
    }
}

