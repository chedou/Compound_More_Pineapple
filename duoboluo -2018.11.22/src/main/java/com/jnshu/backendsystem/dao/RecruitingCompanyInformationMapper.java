package com.jnshu.backendsystem.dao;

import com.jnshu.backendsystem.pojo.RecruitingCompanyInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RecruitingCompanyInformationMapper {
    int deleteByPrimaryKey(Long id);

    // TODO: 2018/11/8 后端后台
    // TODO: 2018/11/9 新增招聘公司信息
    int insertRecruitingCompanyInformation(@Param("companyId") Long companyId, @Param("phone") String phone, @Param("email") String email, @Param("adress") String adress, @Param("map") String map, @Param("gmtCreate") Long gmtCreate, @Param("gmtUpdate") Long gmtUpdate, @Param("createBy") String createBy, @Param("updateBy") String updateBy);
    //int insert(RecruitingCompanyInformation record);
    // TODO: 2018/11/10 更新招聘公司信息
    int updateRecruitingCompanyInformationByCompanyId(@Param("companyId") Long companyId, @Param("phone") String phone, @Param("email") String email, @Param("adress") String adress, @Param("map") String map, @Param("gmtUpdate") Long gmtUpdate, @Param("updateBy") String updateBy);

    // TODO: 2018/11/10 删除招聘公司信息
    int deleteRecruitingCompanyInformationByCompanyId(@Param("companyId") Long companyId);

    //int insertSelective(RecruitingCompanyInformation record);
    //
    //RecruitingCompanyInformation selectByPrimaryKey(Long id);
    //
    //int updateByPrimaryKeySelective(RecruitingCompanyInformation record);
    //
    //int updateByPrimaryKey(RecruitingCompanyInformation record);
}