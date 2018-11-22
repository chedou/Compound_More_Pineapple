package com.jnshu.backendsystem.service.impl;

import com.jnshu.backendsystem.dao.BannerShowMapper;
import com.jnshu.backendsystem.pojo.BannerShow;
import com.jnshu.backendsystem.service.BannerShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@MapperScan("com.jnshu.backendsystem.dao.BannerShowMapper")
@Service
public class BannerShowServiceImpl implements BannerShowService {
    @Autowired(required=false)
    BannerShowMapper bannerShowMapper;
    /**
     * @Description: 根据类型和数量，返回Banner图信息
     * @Author: Sometimes
     * @Date:
     */
    @Override
    public List<BannerShow> selectBannerShowByType(Integer type, Integer size) {
        return bannerShowMapper.selectBannerShowByType(type, size);
    }

    // TODO: 2018/11/10 后端后台
    // TODO: 2018/11/10 查询banner图列表
    @Override
    public List<BannerShow> bannerList(String tilesName, Integer isOnline, Integer type, String createBy, Long createAtStart, Long createAtEnd) {
        return bannerShowMapper.bannerList(tilesName, isOnline, type, createBy, createAtStart, createAtEnd);
    }

    // TODO: 2018/11/10 新增banner图
    @Override
    public int insertBannerInfo(BannerShow record) {
        return bannerShowMapper.insertBannerInfo(record);
    }

    // TODO: 2018/11/10 更新banner图上线状态
    @Override
    public int updateBannerIsOnline(Long id, Integer isOnline, Long onlineTime) {
        return bannerShowMapper.updateBannerIsOnline(id,isOnline,onlineTime);
    }

    // TODO: 2018/11/10 更新Banner图信息
    @Override
    public int updateBannerInfoById(BannerShow record) {
        return bannerShowMapper.updateBannerInfoById(record);
    }

    // TODO: 2018/11/10 获取单个banner图
    @Override
    public List<BannerShow> qureyOneBannerInfo(Long id) {
        return bannerShowMapper.qureyOneBannerInfo(id);
    }

    // TODO: 2018/11/10 删除banner图
    @Override
    public int queryBannerStatue(Long id) {
        return bannerShowMapper.queryBannerStatue(id);
    }
    @Override
    public int deleteBannerById(Long id) {
        return bannerShowMapper.deleteBannerById(id);
    }
}
