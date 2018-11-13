package com.jnshu.backendsystem;

import com.jnshu.backendsystem.dao.*;
import com.jnshu.backendsystem.pojo.*;
//import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import com.jnshu.backendsystem.service.impl.PositionServiceImpl;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.jnshu.backendsystem.dao")
public class BackendSystemApplicationTests {
    @Autowired
    private BannerShowMapper bannerShowMapper;

    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Autowired
    private PositionInfoMapper positionInfoMapper;

    @Autowired
    private ModuleTableMapper moduleTableMapper;

    @Autowired
    private PositionServiceImpl positionServiceImpl;

    //@Autowired
    //private CompanyProduceMapper companyProduceMapper;

    @Test
    public void contextLoads() {
        List list = new ArrayList();
        List<BannerShow> bannerShow = bannerShowMapper.selectBannerShowByType(1, 4);
        //System.out.println(bannerShow.toString());
        Boolean c = list.containsAll(bannerShow);
        list.addAll(bannerShow);
        System.out.println(c);
        System.out.println("-------------------------------------");
        System.out.println(bannerShow.size());
        System.out.println(bannerShow.toString());
        for (BannerShow a : bannerShow) {
            System.out.println("bannershow集合遍历" + a);
        }
        for (Object a : list) {
            System.out.println("list遍历" + a.toString());
            System.out.println("list集合的大小：" + list.size());
        }
        System.out.println(list.toString() + "\n");
        System.out.println("-------------------------------------");
    }

    //@Test
    //public void getCompanyInfoList() {
    //    //Collection<CompanyInfo> readValues = new ObjectMapper().readValue(jsonAsString,new TypeReference<Collection<CompanyInfo>>(){});
    //List<CompanyInfo> a =    companyInfoMapper.findCompanyInfo("西","西");
    //    System.out.println("------------------------------------------\n");
    //    System.out.println(a.toString());
    //    System.out.println("------------------------------------------\n");
    //}
    //
    //@Test
    //public void getCompanyInfoList2() {
    //    //Collection<CompanyInfo> readValues = new ObjectMapper().readValue(jsonAsString,new TypeReference<Collection<CompanyInfo>>(){});
    //    int[] a={1,2,3};
    //    int[] b={0,1,14};
    //    List<CompanyInfo> ab =    companyInfoMapper.findCompanyInfo2(a,b);
    //    System.out.println("------------------------------------------\n");
    //    System.out.println(ab.toString());
    //    System.out.println("------------------------------------------\n");
    //}
    //测试搜索公司信息
    @Test
    public void getCompanyInfoList3() {
        String[] a = {"上海市", "广州市", "天津市", "北京市"};
        int[] b = {0, 1, 14};
        int[] c = {0, 1, 14};
        List<CompanyInfo2> e = companyInfoMapper.findCompanyInfo("西", a, b, c);
        System.out.println("------------------------------------------\n");
        System.out.println(e.toString());
        System.out.println("------------------------------------------\n");
    }

    //    搜索职位信息
    @Test
    public void getPositionInfoList() {
        String positionName1 = "web";
        Integer isRecommend1 = 1;
        int[] education1 = {0, 1, 2, 3};
        String[] city1 = {"北京市", "上海市", "天津市"};
        int[] companyIndustry1 = {0, 1, 2, 3};
        int[] workExperience1 = {1, 2, 3, 4};
        int[] salary1 = {0, 1, 2, 3, 4};
        int[] positionType1 = {1, 2, 3, 4};
        Integer page1 = 1;
        Integer size1 = 2;
        long beginDate = 1541424307000l;
        long endDate = 1541510707000l;

        List<PositionInfo2> positionInfoList = positionInfoMapper.searchPositionList(positionName1, isRecommend1, positionType1, education1, city1, companyIndustry1, workExperience1, salary1, beginDate, endDate);
        System.out.println(positionInfoList.toString());
    }

    //测试代码
    @Test
    public void getSelectOne() {
        positionInfoMapper.selectOne(1l);
        System.out.println(positionInfoMapper.selectOne(1l));
    }


    // TODO: 2018/11/5 根据输入职位类型、总数，返回结果集 
    @Test
    public void getsearchNewOrRecommendPosition() {
        List list = positionInfoMapper.searchNewOrRecommendPosition(1, 20);
        System.out.println(list.toString());
    }

    @Test
    public void getRecommendCompany() {
        //List list1 =companyInfoMapper.recommendCompany();
        List list = companyInfoMapper.recommendCompany();
        System.out.println(list);
        //System.out.println(list1);
    }

    @Test
    public void getCompanyDetail() {
        List list = companyInfoMapper.getCompanyDetail(1l);
        List list1 = companyInfoMapper.getCompanyProdureDetail(1l);
        System.out.println(list.toString());
        System.out.println(list1.toString());
    }

    @Test
    public void getPositionDetail() {
        List list = positionInfoMapper.getPositionDetail(5l);
        System.out.println(list.toString());
    }

    @Test
    public void getSuccessCase() {
        List list = companyInfoMapper.successCase();
        System.out.println(list.toString());
    }

    // TODO: 2018/11/8  公司在招职位
    @Test
    public void getRecruitmentPosition() {
        List list = companyInfoMapper.recruitmentPosition(1l);
        System.out.println(list.toString());
    }

