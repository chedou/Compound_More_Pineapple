package com.jnshu.backendsystem.dao;


import com.jnshu.backendsystem.pojo.ModuleTable;
import com.jnshu.backendsystem.pojo.ModuleTableExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ModuleTableMapper {

    // TODO: 2018/11/8 获取模块管理列表
    List<ModuleTable> qureyModuleList();

    // TODO: 2018/11/8 删除模块信息
    int deleteModuleById(Integer id);

    // TODO: 2018/11/8 新增模块
    int insertModuleInfo(@Param("name") String name,@Param("menuld")String menuld,@Param("url")String url,@Param("parentModuleId")Integer parentModuleId,
                         @Param("moduleCategory")String moduleCategory,@Param("createBy")String createBy,@Param("gmtCreate")Long gmtCreate);

    // TODO: 2018/11/8 修改模块信息
    int updateModuleById(@Param("id")Integer id, @Param("name") String name,@Param("menuld")String menuld,@Param("url")String url,@Param("parentModuleId")Integer parentModuleId,
                   @Param("moduleCategory")String moduleCategory,@Param("updateBy")String updateBy,@Param("gmtUpdate")Long gmtUpdate);

    // TODO: 2018/11/8 查询单个模块信息
    List<ModuleTable> qureyModuleInfoById(@Param("id")Integer id);
}