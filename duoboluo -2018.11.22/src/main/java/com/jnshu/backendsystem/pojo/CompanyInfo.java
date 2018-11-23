package com.jnshu.backendsystem.pojo;


import java.io.Serializable;
import java.util.List;

public class CompanyInfo implements Serializable {
    private static final long serialVersionUID = 8673363077783926141L;

    private Integer numberOfPositions;

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

    private List<PositionInfo> positionInfos;
    private List<CompanyProduce> companyProduces;
    private List<RecruitingCompanyInformation> recruitingCompanyInformations;

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "numberOfPositions=" + numberOfPositions +
                ", companyId=" + companyId +
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
                ", positionInfos=" + positionInfos +
                ", companyProduces=" + companyProduces +
                ", recruitingCompanyInformations=" + recruitingCompanyInformations +
                '}';
    }

    public List<RecruitingCompanyInformation> getRecruitingCompanyInformations() {
        return recruitingCompanyInformations;
    }

    public void setRecruitingCompanyInformations(List<RecruitingCompanyInformation> recruitingCompanyInformations) {
        this.recruitingCompanyInformations = recruitingCompanyInformations;
    }

    public List<CompanyProduce> getCompanyProduces() {
        return companyProduces;
    }

    public void setCompanyProduces(List<CompanyProduce> companyProduces) {
        this.companyProduces = companyProduces;
    }

    public List<PositionInfo> getPositionInfos() {
        return positionInfos;
    }

    public void setPositionInfos(List<PositionInfo> positionInfos) {
        this.positionInfos = positionInfos;
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
        this.companyName = companyName;
    }

    public String getCompanySlogan() {
        return companySlogan;
    }

    public void setCompanySlogan(String companySlogan) {
        this.companySlogan = companySlogan;
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
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
        this.companyLogo = companyLogo;
    }

    public String getCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }

    public String getCompanyTag() {
        return companyTag;
    }

    public void setCompanyTag(String companyTag) {
        this.companyTag = companyTag;
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
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getNumberOfPositions() {
        return numberOfPositions;
    }

    public void setNumberOfPositions(Integer numberOfPositions) {
        this.numberOfPositions = numberOfPositions;
    }

}