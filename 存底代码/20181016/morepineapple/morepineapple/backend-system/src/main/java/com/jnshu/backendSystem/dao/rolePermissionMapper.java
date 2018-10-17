package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.rolePermission;
import org.apache.ibatis.annotations.*;

@Mapper
public interface rolePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(rolePermission record);

    int insertSelective(rolePermission record);

    rolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(rolePermission record);

    int updateByPrimaryKey(rolePermission record);
}