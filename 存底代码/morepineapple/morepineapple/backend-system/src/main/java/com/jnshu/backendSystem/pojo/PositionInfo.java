package com.jnshu.backendSystem.pojo;

public class PositionInfo {
    private Long positionId;

    private Integer isRecommend;

    private String positionName;

    private String companyName;

    private Integer workExperience;

    private Integer education;

    private Integer salary;

    private Integer positionType;

    private String positionTag;

    private String positionlevel;

    private String postDuties;

    private String skills;

    private String welfare;

    private Integer isOnline;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    public PositionInfo(Long positionId, Integer isRecommend, String positionName, String companyName, Integer workExperience, Integer education, Integer salary, Integer positionType, String positionTag, String positionlevel, String postDuties, String skills, String welfare, Integer isOnline, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
        this.positionId = positionId;
        this.isRecommend = isRecommend;
        this.positionName = positionName;
        this.companyName = companyName;
        this.workExperience = workExperience;
        this.education = education;
        this.salary = salary;
        this.positionType = positionType;
        this.positionTag = positionTag;
        this.positionlevel = positionlevel;
        this.postDuties = postDuties;
        this.skills = skills;
        this.welfare = welfare;
        this.isOnline = isOnline;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
        this.createBy = createBy;
        this.updateBy = updateBy;
    }

    public PositionInfo() {
        super();
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getPositionType() {
        return positionType;
    }

    public void setPositionType(Integer positionType) {
        this.positionType = positionType;
    }

    public String getPositionTag() {
        return positionTag;
    }

    public void setPositionTag(String positionTag) {
        this.positionTag = positionTag == null ? null : positionTag.trim();
    }

    public String getPositionlevel() {
        return positionlevel;
    }

    public void setPositionlevel(String positionlevel) {
        this.positionlevel = positionlevel == null ? null : positionlevel.trim();
    }

    public String getPostDuties() {
        return postDuties;
    }

    public void setPostDuties(String postDuties) {
        this.postDuties = postDuties == null ? null : postDuties.trim();
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills == null ? null : skills.trim();
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare == null ? null : welfare.trim();
    }

    public Integer getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
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
}