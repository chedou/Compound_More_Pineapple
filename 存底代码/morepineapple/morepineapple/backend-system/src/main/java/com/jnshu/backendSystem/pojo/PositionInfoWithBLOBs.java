package com.jnshu.backendSystem.pojo;

public class PositionInfoWithBLOBs extends PositionInfo {
    private String companyId;

    private String onlineTime;

    public PositionInfoWithBLOBs(Long positionId, Integer isRecommend, String positionName, String companyName, Integer workExperience, Integer education, Integer salary, Integer positionType, String positionTag, String positionlevel, String postDuties, String skills, String welfare, Integer isOnline, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy, String companyId, String onlineTime) {
        super(positionId, isRecommend, positionName, companyName, workExperience, education, salary, positionType, positionTag, positionlevel, postDuties, skills, welfare, isOnline, gmtCreate, gmtUpdate, createBy, updateBy);
        this.companyId = companyId;
        this.onlineTime = onlineTime;
    }

    public PositionInfoWithBLOBs() {
        super();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime == null ? null : onlineTime.trim();
    }
}