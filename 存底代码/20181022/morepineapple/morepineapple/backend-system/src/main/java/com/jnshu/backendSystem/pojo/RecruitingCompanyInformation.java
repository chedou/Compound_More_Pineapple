package com.jnshu.backendSystem.pojo;

import java.util.*;

public class RecruitingCompanyInformation {
    private Long id;

    private Long companyId;

    private String phone;

    private String email;

    private String adress;

    private String map;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    public RecruitingCompanyInformation(Long id, Long companyId, String phone, String email, String adress, String map, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
        this.id = id;
        this.companyId = companyId;
        this.phone = phone;
        this.email = email;
        this.adress = adress;
        this.map = map;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
        this.createBy = createBy;
        this.updateBy = updateBy;
    }

    public RecruitingCompanyInformation(RecruitingCompanyInformation c ) {
        this.id = c.getId();
        this.companyId = c.getCompanyId();
        this.phone = c.getPhone();
        this.email = c.getEmail();
        this.adress = c.getAdress();
        this.map = c.getMap();
        this.gmtCreate = c.getGmtCreate();
        this.gmtUpdate = c.getGmtUpdate();
        this.createBy = c.getCreateBy();
        this.updateBy = c.getUpdateBy();
    }

    public RecruitingCompanyInformation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map == null ? null : map.trim();
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

    // 构造函数
    public RecruitingCompanyInformation (int number){
        if (number == 1 ){
            this.id = 1L;
            this.companyId = 1L;
            this.phone = "0049941788788";
            this.email = "notice@amazon.com";
            this.adress = "美国华盛顿州西雅图";
            this.map = "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/153593749719.jpg";
            this.gmtCreate = System.currentTimeMillis() + new Random().nextInt(10 ) + 1 ;
            this.gmtUpdate = System.currentTimeMillis();
            this.createBy = "super";
            this.updateBy = "admin";
        }else if (number ==2 ){
            this.id = 2L;
            this.companyId = 2L;
            this.phone = "0527-80878888";
            this.email = "service@cs.dangdang.com";
            this.adress = "北京市朝阳区安外大街208号三利大厦4楼";
            this.map = "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937527210.jpg";
            this.gmtCreate = System.currentTimeMillis() + new Random().nextInt(10 ) + 1 ;
            this.gmtUpdate = System.currentTimeMillis();
            this.createBy = "admin";
            this.updateBy = "admin";
        }else if (number ==3 ) {
            this.id = 3L;
            this.companyId = 3L;
            this.phone = "1400-606-5500";
            this.email = "service@jd.com";
            this.adress = "北京市科创十一街与经海路交汇处东";
            this.map = "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937504457.jpg";
            this.gmtCreate = System.currentTimeMillis() + new Random().nextInt(10 ) + 1 ;
            this.gmtUpdate = System.currentTimeMillis();
            this.createBy = "rol";
            this.updateBy = "admin";
        }else if (number ==4){
            this.id = 4L;
            this.companyId = 4L;
            this.phone = "0571-85026880";
            this.email = "1070800888@qq.com";
            this.adress = "浙江省杭州市余杭区文一西路969号阿里巴巴西溪园区";
            this.map = "http://radish-more-pineapple.oss-cn-beijing.aliyuncs.com/backendSystem/photo/1535937469732.jpg";
            this.gmtCreate = System.currentTimeMillis();
            this.gmtUpdate = System.currentTimeMillis();
            this.createBy = "rol";
            this.updateBy = "admin";
        }
    }

}