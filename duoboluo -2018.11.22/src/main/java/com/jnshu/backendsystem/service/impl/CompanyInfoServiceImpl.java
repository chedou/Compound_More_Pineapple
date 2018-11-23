package com.jnshu.backendsystem.service.impl;

import com.jnshu.backendsystem.dao.CompanyInfoMapper;
import com.jnshu.backendsystem.dao.CompanyProduceMapper;
import com.jnshu.backendsystem.dao.PositionInfoMapper;
import com.jnshu.backendsystem.dao.RecruitingCompanyInformationMapper;
import com.jnshu.backendsystem.pojo.CompanyInfo;
import com.jnshu.backendsystem.pojo.CompanyInfo2;
import com.jnshu.backendsystem.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    CompanyInfoMapper companyInfoMapper;

    @Autowired
    CompanyProduceMapper companyProduceMapper;

    @Autowired
    RecruitingCompanyInformationMapper recruitingCompanyInformationMapper;

    @Autowired
    PositionInfoMapper positionInfoMapper;

    @Override
    public List<CompanyInfo2> findCompanyInfo(String companyName, String[] city, int[] companyIndustry, int[] financingScale) {
        return companyInfoMapper.findCompanyInfo(companyName,city, companyIndustry,financingScale);
    }

    // TODO: 2018/11/4 推荐公司
    @Override
    public List<CompanyInfo2> recommendCompany() {
        return companyInfoMapper.recommendCompany();
    }

    @Override
    public List<CompanyInfo2> successCase() {
        return companyInfoMapper.successCase();
    }

    // TODO: 2018/11/5 公司详情 
    @Override
    public List<CompanyInfo2> getCompanyDetail(Long companyId) {
        return companyInfoMapper.getCompanyDetail(companyId);
    }
    @Override
    public List<CompanyInfo2> getCompanyProdureDetail(Long companyId) {
        return companyInfoMapper.getCompanyProdureDetail(companyId);
    }

    // TODO: 2018/11/6 公司在招职位
    @Override
    public List<CompanyInfo2> recruitmentPosition(Long companyId) {
        return companyInfoMapper.recruitmentPosition(companyId);
    }

    // TODO: 2018/11/6 最新发布职位4个认证公司
    @Override
    public List<CompanyInfo2> latestCertificationCompany() {
        return companyInfoMapper.latestCertificationCompany();
    }

    // TODO: 2018/11/8 后端后台
    // TODO: 2018/11/8 搜索公司列表
    @Override
    public List<CompanyInfo2> qureyCompanyList(String companyName, Integer companyIndustry, String city, String area, String produceName, Integer financingScale, Integer isApprove, Integer isFrozen) {
       List list =companyInfoMapper.qureyCompanyList(companyName, companyIndustry, city, area, produceName, financingScale, isApprove, isFrozen);
       return list;
    }

    // TODO: 2018/11/9 获取单个公司信息
    @Override
    public List<CompanyInfo2> getACompanyInfo(Long companyId) {
        return companyInfoMapper.getACompanyInfo(companyId);
    }

    // TODO: 2018/11/9 新增公司信息接口
    // TODO: 2018/11/9 插入公司信息
    @Override
    public int insertCompanyInfo(CompanyInfo record) {
        return companyInfoMapper.insertCompanyInfo(record);
    }
    // TODO: 2018/11/9 插入公司产品信息
    @Override
    public int insertCompanyProduce(Long companyId, String produceName, String produceSlogan, String produceLogo, String productIntroduction, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
        return companyProduceMapper.insertCompanyProduce(companyId,produceName,produceSlogan, produceLogo, productIntroduction, gmtCreate, gmtUpdate, createBy, updateBy);
    }
    // TODO: 2018/11/9 插入公司招聘信息
    @Override
    public int insertRecruitingCompanyInformation(Long companyId, String phone, String email, String adress, String map, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
        return recruitingCompanyInformationMapper.insertRecruitingCompanyInformation(companyId,phone,email,adress,map,gmtCreate,gmtUpdate,createBy,updateBy);
    }


    // TODO: 2018/11/9 更新公司信息接口
    // TODO: 2018/11/9 更新公司信息
    @Override
    public int updateCompanyById(CompanyInfo record) {
        return companyInfoMapper.updateCompanyById(record);
    }
    // TODO: 2018/11/9 更改产品信息
    @Override
    public int updatecompanyProduceByIde(Integer id, String produceName, String produceSlogan, String produceLogo, String productIntroduction, Long gmtUpdate, String updateBy) {
        return companyProduceMapper.updatecompanyProduceByIde(id,produceName,produceSlogan, produceLogo, productIntroduction,gmtUpdate,updateBy);
    }
    // TODO: 2018/11/9 更新招聘公司信息
    @Override
    public int updateRecruitingCompanyInformationByCompanyId(Long companyId, String phone, String email, String adress, String map,  Long gmtUpdate,  String updateBy) {
        return recruitingCompanyInformationMapper.updateRecruitingCompanyInformationByCompanyId(companyId,phone,email,adress,map,gmtUpdate,updateBy);
    }

    // TODO: 2018/11/9 修改公司认证状态
    @Override
    public int updateCompanyApproveStatue(Long companyId, Integer isApprove) {
        return companyInfoMapper.updateCompanyApproveStatue(companyId,isApprove);
    }

    // TODO: 2018/11/9 修改公司冻结状态
    @Override
    public int updateCompanyFrozenStatue(Long companyId, Integer isFrozen) {
        return companyInfoMapper.updateCompanyFrozenStatue(companyId,isFrozen);
    }



    // TODO: 2018/11/10 删除公司信息接口
    @Override
    public int queryPositionOnlineCount(Long companyId) {
        return positionInfoMapper.queryPositionOnlineCount(companyId);
    }
    @Override
    public int deleteCompanyInfoByCompanyId(Long companyId) {
        return companyInfoMapper.deleteCompanyInfoByCompanyId(companyId);
    }
    @Override
    public int deleteCompanyProduceByCompanyId(Long companyId) {
        return companyProduceMapper.deleteCompanyProduceByCompanyId(companyId);
    }
    @Override
    public int deleteRecruitingCompanyInformationByCompanyId(Long companyId) {
        return recruitingCompanyInformationMapper.deleteRecruitingCompanyInformationByCompanyId(companyId);
    }
    @Override
    public int deletePositionInfoByCompanyId(Long companyId) {
        return positionInfoMapper.deletePositionInfoByCompanyId(companyId);
    }


}
