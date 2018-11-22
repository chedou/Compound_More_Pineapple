package com.jnshu.backendsystem.service;

import com.jnshu.backendsystem.pojo.ModuleTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModuleTableService {
    // TODO: 2018/11/8 获取模块管理列表
    List<ModuleTable> qureyModuleList();

    // TODO: 2018/11/8 新增模块
    int insertModuleInfo(String name,String menuld,String url,Integer parentModuleId,String moduleCategory,String createBy,Long gmtCreate);

    // TODO: 2018/11/8 修改模块信息
    int updateModuleById(Integer id,String name,String menuld,String url,Integer parentModuleId,String moduleCategory,String updateBy,Long gmtUpdate);

    // TODO: 2018/11/8 删除模块信息
    int deleteModuleById(Integer id);

    // TODO: 2018/11/8 查询单个模块信息
    List<ModuleTable> qureyModuleInfoById(Integer id);

}
