package com.jnshu.backendsystem.dao;


import com.jnshu.backendsystem.pojo.BannerShow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BannerShowMapper {

    // TODO: 2018/11/10 后端前台
    // TODO: 2018/11/10 根据类型查询banner图
    List<BannerShow> selectBannerShowByType(@Param("type") Integer type, @Param("size") Integer size);

    // TODO: 2018/11/10 后端后台
    // TODO: 2018/11/10 查询banner图列表
    List<BannerShow> bannerList(@Param("tilesName")String tilesName,@Param("isOnline")Integer isOnline,@Param("type")Integer type,@Param("createBy")String createBy,@Param("createAtStart")Long createAtStart,@Param("createAtEnd")Long createAtEnd);

    // TODO: 2018/11/10 新增banner图
    int insertBannerInfo(BannerShow record);

    // TODO: 2018/11/10 更改banner图上线状态
    int updateBannerIsOnline(@Param("id") Long id,@Param("isOnline")Integer isOnline,@Param("onlineTime")Long onlineTime);

    // TODO: 2018/11/10 更改单个Banner图对象
    int updateBannerInfoById(BannerShow record);

    // TODO: 2018/11/10 获取单个Banner图
    List<BannerShow> qureyOneBannerInfo(Long id);

    // TODO: 2018/11/10 删除banner图
    int queryBannerStatue(Long id);
    int deleteBannerById(Long id);

    //long countByExample(BannerShowExample example);
    //
    //int deleteByExample(BannerShowExample example);
    //
    //int deleteByPrimaryKey(Long id);
    //
    //int insert(BannerShow record);
    //
    //int insertSelective(BannerShow record);
    //
    //List<BannerShow> selectByExample(BannerShowExample example);
    //
    //BannerShow selectByPrimaryKey(Long id);
    //
    //int updateByExampleSelective(@Param("record") BannerShow record, @Param("example") BannerShowExample example);
    //
    //int updateByExample(@Param("record") BannerShow record, @Param("example") BannerShowExample example);
    //
    //int updateByPrimaryKeySelective(BannerShow record);
    //
    //int updateByPrimaryKey(BannerShow record);
}