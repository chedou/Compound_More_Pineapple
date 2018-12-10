package com.jnshu.backendsystem.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jnshu.backendsystem.pojo.CompanyInfo;
import com.jnshu.backendsystem.pojo.CompanyInfo2;
import com.jnshu.backendsystem.pojo.Result;
import com.jnshu.backendsystem.service.CompanyInfoService;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.management.RuntimeMBeanException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class CompanyInfoController {

    @Autowired
    private CompanyInfoService companyInfoService;

    //日志打印
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    // TODO: 2018/11/2  搜索公司
    @PostMapping(value = "/duoboluo/u/company_list")
    public Result getCompanyInfoList(String companyName, String[] city, int[] companyIndustry, int[] financingScale,
                                     @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                     @RequestParam(value = "size", required = false, defaultValue = "12") Integer size) {
        logger.info("------------输入请求参数------------");
        logger.info("companyName:" + companyName + "\n" + "companyIndustry:" + companyIndustry +
                "\n" + "financingScale:" + financingScale + "\n" + "city:" + city + "\n" + "page:" + page + "\n" + "size:" + size + "\n");
        logger.info("------------------------");
        HashMap data = new HashMap();
        Result result = new Result();
        try {
            //分页处理
            PageHelper.startPage(page, size);
            List companyInfoList = companyInfoService.findCompanyInfo(companyName, city, companyIndustry, financingScale);
            PageInfo<CompanyInfo2> pageInfo = new PageInfo<CompanyInfo2>(companyInfoList);
            data.put("total", pageInfo.getTotal());
            data.put("getCompanyInfoList", pageInfo.getList());
            logger.info("搜索公司结果为：" + pageInfo.getList());

            //返回结果封装
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("系统异常，请稍后再试！");
            return result;
        }
    }


    // TODO: 2018/11/4  推荐公司
    @GetMapping(value = "/duoboluo/u/recommended_company")
    public Result getRecommendCompany() {
        HashMap data = new HashMap();
        List list = new ArrayList();
        Result result = new Result();
        try {
            list = companyInfoService.recommendCompany();
            logger.info("推荐公司信息：" + list.toString());
            data.put("RecommendCompanyList", list);
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            result.setCode(40000);
            result.setMessage("系统异常，请稍后再试！");
            return result;
        }
    }


    // TODO: 2018/11/5 公司详情
    @GetMapping(value = "/duoboluo/u/company_info")
    public Result getCompanyInfoDetail(Long companyId) {
        logger.info("------------输入请求参数------------");
        logger.info("companyId:" + companyId + "\n");
        logger.info("------------------------");
        HashMap data = new HashMap();
        List list = new ArrayList();
        Result result = new Result();
        PageInfo pageInfo = new PageInfo();
        try {
            List list1 = companyInfoService.getCompanyDetail(companyId);
            List list2 = companyInfoService.getCompanyProdureDetail(companyId);
            if (list1.size() == 0) {
                result.setCode(40001);
                result.setMessage("找不到该id的公司详细信息，请确认公司id是否正确！");
                return result;
            } else {
                data.put("CompanyDetail", list1);
                data.put("CompanyProdureDetail", list2);
                result.setCode(0);
                result.setMessage("SUCCESS");
                result.setData(data);
                return result;
            }
        } catch (RuntimeException e) {
            result.setCode(40000);
            result.setMessage("输入请求公司id错误或系统异常，请稍后再试！");
            return result;
        }
    }

    // TODO: 2018/11/5  成功案例
    @GetMapping(value = "/duoboluo/u/company/success_case")
    public Result getSuccessCase() {
        HashMap data = new HashMap();
        Result result = new Result();
        try {
            List successCaseList = companyInfoService.successCase();
            logger.info("成功案例输出结果：" + successCaseList.toString());
            data.put("successCaseList", successCaseList);
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("系统异常，请稍后再试！");
            return result;
        }
    }

    // TODO: 2018/11/6 公司在招职位
    @GetMapping(value = "/duoboluo/u/company/position_info")
    public Result getRecruitmentPosition(Long companyId,
                                         @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                         @RequestParam(value = "size", required = false, defaultValue = "10") Integer size) {
        logger.info("------------输入请求参数------------");
        logger.info("companyId:" + companyId + "\n" + "page:" + page + "\n" + "size:" + size);
        logger.info("------------------------");
        HashMap data = new HashMap();
        Result result = new Result();

        try {
            PageHelper.startPage(page, size);
            //List companyDetailList = companyInfoService.getCompanyDetail(companyId);
            List recruitmentPositionList = companyInfoService.recruitmentPosition(companyId);
            //if (companyDetailList.size() == 0) {
            //    result.setCode(40001);
            //    result.setMessage("没有该公司对于的详细信息，请核对公司id后再输入！");
            //    return result;
            //}else
            if (recruitmentPositionList.size() == 0) {
                result.setCode(40002);
                result.setMessage("该公司没有发布对于的职位信息，请重新输入查询id！");
                return result;
            } else {
                //分页处理
                PageInfo<CompanyInfo2> pageInfo = new PageInfo<CompanyInfo2>(recruitmentPositionList);
                data.put("total", pageInfo.getTotal());
                //data.put("companyDetailList",companyDetailList);
                data.put("recruitmentPositionList", pageInfo.getList());
                logger.info("搜索在招职位结果为：" + pageInfo.getList());
                result.setCode(0);
                result.setMessage("SUCCESS");
                result.setData(data);
                return result;
            }
        } catch (RuntimeException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("系统异常，请稍后再试！");
            return result;
        }
    }

    // TODO: 2018/11/6 最新发布职位4个认证公司
    @GetMapping(value = "/duoboluo/u/latest_certification_company")
    public Result getlatestCertificationCompany() {
        HashMap data = new HashMap();
        List list = new ArrayList();
        Result result = new Result();
        try {
            list = companyInfoService.latestCertificationCompany();
            data.put("latestCertificationCompanyList", list);
            result.setCode(0);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            result.setCode(0);
            result.setMessage("系统异常，请稍后再试");
            return result;
        }
    }

    // TODO: 2018/11/8 后端后台
    // TODO: 2018/11/8 搜索公司列表
    @PostMapping(value = "/a/company")
    public Result qureyCompanyList(String companyName, Integer companyIndustry, String city, String area, String produceName, Integer financingScale, Integer isApprove, Integer isFrozen,
                                   @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                   @RequestParam(value = "size", required = false, defaultValue = "10") Integer size) {
        logger.info("------------输入请求参数------------");
        logger.info("\n" + "companyName:" + companyName + "\n" + "companyIndustry:" + companyIndustry + "city:" + city + "\n" + "area:" + area + "\n" + "produceName:" + produceName + "financingScale:" + financingScale
                + "\n" + "isApprove:" + isApprove + "\n" + "isFrozen:" + isFrozen + "\n" + "size:" + size + "\n" + "page:" + page);
        logger.info("------------------------");
        HashMap data = new HashMap();
        List list = new ArrayList();
        Result result = new Result();
        try {
            PageHelper.startPage(page, size);
            list = companyInfoService.qureyCompanyList(companyName, companyIndustry, city, area, produceName, financingScale, isApprove, isFrozen);
            PageInfo<CompanyInfo2> pageInfo = new PageInfo<CompanyInfo2>(list);
            data.put("total", pageInfo.getTotal());
            data.put("qureyCompanyList", pageInfo.getList());
            logger.info(pageInfo.getList().toString());
            result.setCode(1);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeException e) {
            logger.info(e.toString());
            result.setCode(400001);
            result.setMessage("入参有问题，请核对后再试");
            return result;
        }
    }


    // TODO: 2018/11/9 获取单个公司信息
    @GetMapping(value = "/a/company/{companyId}")
    public Result getAcompanyInfo(@PathVariable Long companyId) {
        logger.info("------------输入请求参数------------");
        logger.info("\n" + "companyId:" + companyId + "\n");
        logger.info("------------------------");
        HashMap data = new HashMap();
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        Result result = new Result();
        try {
            list1 = companyInfoService.getACompanyInfo(companyId);
            list2 = companyInfoService.getCompanyProdureDetail(companyId);
            logger.info(list1.toString());
            logger.info(list2.toString());
            data.put("getACompanyInfo", list1);
            data.put("getCompanyProdureDetail", list2);
            result.setCode(1);
            result.setMessage("SUCCESS");
            result.setData(data);
            return result;
        } catch (RuntimeMBeanException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("系统异常，请稍后再试");
            return result;
        }
    }


    // TODO: 2018/11/9 插入公司信息接口
    @Transactional
    @Insert("INSERT INTO company_info (company_name,company_slogan,number_of_companies,financing_scale,city,area,company_industry,company_logo,company_profile,company_tag,is_approve,is_frozen,gmt_create,gmt_update,create_by,update_by) VALUES(#{record.companyName},#{record.companySlogan},#{record.numberOfCompanies},#{record.financingScale},#{record.city},#{record.area},#{record.companyIndustry}, #{record.companyLogo},#{record.companyProfile},#{companyTag},#{record.isApprove},#{record.isFrozen},#{record.gmtCreate},#{record.gmtUpdate},#{record.createBy}, #{record.updateBy})")
    @Options(useGeneratedKeys = true, keyProperty = "record.companyId", keyColumn = "company_id")/*增加这个注解插入记录后会返回自增长的id*/
    @PostMapping(value = "/a/company/insert_company_info")
    public Result insertCompanyInfo(CompanyInfo record, String produceName, String produceSlogan, String produceLogo, String productIntroduction, String phone, String email, String adress, String map, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
        logger.info("------------输入请求参数------------");
        logger.info("\n" + "record:" + record + "\n" + "produceName:" + produceName +
                "\n" + "produceSlogan:" + produceSlogan + "\n" + "produceLogo:" + produceLogo + "\n" + "productIntroduction:" + productIntroduction + "\n" + "phone:" + phone + "\n" +
                "\n" + "email:" + email + "\n" + "adress:" + adress + "\n" + "map:" + map + "\n" + "gmtCreate:" + gmtCreate + "\n" + "gmtUpdate:" + gmtUpdate + "\n" + "createBy:" + createBy + "\n" + "updateBy:" + updateBy + "\n");
        logger.info("------------------------");

        Result result = new Result();
        try {
            int insertCompanyInfo = companyInfoService.insertCompanyInfo(record);
            logger.info("插入公司信息表成功，insertCompanyInfo=" + insertCompanyInfo);
            Long companyId = record.getCompanyId();

            logger.info("插入公司id为：" + companyId);
            int insertCompanyProduce = companyInfoService.insertCompanyProduce(companyId, produceName, produceSlogan, produceLogo, productIntroduction, gmtCreate, gmtUpdate, createBy, updateBy);
            logger.info("插入公司产品表成功，insertCompanyProduce=" + insertCompanyProduce);

            int insertRecruitingCompanyInformation = companyInfoService.insertRecruitingCompanyInformation(companyId, phone, email, adress, map, gmtCreate, gmtUpdate, createBy, updateBy);
            logger.info("插入招聘公司信息表成功，insertRecruitingCompanyInformation=" + insertRecruitingCompanyInformation);

            result.setCode(1);
            result.setMessage("SUCCESS");
            return result;
        } catch (RuntimeMBeanException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("系统异常，请核对输入参数是否正确，请查看系统错误日志");
            return result;
        }
    }

    // TODO: 2018/11/9  更新公司信息接口
    @Transactional
    @PutMapping(value = "/a/company/update_company_info")
    public Result updateCompanyInfo(CompanyInfo record, Long companyId, String phone, String email, String adress, String map, Integer id, String produceName, String produceSlogan, String produceLogo, String productIntroduction, Long gmtUpdate, String updateBy) {
        logger.info("------------输入请求参数------------");
        logger.info("\n" + "record:" + record + "\n" + "produceName:" + produceName +
                "\n" + "produceSlogan:" + produceSlogan + "\n" + "produceLogo:" + produceLogo + "\n" + "productIntroduction:" + productIntroduction + "\n" + "phone:" + phone + "\n" +
                "\n" + "email:" + email + "\n" + "adress:" + adress + "\n" + "map:" + map + "\n" + "gmtUpdate:" + gmtUpdate + "\n" + "updateBy:" + updateBy + "\n");
        logger.info("------------------------");
        Result result = new Result();
        try {
            int updateCompanyInfo = companyInfoService.updateCompanyById(record);
            logger.info("更新公司信息表成功，updateCompanyInfo=" + updateCompanyInfo);

            int updateCompanyProduce = companyInfoService.updatecompanyProduceByIde(id, produceName, produceSlogan, produceLogo, productIntroduction, gmtUpdate, updateBy);
            logger.info("更新公司产品表成功，updateCompanyProduce=" + updateCompanyProduce);

            int updateRecruitingCompanyInformation = companyInfoService.updateRecruitingCompanyInformationByCompanyId(companyId, phone, email, adress, map, gmtUpdate, updateBy);
            logger.info("更新招聘公司信息表成功，updateRecruitingCompanyInformation=" + updateRecruitingCompanyInformation);

            result.setCode(1);
            result.setMessage("SUCCESS");
            return result;
        } catch (RuntimeMBeanException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("系统异常，请核对输入参数是否正确，请查看系统错误日志");
            return result;
        }
    }

    // TODO: 2018/11/9 更改公司认证状态
    @PutMapping(value = "/a/company/approve/{companyId}")
    public Result updateCompanyApproveStatue(@PathVariable Long companyId, Integer isApprove) {
        logger.info("------------输入请求参数------------");
        logger.info("\n" + "companyId:" + companyId + "\n" + "isApprove:" + isApprove);
        logger.info("------------------------");
        Result result = new Result();

        try {
            int updateCompanyApproveStatue = companyInfoService.updateCompanyApproveStatue(companyId, isApprove);
            logger.info("更新招聘公司信息表成功，updateRecruitingCompanyInformation=" + updateCompanyApproveStatue);
            result.setCode(1);
            result.setMessage("SUCCESS");
            return result;
        } catch (RuntimeMBeanException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("系统异常，请核对输入参数是否正确，并请查看系统错误日志");
            return result;
        }
    }

    // TODO: 2018/11/9 更改公司冻结状态
    @PutMapping(value = "/a/company/frozen/{companyId}")
    public Result updateCompanyFrozenStatue(@PathVariable Long companyId, Integer isFrozen) {
        logger.info("------------输入请求参数------------");
        logger.info("\n" + "companyId:" + companyId + "\n" + "isFrozen:" + isFrozen);
        logger.info("------------------------");
        Result result = new Result();

        try {
            int updateCompanyFrozenStatue = companyInfoService.updateCompanyFrozenStatue(companyId, isFrozen);
            logger.info("更新招聘公司信息表成功，updateRecruitingCompanyInformation=" + updateCompanyFrozenStatue);
            result.setCode(1);
            result.setMessage("SUCCESS");
            return result;
        } catch (RuntimeMBeanException e) {
            logger.info(e.toString());
            result.setCode(40000);
            result.setMessage("系统异常，请核对输入参数是否正确，并请查看系统错误日志");
            return result;
        }
    }

    // TODO: 2018/11/10 删除公司信息接口
    @Transactional
    @DeleteMapping(value = "/a/delete/company_info")
    public Result deleteCompanyInfoByCompanyId(Long companyId) {
        logger.info("------------输入请求参数------------");
        logger.info("\n" + "companyId:" + companyId + "\n");
        logger.info("------------------------");
        Result result = new Result();
        int a = companyInfoService.queryPositionOnlineCount(companyId);
        if (a == 0) {
            try {
                int deleteCompanyInfo = companyInfoService.deleteCompanyInfoByCompanyId(companyId);
                logger.info("删除公司信息表成功，deleteCompanyInfo=" + deleteCompanyInfo);

                int deleteCompanyProduce = companyInfoService.deleteCompanyProduceByCompanyId(companyId);
                logger.info("删除公司产品表成功，deleteCompanyProduce=" + deleteCompanyProduce);

                int deleteRecruitingCompanyInformation = companyInfoService.deleteRecruitingCompanyInformationByCompanyId(companyId);
                logger.info("删除招聘公司信息表成功，deleteRecruitingCompanyInformation=" + deleteRecruitingCompanyInformation);

                int deletePositionInfoByCompanyId = companyInfoService.deletePositionInfoByCompanyId(companyId);
                logger.info("删除职位信息表成功，deletePositionInfoByCompanyId=" + deletePositionInfoByCompanyId);

                result.setCode(1);
                result.setMessage("SUCCESS");
                return result;
            } catch (RuntimeMBeanException e) {
                logger.info(e.toString());
                result.setCode(40000);
                result.setMessage("删除公司信息异常，请核对输入参数是否正确，并请查看系统错误日志");
                return result;
            }
        } else {
            result.setCode(400001);
            result.setMessage("该公司存在上线在招职位信息，下架后再进行公司信息删除");
            return result;
        }
    }
}