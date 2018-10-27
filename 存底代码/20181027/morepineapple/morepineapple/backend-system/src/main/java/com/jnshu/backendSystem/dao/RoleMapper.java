package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.Role;
import org.apache.ibatis.annotations.*;

@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}