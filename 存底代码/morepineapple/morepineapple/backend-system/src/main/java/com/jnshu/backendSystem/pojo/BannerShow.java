package com.jnshu.backendSystem.pojo;

/**
 * @description 轮番图
 * @param
 * @return
 * @author Mr.HUANG
 * @date 2018/10/14
 */
public class BannerShow {

    /**
     * @description 主键
     * @param
     * @return
     * @author Mr.HUANG
     * @date 2018/10/14
     */

    private Long id;

    private Integer type;

    private String tilesName;

    private String photo;

    private Integer isOnline;

    private String jumpUrl;

    private Integer industryType;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    private String onlineTime;

    public BannerShow(Long id, Integer type, String tilesName, String photo, Integer isOnline, String jumpUrl, Integer industryType, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy, String onlineTime) {
        this.id = id;
        this.type = type;
        this.tilesName = tilesName;
        this.photo = photo;
        this.isOnline = isOnline;
        this.jumpUrl = jumpUrl;
        this.industryType = industryType;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.onlineTime = onlineTime;
    }

    public BannerShow() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTilesName() {
        return tilesName;
    }

    public void setTilesName(String tilesName) {
        this.tilesName = tilesName == null ? null : tilesName.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl == null ? null : jumpUrl.trim();
    }

    public Integer getIndustryType() {
        return industryType;
    }

    public void setIndustryType(Integer industryType) {
        this.industryType = industryType;
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

    public String getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(String onlineTime) {
        this.onlineTime = onlineTime == null ? null : onlineTime.trim();
    }
}