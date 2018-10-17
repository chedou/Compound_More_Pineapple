package com.jnshu.backendSystem.pojo;

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


    public CompanyInfo(Long companyId, String companyName, String companySlogan, Long numberOfCompanies, Integer financingScale, String city, String area, Integer companyIndustry, String companyLogo, String companyProfile, String companyTag, Integer isApprove, Integer isFrozen, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
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
}