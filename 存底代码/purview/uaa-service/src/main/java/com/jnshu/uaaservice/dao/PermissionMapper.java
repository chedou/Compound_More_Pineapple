package com.jnshu.uaaservice.dao;

import com.jnshu.uaaservice.pojo.Permission;
import org.apache.ibatis.annotations.*;

/**
 * @description 权限信息持久层
 * @param
 * @return
 * @author Mr.HUANG
 * @date 2018/11/28
 */
@Mapper
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}