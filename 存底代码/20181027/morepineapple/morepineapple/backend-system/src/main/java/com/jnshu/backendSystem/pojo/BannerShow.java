package com.jnshu.backendSystem.pojo;

import com.fasterxml.jackson.databind.annotation.*;

import java.io.*;

@JsonSerialize
public class BannerShow implements Serializable {

    private static final long serialVersionUID = -1428285660796168326L;

    private Long id;

    private Integer type;

    private String tilesName;

    private String photo;

    private Integer isOnline;

    private String jumpUrl;

    private Integer industryType;

    private Long onlineTime;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    public BannerShow(Long id, Integer type, String tilesName, String photo, Integer isOnline, String jumpUrl, Integer industryType, Long onlineTime, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
        this.id = id;
        this.type = type;
        this.tilesName = tilesName;
        this.photo = photo;
        this.isOnline = isOnline;
        this.jumpUrl = jumpUrl;
        this.industryType = industryType;
        this.onlineTime = onlineTime;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
        this.createBy = createBy;
        this.updateBy = updateBy;
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

    public Long getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Long onlineTime) {
        this.onlineTime = onlineTime;
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

    public BannerShow( int i){

        Long [] idArray = {0L, 1L, 2L, 3L, 4L, 5L};
        Integer[] typeArray = {1, 2, 1, 2, 1, 1};
        String[] tilesNameArray = {"行业大图", "行业小图", "作诗大图", "mini小图", "情景大图", "服饰大图"};
        String[] photoArray = {
              "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937493885.jpg",
                "https://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937514815.jpg",
                "https://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937504457.jpg",
                "https://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937524858.jpg",
                "https://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937530398.jpg",
                "https://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937507905.jpg"
        };
        Integer[] isOnlineArray ={0, 1, 1, 0, 1, 1};
        String[] jumpUrlArray ={
                "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937493885.jpg",
                "https://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937514815.jpg",
                "https://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937504457.jpg",
                "https://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937524858.jpg",
                "https://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937530398.jpg",
                "https://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937507905.jpg"
        };
        Integer[] industryTypeArray ={1, 2, 1, 3, 1, 1};
        Long[] onlineTimeArray ={1212L, 212121L, 312323L, 121212L, 423423123L, 121423123L};
        Long[] gmtCreateArray ={12313134123L, 13212312L, 1212123243242L, 5454545L, 45454545L, 563343434L};
        Long[] gmtUpdateArray ={1212323L, 456454L, 67676767L, 78787L, 23354L, 235343L};
        String[] createByArray ={"admin", "super", "admin", "admin", "super", "super"};
        String[] updateByArray ={"super", "admin", "admin", "super", "super", "admin"};


        this.id = idArray[i];
        this.type = typeArray[i];
        this.tilesName = tilesNameArray[i];
        this.photo = photoArray[i];
        this.jumpUrl = jumpUrlArray[i];
        this.industryType = industryTypeArray[i];
        this.onlineTime = onlineTimeArray[i];
        this.isOnline = isOnlineArray[i];
        this.gmtCreate = gmtCreateArray[i];
        this.gmtUpdate = gmtUpdateArray[i];
        this.createBy = createByArray[i];
        this.updateBy = updateByArray[i];
    }

    @Override
    public String toString() {
        return "BannerShow{" +
                "id=" + id +
                ", type=" + type +
                ", tilesName='" + tilesName + '\'' +
                ", photo='" + photo + '\'' +
                ", isOnline=" + isOnline +
                ", jumpUrl='" + jumpUrl + '\'' +
                ", industryType=" + industryType +
                ", onlineTime=" + onlineTime +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }

    public BannerShow(BannerShow bannerShow){

        this.id = bannerShow.getId();
        this.type = bannerShow.getType();
        this.tilesName = bannerShow.getTilesName();
        this.photo = bannerShow.getPhoto();
        this.jumpUrl = bannerShow.getJumpUrl();
        this.industryType = bannerShow.getIndustryType();
        this.onlineTime = bannerShow.getOnlineTime();
        this.isOnline = bannerShow.getIsOnline();

    }



}