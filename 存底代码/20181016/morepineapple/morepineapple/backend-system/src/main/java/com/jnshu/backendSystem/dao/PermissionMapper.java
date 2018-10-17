package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.Permission;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}