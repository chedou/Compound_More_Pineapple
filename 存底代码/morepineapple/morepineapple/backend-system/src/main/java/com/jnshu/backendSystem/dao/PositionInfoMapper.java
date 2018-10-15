package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.PositionInfo;
import com.jnshu.backendSystem.pojo.PositionInfoWithBLOBs;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PositionInfoMapper {
    int deleteByPrimaryKey(Long positionId);

    int insert(PositionInfoWithBLOBs record);

    int insertSelective(PositionInfoWithBLOBs record);

    PositionInfoWithBLOBs selectByPrimaryKey(Long positionId);

    int updateByPrimaryKeySelective(PositionInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PositionInfoWithBLOBs record);

    int updateByPrimaryKey(PositionInfo record);
}