    // TODO: 2018/11/6 最新认证4个职位banner图
    @Test
    public void latestCertificationCompany() {
        List list = companyInfoMapper.latestCertificationCompany();
        System.out.println(list.toString());
    }

    @Test
    public void shijiancuo() {
        //int i=(int)(DateTimeLiteralExpression.DateTime.now().getMillis() / 1000);
        int a = (int) (System.currentTimeMillis() / 1000) - 0 * 8640000;
        int b = (int) (System.currentTimeMillis() / 1000) - 1 * 8640000;
        System.out.println(a);
    }

    // TODO: 2018/11/7 获取模块列表
    @Test
    public void getModuleTableList() {
        List list = moduleTableMapper.qureyModuleList();
        System.out.println(list.toString());
    }

    // TODO: 2018/11/8 新增模块
    @Test
    public void insertModuleInfo() {
        Integer i = moduleTableMapper.insertModuleInfo("行业大图模块88", "9", "http://dsncfsdkjcfsdksd12312.jsp", 7, "/u/banner", "徐晃", 1541643373l);
        System.out.println(i);
    }

    // TODO: 2018/11/8 修改模块信息
    @Test
    public void updateById() {
        Integer i = moduleTableMapper.updateModuleById(1, "行业大图模块88", "9", "http://dsncfsdkjcfsdksd12312.jsp", 7, "/u/banner", "徐晃", 1541643373l);
        System.out.println(i);
    }

    @Test
    // TODO: 2018/11/8 查询单个模块信息
    public void qureyModuleInfoById() {
        List<ModuleTable> list = moduleTableMapper.qureyModuleInfoById(1);
        System.out.println(list.toString());
    }

    // TODO: 2018/11/8 后端后台测试
    // TODO: 2018/11/8 搜索公司列表
    @Test
    public void qureyCompanyList() {
        List<CompanyInfo2> list = companyInfoMapper.qureyCompanyList("西", 0, "北京市", "怀安区", "携程网", 1, 0, 0);
        System.out.println(list.toString());
    }

    // TODO: 2018/11/9 获取单个公司信息
    @Test
    public void getAcompanyInfo() {
        List<CompanyInfo2> list = companyInfoMapper.getACompanyInfo(1l);
        System.out.println(list.toString());
    }

    //@Test
    //// TODO: 2018/11/9 插入公司信息1
    //@Insert("INSERT INTO company_info (company_name,company_slogan,number_of_companies,financing_scale,city,area,company_industry,company_logo,company_profile,company_tag,is_approve,is_frozen,gmt_create,gmt_update,create_by,update_by) VALUES(#{companyName,jdbcType=VARCHAR},#{companySlogan,jdbcType=VARCHAR},#{numberOfCompanies,jdbcType=BIGINT},#{financingScale,jdbcType=INTEGER},#{city,jdbcType=VARCHAR},#{area,jdbcType=VARCHAR},#{companyIndustry,jdbcType=INTEGER}, #{companyLogo,jdbcType=VARCHAR},#{companyProfile,jdbcType=VARCHAR},#{companyTag,jdbcType=VARCHAR},#{isApprove,jdbcType=INTEGER},#{isFrozen,jdbcType=INTEGER},#{gmtCreate,jdbcType=BIGINT},#{gmtUpdate,jdbcType=BIGINT},#{createBy,jdbcType=VARCHAR}, #{updateBy,jdbcType=VARCHAR})")
    //@Options(useGeneratedKeys = true, keyProperty = "company_id", keyColumn = "company_id")/*增加这个注解插入记录后会返回自增长的id*/
    //public void insertCompanyInfo() {
    //    CompanyInfo companyInfo = new CompanyInfo();
    //    CompanyInfo2 companyInfo2 = new CompanyInfo2();
    //    int i = companyInfoMapper.insertCompanyInfo("西安诚邦企业管理咨询有限公司", "西安诚邦企业管理咨询有限公司", 5000l, 5, "天津市", "怀安区", 3, "http://aliyunuploadphoto.oss-cn-shenzhen.aliyuncs.com/3.jpg", "指企业的组织形式。以营利为目的的社团法人。在资本主义社会获得高度发展。我国在建国后对私营公司进行了社会主义改造。国营工、商、建筑、运输等部门中实行独立经济核算的经营管理组织和某些城市中按行业划分的专业管理机构，也通称公司。随着我国经济体制的改革，享有法人资格的各种公司纷纷设立，按章程从事自身的生产经营活动。", "五险一金", 1, 0, 1537367472203l, 1537367472203l, "小米1", "晓明2");
    //    Long companyId = companyInfo.getCompanyId();
    //    Long companyId2 = companyInfo2.getCompanyId();
    //    System.out.println("--------------------------");
    //    System.out.println(companyId);
    //    System.out.println(companyId2);
    //}

    // TODO: 2018/11/9 更新公司信息
    //@Test
    //public void updateCompanyById(){
    //    int a=companyInfoMapper.updateCompanyById(1,)
    //}

    @Test
    public void selectPosition(){
        //System.out.println(positionInfoMapper.qureyOnePosition(17l,5l));
        //System.out.println(positionServiceImpl.updatePositionInfoByPositionIid(9l,1));
     Long a= new Date().getTime();
        System.out.println(a);
    }


}
