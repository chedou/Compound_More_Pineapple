package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.*;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll ();
}