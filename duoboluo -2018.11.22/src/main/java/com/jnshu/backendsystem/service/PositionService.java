package com.jnshu.backendsystem.service;

import com.jnshu.backendsystem.pojo.PositionInfo;
import com.jnshu.backendsystem.pojo.PositionInfo2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PositionService {
    // TODO: 2018/11/10 后端前台
    // TODO: 2018/11/4 搜索职位信息
    List<PositionInfo2> searchPositionList(String positionName, Integer isRecommend, int[] positionType , int[] education, String[] city, int[] companyIndustry,
                                           int[] workExperience, int[] salary,Long beginDate,Long endDate);

    // TODO: 2018/11/4    返回4个最新推荐职位
    List<PositionInfo2> fourRecommendPosition();

    // TODO: 2018/11/4 首页最新、推荐职位，根据总数返回固定值
    List<PositionInfo2> searchNewOrRecommendPosition(Integer isRecommend,Integer total);

    // TODO: 2018/11/5 职位详情
    List<PositionInfo2> getPositionDetail(Long positionId);

    // TODO: 2018/11/10 后端后台
    // TODO: 2018/11/10  搜索职位信息列表
    List<PositionInfo2> qureyPositionList(Long ompanyId,String companyName,String positionName, Integer positionType, Integer education,
                                          Integer workExperience, Integer salary,Integer isOnline,Long beginDate,Long endDate);

    // TODO: 2018/11/10 新增职位信息
    int insertPositionByCompanyId(PositionInfo record);

    // TODO: 2018/11/10 查询单个职位信息
    List<PositionInfo2> qureyOnePosition(Long positionId);

    // TODO: 2018/11/10 更新职位信息
    int updateByPositionId(PositionInfo record);

    // TODO: 2018/11/10 删除职位信息
    int qureyIsOnline(Long positionId);
    int deleteByPositionId(Long positionId);

    // TODO: 2018/11/10 更改职位状态
    int updatePositionInfoByPositionIid(Long positionId,Integer isOnline);

}
