package com.jnshu.backendsystem.dao;

import com.jnshu.backendsystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.annotation.security.PermitAll;
import java.util.List;

@Mapper
public interface UserMapper {

    // TODO: 2018/11/13 查询用户列表
    //List<User> qureyUserList(@Param("roleName")String roleName, @Param("name")String name );

    // TODO: 2018/11/15 查询用户是否已经注册
    Boolean qureyUserName(@Param("name") String name);
    // TODO: 2018/11/15 查询手机号码是否已经注册
    Boolean qureyPhoneNumber(@Param("phoneNum")String phoneNum);
    // TODO: 2018/11/15 新增用户
    Integer insertUserInfo(User user);

    // TODO: 2018/11/15 登录 查询盐值、密码等
    User qureyPasswordByName(@Param("name")String name);

    // TODO: 2018/11/15 查询用户是否存在
    Boolean jugdeUser(@Param("name")String name,@Param("password")String password);

}
