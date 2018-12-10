package com.jnshu.uaaservice.dao;

import com.jnshu.uaaservice.pojo.ModuleTable;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ModuleTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ModuleTable record);

    int insertSelective(ModuleTable record);

    ModuleTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ModuleTable record);

    int updateByPrimaryKey(ModuleTable record);
}