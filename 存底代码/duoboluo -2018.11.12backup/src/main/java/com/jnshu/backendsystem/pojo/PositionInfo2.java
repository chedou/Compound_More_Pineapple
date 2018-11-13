package com.jnshu.backendsystem.pojo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class PositionInfo2 implements Serializable{
    private static final long serialVersionUID = -8242142814250581632L;
    /**
    * @Description:
    * @Author: Sometimes
    * @Date:
     * | isRecommend     | 是否推荐 | int    | 是       | 0：未认证不推荐<br> 1:已认证推荐 |
    | positionType     | 职位类型 | int | 否       |                                  |
    | education       | 学历     | int    | 否       |                                  |
    | city            | 城市     | String | 否       |                                  |
    | area            | 区县     | String | 否       |                                  |
    | companyIndustry | 公司行业 | int    | 否       |                                  |
    | workExperience  | 工作经验 | int    | 否       |                                  |
    | salary          | 薪资水平 | int    | 否       |                                  |
    | releaseTime     | 发布时间 | int    | 否       |                                  |
    | page            | 页码     | int    | 是       |                                  |
    | size            | 页长     | int    | 是       | -                                |
    */

    // TODO: 2018/11/3  还差发布时间   releaseTime 没有放进去
    private Long positionId;

    private Integer isRecommend;

    private String positionName;

    private Long companyId;

    private String companyName;

    private int[] workExperience;

    private int[] education;

    private int[] salary;

    private int[] positionType;

    private String positionTag;

    private String positionlevel;

    private String postDuties;

    private String skills;

    private String welfare;

    private Long onlineTime;

    private Integer isOnline;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    private List<CompanyInfo> companyInfos;

    public List<CompanyInfo> getCompanyInfos() {
        return companyInfos;
    }

    public void setCompanyInfos(List<CompanyInfo> companyInfos) {
        this.companyInfos = companyInfos;
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
        this.positionName = positionName;
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

    public int[] getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int[] workExperience) {
        this.workExperience = workExperience;
    }

    public int[] getEducation() {
        return education;
    }

    public void setEducation(int[] education) {
        this.education = education;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "PositionInfo2{" +
                "positionId=" + positionId +
                ", isRecommend=" + isRecommend +
                ", positionName='" + positionName + '\'' +
                ", companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", workExperience=" + Arrays.toString(workExperience) +
                ", education=" + Arrays.toString(education) +
                ", salary=" + Arrays.toString(salary) +
                ", positionType=" + Arrays.toString(positionType) +
                ", positionTag='" + positionTag + '\'' +
                ", positionlevel='" + positionlevel + '\'' +
                ", postDuties='" + postDuties + '\'' +
                ", skills='" + skills + '\'' +
                ", welfare='" + welfare + '\'' +
                ", onlineTime=" + onlineTime +
                ", isOnline=" + isOnline +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", companyInfos=" + companyInfos +
                '}';
    }

    public int[] getPositionType() {
        return positionType;
    }

    public void setPositionType(int[] positionType) {
        this.positionType = positionType;
    }

    public String getPositionTag() {
        return positionTag;
    }

    public void setPositionTag(String positionTag) {
        this.positionTag = positionTag;
    }

    public String getPositionlevel() {
        return positionlevel;
    }

    public void setPositionlevel(String positionlevel) {
        this.positionlevel = positionlevel;
    }

    public String getPostDuties() {
        return postDuties;
    }

    public void setPostDuties(String postDuties) {
        this.postDuties = postDuties;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
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
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
