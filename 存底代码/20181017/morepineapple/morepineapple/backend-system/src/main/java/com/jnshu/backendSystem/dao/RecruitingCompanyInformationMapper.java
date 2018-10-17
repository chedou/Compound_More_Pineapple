package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.RecruitingCompanyInformation;
import org.apache.ibatis.annotations.*;

@Mapper
public interface RecruitingCompanyInformationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RecruitingCompanyInformation record);

    int insertSelective(RecruitingCompanyInformation record);

    RecruitingCompanyInformation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RecruitingCompanyInformation record);

    int updateByPrimaryKey(RecruitingCompanyInformation record);
}