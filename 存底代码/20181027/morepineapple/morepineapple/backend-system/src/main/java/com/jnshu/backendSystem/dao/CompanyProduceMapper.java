package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.CompanyProduce;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CompanyProduceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CompanyProduce record);

    int insertSelective(CompanyProduce record);

    CompanyProduce selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CompanyProduce record);

    int updateByPrimaryKey(CompanyProduce record);
}