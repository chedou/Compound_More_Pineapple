package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.ModuleTable;
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