package com.jnshu.backendsystem.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CompanyProduceMapper {
    //List<CompanyProduce> getCompanyProdureDetail(@Param("companyId") Long comapnyId);

    // TODO: 2018/11/8 后端后台
    // TODO: 2018/11/9 新增公司产品
    int insertCompanyProduce(@Param("companyId")Long companyId,@Param("produceName")String produceName,@Param("produceSlogan")String produceSlogan,@Param("produceLogo")String produceLogo,@Param("productIntroduction")String productIntroduction,@Param("gmtCreate")Long gmtCreate,@Param("gmtUpdate")Long gmtUpdate,@Param("createBy")String createBy,@Param("updateBy")String updateBy);

    // TODO: 2018/11/9 更改公司产品
    int updatecompanyProduceByIde(@Param("id")Integer id,@Param("produceName")String produceName,@Param("produceSlogan")String produceSlogan,@Param("produceLogo")String produceLogo,@Param("productIntroduction")String productIntroduction,@Param("gmtUpdate")Long gmtUpdate,@Param("updateBy")String updateBy);

    // TODO: 2018/11/10 删除公司产品信息
    int deleteCompanyProduceByCompanyId(@Param("companyId")Long companyId);

    //int deleteByExample(CompanyProduceExample example);
    //
    //int deleteByPrimaryKey(Long id);
    //
    //int insert(CompanyProduce record);
    //
    //int insertSelective(CompanyProduce record);
    //
    //List<CompanyProduce> selectByExample(CompanyProduceExample example);
    //
    //CompanyProduce selectByPrimaryKey(Long id);
    //
    //int updateByExampleSelective(@Param("record") CompanyProduce record, @Param("example") CompanyProduceExample example);
    //
    //int updateByExample(@Param("record") CompanyProduce record, @Param("example") CompanyProduceExample example);
    //
    //int updateByPrimaryKeySelective(CompanyProduce record);
    //
    //int updateByPrimaryKey(CompanyProduce record);
}