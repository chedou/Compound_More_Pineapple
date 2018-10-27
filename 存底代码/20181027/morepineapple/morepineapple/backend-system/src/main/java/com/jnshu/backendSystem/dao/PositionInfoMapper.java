package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.PositionInfo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PositionInfoMapper {
    int deleteByPrimaryKey(Long positionId);

    int insert(PositionInfo record);

    int insertSelective(PositionInfo record);

    PositionInfo selectByPrimaryKey(Long positionId);

    int updateByPrimaryKeySelective(PositionInfo record);

    int updateByPrimaryKey(PositionInfo record);
}