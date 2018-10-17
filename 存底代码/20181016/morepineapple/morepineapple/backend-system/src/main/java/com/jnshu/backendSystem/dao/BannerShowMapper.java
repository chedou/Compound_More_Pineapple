package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.BannerShow;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BannerShowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BannerShow record);

    int insertSelective(BannerShow record);

    BannerShow selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BannerShow record);

    int updateByPrimaryKey(BannerShow record);
}