package com.jnshu.backendsystem.service.impl;

import com.jnshu.backendsystem.dao.PositionInfoMapper;
import com.jnshu.backendsystem.pojo.PositionInfo;
import com.jnshu.backendsystem.pojo.PositionInfo2;
import com.jnshu.backendsystem.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService{

    @Autowired
    PositionInfoMapper positionInfoMapper;
    // TODO: 2018/11/10 后端前台
    // TODO: 2018/11/6 搜索职位 
    @Override
    public List<PositionInfo2> searchPositionList(String positionName, Integer isRecommend, int[] positionType,
                                                  int[] education, String[] city, int[] companyIndustry, int[] workExperience,
                                                  int[] salary,Long beginDate,Long endDate) {
        return positionInfoMapper.searchPositionList(positionName, isRecommend,positionType,education, city, companyIndustry,
                workExperience, salary, beginDate, endDate);
    }

    @Override
    public List<PositionInfo2> fourRecommendPosition() {
        return positionInfoMapper.fourRecommendPosition();
    }

    // TODO: 2018/11/4 首页最新、推荐职位，根据总数返回固定值
    @Override
    public List<PositionInfo2> searchNewOrRecommendPosition(Integer isRecommend, Integer total) {
        return positionInfoMapper.searchNewOrRecommendPosition(isRecommend,total);
    }

    @Override
    public List<PositionInfo2> getPositionDetail(Long positionId) {
        return positionInfoMapper.getPositionDetail(positionId);
    }

    // TODO: 2018/11/10 后端后台
    // TODO: 2018/11/10 搜索职位信息列表
    @Override
    public List<PositionInfo2> qureyPositionList(Long ompanyId,String companyName, String positionName, Integer positionType, Integer education, Integer workExperience, Integer salary, Integer isOnline, Long beginDate, Long endDate) {
        return positionInfoMapper.qureyPositionList(ompanyId,companyName, positionName, positionType, education, workExperience, salary, isOnline, beginDate, endDate) ;
    }

    // TODO: 2018/11/10 新增职位信息
    @Override
    public int insertPositionByCompanyId(PositionInfo record) {
        return positionInfoMapper.insertPositionByCompanyId(record);
    }

    // TODO: 2018/11/10 查询单个职位信息
    @Override
    public List<PositionInfo2> qureyOnePosition( Long positionId) {
        return positionInfoMapper.qureyOnePosition(positionId);
    }

    // TODO: 2018/11/10 更新职位信息
    @Override
    public int updateByPositionId(PositionInfo record) {
        return positionInfoMapper.updateByPositionId(record);
    }

    // TODO: 2018/11/10 删除职位信息
    @Override
    public int qureyIsOnline(Long positionId) {
        return positionInfoMapper.qureyIsOnline(positionId);
    }
    @Override
    public int deleteByPositionId(Long positionId) {
        return positionInfoMapper.deleteByPositionId(positionId);
    }

    // TODO: 2018/11/10 更改职位状态
    @Override
    public int updatePositionInfoByPositionIid(Long positionId, Integer isOnline) {
        return positionInfoMapper.updatePositionInfoByPositionIid(positionId,isOnline);
    }


}
