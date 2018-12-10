package com.jnshu.backendsystem.dao;


import com.jnshu.backendsystem.pojo.PositionInfo;
import com.jnshu.backendsystem.pojo.PositionInfo2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PositionInfoMapper {

    // TODO: 2018/11/9 后端前台
    // TODO: 2018/11/4 搜索职位
    List<PositionInfo2> searchPositionList(@Param("positionName") String positionName, @Param("isRecommend") Integer isRecommend, @Param("positionType") int[] positionType, @Param("education") int[] education,
                                           @Param("city") String[] city, @Param("companyIndustry") int[] companyIndustry,
                                           @Param("workExperience") int[] workExperience, @Param("salary") int[] salary,
                                           @Param("beginDate")Long beginDate,@Param("endDate")Long endDate);

    // TODO: 2018/11/4  测试代码
    PositionInfo selectOne(Long position_id);

    // TODO: 2018/11/4  返回4个最新推荐职位
    List<PositionInfo2> fourRecommendPosition();

    // TODO: 2018/11/4 首页最新、推荐职位，根据总数返回固定值
    List<PositionInfo2> searchNewOrRecommendPosition(@Param("isRecommend") Integer isRecommend, @Param("total") Integer total);

    // TODO: 2018/11/5 职位详情
    List<PositionInfo2> getPositionDetail(@Param("positionId") Long positionId);


    // TODO: 2018/11/9  后端后台
    // TODO: 2018/11/9 查询在招职位数
    int queryPositionOnlineCount(@Param("companyId")Long companyId);
    // TODO: 2018/11/10 删除职位信息i
    int deletePositionInfoByCompanyId(@Param("companyId")Long companyId);

    List<PositionInfo2> qureyPositionList(@Param("companyId")Long ompanyId,@Param("companyName")String companyName,@Param("positionName") String positionName, @Param("positionType")Integer positionType, @Param("education")Integer education,
                                          @Param("workExperience") Integer workExperience, @Param("salary") Integer salary,@Param("isOnline")Integer isOnline,@Param("beginDate")Long beginDate,@Param("endDate")Long endDate);

    // TODO: 2018/11/10 新增职位信息
    int insertPositionByCompanyId(PositionInfo record);

    // TODO: 2018/11/10 查询单个职位信息
    List<PositionInfo2> qureyOnePosition(@Param("positionId")Long positionId);

    // TODO: 2018/11/10 更新职位信息
    int updateByPositionId(PositionInfo record);

    // TODO: 2018/11/10 删除职位信息
    int qureyIsOnline(@Param("positionId")Long positionId);
    int deleteByPositionId(@Param("positionId")Long positionId);

    // TODO: 2018/11/10 更改职位状态
    int updatePositionInfoByPositionIid(@Param("positionId") Long positionId,@Param("isOnline") Integer isOnline);

    //long countByExample(PositionInfoExample example);
    //
    //int deleteByExample(PositionInfoExample example);
    //
    //int deleteByPrimaryKey(Long positionId);
    //
    //int insert(PositionInfo record);
    //
    //int insertSelective(PositionInfo record);
    //
    //List<PositionInfo> selectByExample(PositionInfoExample example);
    //
    //PositionInfo selectByPrimaryKey(Long positionId);
    //
    //int updateByExampleSelective(@Param("record") PositionInfo record, @Param("example") PositionInfoExample example);
    //
    //int updateByExample(@Param("record") PositionInfo record, @Param("example") PositionInfoExample example);
    //
    //int updateByPrimaryKeySelective(PositionInfo record);
    //
    //int updateByPrimaryKey(PositionInfo record);
}