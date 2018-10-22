package com.jnshu.backendSystem.pojo;

import java.util.*;

public class CompanyInfo {

    private Long companyId;

    private String companyName;

    private String companySlogan;

    private Long numberOfCompanies;

    private Integer financingScale;

    private String city;

    private String area;

    private Integer companyIndustry;

    private String companyLogo;

    private String companyProfile;

    private String companyTag;
    private String[] companyTagArray;

    private Integer isApprove;

    private Integer isFrozen;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    private CompanyProduce companyProduce;

    private RecruitingCompanyInformation recruitingCompanyInformation;


    public CompanyInfo (CompanyProduce companyProduce){
        this.companyProduce = companyProduce;
    }

    public CompanyInfo (RecruitingCompanyInformation recruitingCompanyInformation){
        this.recruitingCompanyInformation = recruitingCompanyInformation;
    }
    public CompanyInfo(CompanyInfo c) {
        this.companyId = c.getCompanyId();
        this.companyName = c.getCompanyName();
        this.companySlogan = c.getCompanySlogan();
        this.numberOfCompanies = c.getNumberOfCompanies();
        this.financingScale = c.getFinancingScale();
        this.city = c.getCity();
        this.area = c.getArea();
        this.companyIndustry = c.getCompanyIndustry();
        this.companyLogo = c.getCompanyLogo();
        this.companyProfile = c.getCompanyProfile();
        this.companyTag = c.getCompanyTag();
        this.companyTagArray = c.getCompanyTagArray();
        this.isApprove = c.getIsApprove();
        this.isFrozen = c.getIsFrozen();
        this.gmtCreate = c.getGmtCreate();
        this.gmtUpdate = c.getGmtUpdate();
        this.createBy = c.getCreateBy();
        this.updateBy = c.getUpdateBy();

    }

