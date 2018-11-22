package com.jnshu.backendsystem.service;

import com.jnshu.backendsystem.pojo.BannerShow;

import java.util.List;

public interface BannerShowService {
    // TODO: 2018/11/10 后端前台
    // TODO: 2018/11/10 查询banner图
    List<BannerShow> selectBannerShowByType(Integer type,Integer size);

    // TODO: 2018/11/10 后端后台
    // TODO: 2018/11/10 查询banner图列表
    List<BannerShow> bannerList(String tilesName,Integer isOnline,Integer type,String createBy,Long createAtStart,Long createAtEnd);

    // TODO: 2018/11/10 新增banner图
    int insertBannerInfo(BannerShow record);

    // TODO: 2018/11/10 更改banner图状态
    int updateBannerIsOnline(Long id,Integer isOnline,Long onlineTime);

    // TODO: 2018/11/10 更改单个Banner图对象
    int updateBannerInfoById(BannerShow record);

    // TODO: 2018/11/10 获取单个Banner图
    List<BannerShow> qureyOneBannerInfo(Long id);

    // TODO: 2018/11/10 删除banner图
    int queryBannerStatue(Long id);
    int deleteBannerById(Long id);
}
