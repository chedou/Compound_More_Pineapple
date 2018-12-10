package com.jnshu.resourceservice.dao;

import com.jnshu.resourceservice.entity.*;
import org.apache.ibatis.annotations.*;
/**
 * @description Role角色持久层
 * @author Mr.HUANG
 * @date 2018/12/6
 */
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