    public CompanyInfo(Long companyId, String companyName, String companySlogan,
                       Long numberOfCompanies, Integer financingScale, String city, String area,
                       Integer companyIndustry, String companyLogo, String companyProfile,
                       String companyTag, Integer isApprove, Integer isFrozen, Long gmtCreate,
                       Long gmtUpdate, String createBy, String updateBy ,String[] CompanyTagArray) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companySlogan = companySlogan;
        this.numberOfCompanies = numberOfCompanies;
        this.financingScale = financingScale;
        this.city = city;
        this.area = area;
        this.companyIndustry = companyIndustry;
        this.companyLogo = companyLogo;
        this.companyProfile = companyProfile;
        this.companyTag = companyTag;
        this.companyTagArray = CompanyTagArray;
        this.isApprove = isApprove;
        this.isFrozen = isFrozen;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
        this.createBy = createBy;
        this.updateBy = updateBy;

    }

    public CompanyInfo() {
        super();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanySlogan() {
        return companySlogan;
    }

    public void setCompanySlogan(String companySlogan) {
        this.companySlogan = companySlogan == null ? null : companySlogan.trim();
    }

    public Long getNumberOfCompanies() {
        return numberOfCompanies;
    }

    public void setNumberOfCompanies(Long numberOfCompanies) {
        this.numberOfCompanies = numberOfCompanies;
    }

    public Integer getFinancingScale() {
        return financingScale;
    }

    public void setFinancingScale(Integer financingScale) {
        this.financingScale = financingScale;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Integer getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(Integer companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo == null ? null : companyLogo.trim();
    }

    public String getCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile == null ? null : companyProfile.trim();
    }

    public String getCompanyTag() {
        return companyTag;
    }

    public void setCompanyTag(String companyTag) {
        this.companyTag = companyTag == null ? null : companyTag.trim();
    }

    public Integer getIsApprove() {
        return isApprove;
    }

    public void setIsApprove(Integer isApprove) {
        this.isApprove = isApprove;
    }

    public Integer getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Long gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String[] getCompanyTagArray() {
        return companyTagArray;
    }

    public void setCompanyTagArray(String[] companyTagArray) {
        this.companyTagArray = companyTagArray;
    }

    public CompanyProduce getCompanyProduce() {
        return companyProduce;
    }

    public void setCompanyProduce(CompanyProduce companyProduce) {
        this.companyProduce = companyProduce;
    }

    public RecruitingCompanyInformation getRecruitingCompanyInformation() {
        return recruitingCompanyInformation;
    }

    public void setRecruitingCompanyInformation(RecruitingCompanyInformation recruitingCompanyInformation) {
        this.recruitingCompanyInformation = recruitingCompanyInformation;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companySlogan='" + companySlogan + '\'' +
                ", numberOfCompanies=" + numberOfCompanies +
                ", financingScale=" + financingScale +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", companyIndustry=" + companyIndustry +
                ", companyLogo='" + companyLogo + '\'' +
                ", companyProfile='" + companyProfile + '\'' +
                ", companyTag='" + companyTag + '\'' +
                ", companyTagArray='" + companyTagArray + '\'' +
                ", isApprove=" + isApprove +
                ", isFrozen=" + isFrozen +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", companyProduce=" + companyProduce +
                ", recruitingCompanyInformation=" + recruitingCompanyInformation +
                '}';
    }

    /**
     * @description  假数据构造函数
     * @param number
     * @return  函数实例
     * @author Mr.HUANG
     * @date
     */
    public CompanyInfo (int number){
        if (number == 1 ){
            this.companyId = 1L;
            this.companyName = "卓越亚马逊";
            this.companySlogan = "追呀追呀 不放纵";
            this.numberOfCompanies = 9999L;
            this.financingScale = 1;
            this.city = "1";
            this.area = "1";
            this.companyIndustry = 1;
            this.companyLogo = "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/head-photo/101913ldssd4d7ckc4l67c.jpg";
            this.companyProfile = "是Amazon.com在中国大陆的地区性网站，成立于2004年8月，总部位于北京。" ;
            this.companyTag = "大公司-大企业-卓越";
            this.companyTagArray = this.companyTag.split("-") ;
            this.isApprove = 1;
            this.isFrozen = 1;
            this.gmtCreate = System.currentTimeMillis() + new Random().nextInt(10) + 1;
            this.gmtUpdate = System.currentTimeMillis() ;
            this.createBy = "admin";
            this.updateBy = "admin";
            this.companyProduce = new CompanyProduce (1 );
            this.recruitingCompanyInformation = new RecruitingCompanyInformation( 1);
        }if (number == 2){
            this.companyId = 2L;
            this.companyName = "当当";
            this.companySlogan = "叮铃当当";
            this.numberOfCompanies = 8888L;
            this.financingScale = 2;
            this.city = "2";
            this.area = "2";
            this.companyIndustry = 2;
            this.companyLogo = "hhttp://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/head-photo/images.jpg";
            this.companyProfile = "当当是知名的综合性网上购物商城，由国内著名出版机构科文公司、美国老虎基金、美国IDG集团、" +
                    "卢森堡剑桥集团、亚洲创业投资基金（原名软银中国创业基金）共同投资成立。" ;
            this.companyTag = "大书店-大优惠-优惠多";
            this.companyTagArray = this.companyTag.split("-") ;
            this.isApprove = 0;
            this.isFrozen = 1;
            this.gmtCreate = System.currentTimeMillis() + new Random().nextInt(10) + 1;
            this.gmtUpdate = System.currentTimeMillis() ;
            this.createBy = "admin";
            this.updateBy = "admin";
            this.companyProduce = new CompanyProduce (2 );
            this.recruitingCompanyInformation = new RecruitingCompanyInformation( 2);
        }if (number ==3 ){
            this.companyId = 3L;
            this.companyName = "京东";
            this.companySlogan = "极速达 京准达";
            this.numberOfCompanies = 12999L;
            this.financingScale = 3;
            this.city = "2";
            this.area = "2";
            this.companyIndustry = 2;
            this.companyLogo = "hhttp://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/head-photo/images.jpg";
            this.companyProfile = "京东JD.COM-专业的综合网上购物商城，销售超数万品牌、4020万种商品，囊括家电、手机、电脑、母婴、" +
                    "服装等13大品类。秉承客户为先的理念，京东所售商品为正品行货、全国联保、机打发票。";
            this.companyTag = "211限时达-京准达-夜间配";
            this.companyTagArray = this.companyTag.split("-") ;
            this.isApprove = 0;
            this.isFrozen = 1;
            this.gmtCreate = System.currentTimeMillis() + new Random().nextInt(10) + 1;
            this.gmtUpdate = System.currentTimeMillis() ;
            this.createBy = "super";
            this.updateBy = "admin";
            this.companyProduce = new CompanyProduce (3 );
            this.recruitingCompanyInformation = new RecruitingCompanyInformation( 3);
        }if (number ==4){
            this.companyId = 4L;
            this.companyName = "天猫";
            this.companySlogan = "信用评价 七天无理由退换货";
            this.numberOfCompanies = 42999L;
            this.financingScale = 5;
            this.city = "1";
            this.area = "1";
            this.companyIndustry = 3;
            this.companyLogo = "hhttp://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/head-photo/images.jpg";
            this.companyProfile = "天猫 - 专业线上综合购物平台，全球消费者挚爱的品质购物之城！旨在引领中国消费者第一时" +
                    "间发现和体验全球化、更优质的生活方式，提前开启趋势中的理想生活！理想生活，上天猫！";
            this.companyTag = "正品保障-网上超市-七天无理由退换货";
            this.companyTagArray = this.companyTag.split("-") ;
            this.isApprove = 1;
            this.isFrozen = 1;
            this.gmtCreate = System.currentTimeMillis() + new Random().nextInt(10) + 1;
            this.gmtUpdate = System.currentTimeMillis() ;
            this.createBy = "super";
            this.updateBy = "admin";
            this.companyProduce = new CompanyProduce (4 );
            this.recruitingCompanyInformation = new RecruitingCompanyInformation( 4);
        }
    }

}
