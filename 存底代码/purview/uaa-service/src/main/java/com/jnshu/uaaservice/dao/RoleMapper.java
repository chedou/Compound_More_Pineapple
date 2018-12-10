package com.jnshu.uaaservice.dao;

import com.jnshu.uaaservice.pojo.Role;
import org.apache.ibatis.annotations.*;

@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    Role selectRolePermissionById(Integer id);
}