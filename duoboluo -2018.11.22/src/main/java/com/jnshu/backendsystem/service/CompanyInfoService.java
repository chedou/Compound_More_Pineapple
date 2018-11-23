package com.jnshu.backendsystem.service;

import com.jnshu.backendsystem.pojo.CompanyInfo;
import com.jnshu.backendsystem.pojo.CompanyInfo2;
import com.jnshu.backendsystem.pojo.CompanyProduce;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyInfoService {
    /**
     * @Description: 搜索公司初试，测试前段传数组接收
     * @Author: Sometimes
     * @Date:
     */
    //List<CompanyInfo> findCompanyInfo(  String companyName,String city);
    //List<CompanyInfo> findCompanyInfo2( int[] companyIndustry,int[] financingScale);
    //最终需要的
    List<CompanyInfo2> findCompanyInfo(String companyName, String[] city, int[] companyIndustry, int[] financingScale);

    // TODO: 2018/11/4 推荐公司
    List<CompanyInfo2> recommendCompany();

    // TODO: 2018/11/5  成功案例
    List<CompanyInfo2> successCase();

    // TODO: 2018/11/5  公司详情

    // TODO: 2018/11/4 公司详情
    List<CompanyInfo2> getCompanyDetail(Long companyId);

    List<CompanyInfo2> getCompanyProdureDetail(Long companyId);

    // TODO: 2018/11/6 公司在招职位
    List<CompanyInfo2> recruitmentPosition(Long companyId);

    // TODO: 2018/11/6 最新发布职位4个认证公司
    List<CompanyInfo2> latestCertificationCompany();


    // TODO: 2018/11/8 后端后台
    // TODO: 2018/11/8 搜索公司列表
    List<CompanyInfo2> qureyCompanyList(String companyName, Integer companyIndustry, String city,
                                        String area, String produceName, Integer financingScale, Integer isApprove,
                                        Integer isFrozen);

    // TODO: 2018/11/9 获取单个公司信息
    List<CompanyInfo2> getACompanyInfo(Long companyId);

    // TODO: 2018/11/9 新增公司信息接口
    // TODO: 2018/11/9 插入公司信息
    int insertCompanyInfo(CompanyInfo record);
    // TODO: 2018/11/9 新增公司产品
    int insertCompanyProduce(Long companyId,String produceName,String produceSlogan,String produceLogo,String productIntroduction,Long gmtCreate,Long gmtUpdate,String createBy,String updateBy);
    // TODO: 2018/11/9 新增公司招聘信息
    int insertRecruitingCompanyInformation(Long companyId,String phone,String email,String adress,String map,Long gmtCreate,Long gmtUpdate,String createBy,String updateBy);

    // TODO: 2018/11/9  更新公司信息接口
    // TODO: 2018/11/9 更新公司信息
    int updateCompanyById(CompanyInfo record);
    // TODO: 2018/11/9 更改产品信息
    int updatecompanyProduceByIde(Integer id,String produceName,String produceSlogan,String produceLogo,String productIntroduction,Long gmtUpdate,String updateBy);
    // TODO: 2018/11/9 更新招聘公司信息
    int updateRecruitingCompanyInformationByCompanyId(Long companyId,String produceName,String produceSlogan,String produceLogo,String productIntroduction,Long gmtUpdate,String updateBy);

    // TODO: 2018/11/9 修改公司认证状态
    int updateCompanyApproveStatue(Long companyId,Integer isApprove);

    // TODO: 2018/11/9 修改公司冻结状态
    int updateCompanyFrozenStatue(Long companyId,Integer isFrozen);

    // TODO: 2018/11/10 删除公司信息接口
    // TODO: 2018/11/9 查询在招职位数
    int queryPositionOnlineCount(Long companyId);
    // TODO: 2018/11/9 删除公司信息
    int deleteCompanyInfoByCompanyId(Long companyId);
    // TODO: 2018/11/10 删除公司产品信息
    int deleteCompanyProduceByCompanyId(Long companyId);
    // TODO: 2018/11/10 删除招聘公司信息
    int deleteRecruitingCompanyInformationByCompanyId( Long companyId);
    // TODO: 2018/11/10 删除职位信息i
    int deletePositionInfoByCompanyId(Long companyId);

}
