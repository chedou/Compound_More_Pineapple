package com.jnshu.backendSystem.pojo;
import com.fasterxml.jackson.databind.annotation.*;

import java.io.*;
@JsonSerialize
public class PositionInfo implements Serializable {

    private static final long serialVersionUID = -5762576548914525593L;

    private Long positionId;

    private Integer isRecommend;

    private String positionName;

    private Long companyId;

    private String companyName;

    private Integer workExperience;

    private Integer education;

    private Integer salary;

    private Integer positionType;

    private String positionTag;

    private Integer positionlevel;

    private String postDuties;

    private String skills;

    private String welfare;

    private Long onlineTime;

    private Integer isOnline;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    // private PageUtil pageUtil;

    public PositionInfo(PositionInfo positionInfo) {
        this.positionId = positionInfo.getPositionId();
        this.isRecommend = positionInfo.getIsRecommend() ;
        this.positionName = positionInfo.getPositionName();
        this.companyId = positionInfo.getCompanyId();
        this.companyName = positionInfo.getCompanyName();
        this.workExperience = positionInfo.getWorkExperience();
        this.education = positionInfo.getEducation();
        this.salary = positionInfo.getSalary();
        this.positionType = positionInfo.getPositionType();
        this.positionTag = positionInfo.getPositionTag();
        this.positionlevel = positionInfo.getPositionlevel();
        this.postDuties = positionInfo.getPostDuties();
        this.skills = positionInfo.getSkills();
        this.welfare = positionInfo.getWelfare();
        this.onlineTime = positionInfo.getOnlineTime();
        this.isOnline = positionInfo.getIsOnline();
        // this.gmtCreate = positionInfo.getGmtCreate();
        // this.gmtUpdate = positionInfo.getGmtUpdate();
        // this.createBy = positionInfo.getCreateBy();
        // this.updateBy = positionInfo.getUpdateBy();

    }



    public PositionInfo(Long positionId, Integer isRecommend, String positionName,
                        Long companyId, String companyName, Integer workExperience,
                        Integer education, Integer salary, Integer positionType,
                        String positionTag, Integer positionlevel, String postDuties,
                        String skills, String welfare, Long onlineTime, Integer isOnline,
                        Long gmtCreate, Long gmtUpdate, String createBy, String updateBy
                        // PageUtil pageUtil
    ) {
        this.positionId = positionId;
        this.isRecommend = isRecommend;
        this.positionName = positionName;
        this.companyId = companyId;
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
        this.onlineTime = onlineTime;
        this.isOnline = isOnline;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
        this.createBy = createBy;
        this.updateBy = updateBy;
        // this.pageUtil = pageUtil;
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

    public Integer getPositionlevel() {
        return positionlevel;
    }

    public void setPositionlevel(int positionlevel) {
        this.positionlevel = positionlevel;
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

    public Long getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Long onlineTime) {
        this.onlineTime = onlineTime;
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

    // public PageUtil getPageUtil() {
    //     return pageUtil;
    // }
	//
    // public void setPositionlevel(Integer positionlevel) {
    //     this.positionlevel = positionlevel;
    // }

    // 假数据构造函数

    public PositionInfo(int i){

        Long[] positionIdArray = {1L, 2L, 3L, 4L, 5L, 6L};
        int[] isRecommendArray ={1,0,1,1,1,0};
        String[] positionNameArray = {"JAVA工程师","前端工程师","测试","产品经理","全栈工程师","信息安全工程师"};
        Long[] companyIdArray = {1L,3L,2L,4L,1L,2L};
        String[] companyNameArray = {"卓越亚马逊","京东","当当","天猫","卓越亚马逊","京东"};
        int[] workExperienceArray = {1,1,3,2,4,5};
        int[] educationArray = {1,0,2,3,0,5};
        int[] salaryArray = {1,0,2,0,3,1};
        int[] positionTypeArray = {0,2,1,3,0,5};
        String[] positionTagArray = {"国企背景-五险一金-双休", "国企背景-五险一金-单双休", "国企背景-五险一弹性调休",
                "国企背景-五险一金-节假日福利", "国企背景-单休", "国企背景-年度旅游"};

        Integer[] positionlevelArray = {1, 0, 1, 3, 2, 4};
        String[] postDutiesArray = {"认真负责","按时完成任务","高效工作","理解客户需求","坚守岗位","认真刻苦"};
        String[] skillsArray = {"Maven", "Spring", "IDEA", "MySQL", "GitHub", "SVN"};
        String[] welfareArray = {"五险一金", "调休", "双休", "单双休", "节假日福利", "甲苯补贴"};
		Long[] onlineTimeArray = {1L, 10L, 1L, 40L, 11L, 111L};
		int[] isOnlineArray = { 1, 0, 1, 0, 1, 1};
		Long[] gmtCreateArray = {1000000L, 2222222222L, 33333333333L, 444444444L, 55555555555L, 6666666666L};
		Long[] gmtUpdateArray = {111111111L, 2232323232L, 333333232323L, 45434343434L, 551434432423L, 654656565L};
		String[] createByArray = {"admin", "super", "admin", "super", "admin", "admin"};
		String[] updateByArray = {"super", "admin", "super", "admin", "admin", "super"};

		this.positionId = positionIdArray[i];
		this.isRecommend = isRecommendArray[i];
		this.positionName = positionNameArray[i];
		this.companyId = companyIdArray[i];
		this.companyName = companyNameArray[i];
		this.workExperience = workExperienceArray[i];
		this.education = educationArray[i];
		this.salary = salaryArray[i];
		this.positionType = positionTypeArray[i];
		this.positionTag = positionTagArray[i];
		this.positionlevel = positionlevelArray[i];
		this.postDuties = postDutiesArray[i];
		this.skills = skillsArray[i];
		this.welfare = welfareArray[i];
		this.onlineTime = onlineTimeArray[i];
		this.isOnline = isOnlineArray[i];
		this.gmtCreate = gmtCreateArray[i];
		this.gmtUpdate = gmtUpdateArray[i];
		this.createBy = createByArray[i];
		this.updateBy = updateByArray[i];

    }

    @Override
    public String toString() {
        return "PositionInfo{" +
                "positionId=" + positionId +
                ", isRecommend=" + isRecommend +
                ", positionName='" + positionName + '\'' +
                ", companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", workExperience=" + workExperience +
                ", education=" + education +
                ", salary=" + salary +
                ", positionType=" + positionType +
                ", positionTag='" + positionTag + '\'' +
                ", positionlevel=" + positionlevel +
                ", postDuties='" + postDuties + '\'' +
                ", skills='" + skills + '\'' +
                ", welfare='" + welfare + '\'' +
                ", onlineTime=" + onlineTime +
                ", isOnline=" + isOnline +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}