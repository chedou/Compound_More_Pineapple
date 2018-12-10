package com.jnshu.uaaservice.dao;

import com.jnshu.uaaservice.pojo.UserRole;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}