package com.jnshu.uaaservice.dao;

import com.jnshu.uaaservice.pojo.User;
import org.apache.ibatis.annotations.*;

import javax.jws.soap.SOAPBinding.*;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectUserDetailById(Integer id);

    User findByUsername(String username);

}