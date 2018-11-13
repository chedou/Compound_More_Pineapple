package com.jnshu.backendsystem.dao;


import com.jnshu.backendsystem.pojo.CompanyInfo;
import com.jnshu.backendsystem.pojo.CompanyInfo2;
import com.jnshu.backendsystem.pojo.CompanyInfoExample;
import com.jnshu.backendsystem.pojo.CompanyProduce;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CompanyInfoMapper {
    // TODO: 2018/11/8 后端前台

    // TODO: 2018/11/4 搜素公司
    List<CompanyInfo2> findCompanyInfo(@Param("companyName") String companyName, @Param("city") String[] city,
                                       @Param("companyIndustry") int[] companyIndustry, @Param("financingScale") int[] financingScale);

    // TODO: 2018/11/4 推荐公司
    List<CompanyInfo2> recommendCompany();

    // TODO: 2018/11/4 公司详情
    List<CompanyInfo2> getCompanyDetail(@Param("companyId") Long companyId);

    List<CompanyInfo2> getCompanyProdureDetail(@Param("companyId") Long companyId);

    // TODO: 2018/11/5  成功案例
    List<CompanyInfo2> successCase();

    // TODO: 2018/11/6 公司再招职位
    List<CompanyInfo2> recruitmentPosition(@Param("companyId") Long companyId);

    // TODO: 2018/11/6 最新认证4个职位banner图
    List<CompanyInfo2> latestCertificationCompany();

    // TODO: 2018/11/8 后端后台
    // TODO: 2018/11/8 搜索公司列表
    List<CompanyInfo2> qureyCompanyList(@Param("companyName") String companyName, @Param("companyIndustry") Integer companyIndustry, @Param("city") String city,
                                        @Param("area") String area, @Param("produceName") String produceName, @Param("financingScale") Integer financingScale, @Param("isApprove") Integer isApprove,
                                        @Param("isFrozen") Integer isFrozen);

    // TODO: 2018/11/9 获取单个公司信息
    List<CompanyInfo2> getACompanyInfo(@Param("companyId") Long companyId);

    // TODO: 2018/11/9 插入公司信息
    int insertCompanyInfo(CompanyInfo record);
    //int insertCompanyInfo(@Param("companyName") String companyName, @Param("companySlogan") String companySlogan, @Param("numberOfCompanies") Long numberOfCompanies,
    //                      @Param("financingScale") Integer financingScale, @Param("city") String city, @Param("area") String area, @Param("companyIndustry") Integer companyIndustry,
    //                      @Param("companyLogo") String companyLogo, @Param("companyProfile") String companyProfile, @Param("companyTag") String companyTag, @Param("isApprove") Integer isApprove,
    //                      @Param("isFrozen") Integer isFrozen, @Param("gmtCreate") Long gmtCreate, @Param("gmtUpdate") Long gmtUpdate, @Param("createBy") String createBy, @Param("updateBy") String updateBy);


    // TODO: 2018/11/9 更新公司信息
    int updateCompanyById(CompanyInfo record);

    // TODO: 2018/11/9 修改公司认证状态
    int updateCompanyApproveStatue(@Param("companyId")Long companyId,@Param("isApprove")Integer isApprove);

    // TODO: 2018/11/9 修改公司冻结状态
    int updateCompanyFrozenStatue(@Param("companyId")Long companyId,@Param("isFrozen")Integer isFrozen);

    // TODO: 2018/11/9 删除公司信息
    int deleteCompanyInfoByCompanyId(@Param("companyId") Long companyId);


    //long countByExample(CompanyInfoExample example);
    //
    //int deleteByExample(CompanyInfoExample example);
    //
    //int deleteByPrimaryKey(Long companyId);
    //
    //int insert(CompanyInfo record);
    //
    //int insertSelective(CompanyInfo record);
    //
    //List<CompanyInfo> selectByExample(CompanyInfoExample example);
    //
    //CompanyInfo selectByPrimaryKey(Long companyId);
    //
    //int updateByExampleSelective(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);
    //
    //int updateByExample(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);
    //
    //int updateByPrimaryKeySelective(CompanyInfo record);
    //
    //int updateByPrimaryKey(CompanyInfo record);
}