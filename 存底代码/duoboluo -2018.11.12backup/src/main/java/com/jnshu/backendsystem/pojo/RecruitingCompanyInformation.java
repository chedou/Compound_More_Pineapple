package com.jnshu.backendsystem.pojo;

import com.fasterxml.jackson.databind.annotation.*;

import java.io.*;
import java.util.*;

@JsonSerialize
public class RecruitingCompanyInformation implements Serializable {

    private static final long serialVersionUID = 4565394660352093925L;

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

    @Override
    public String toString() {
        return "RecruitingCompanyInformation{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", map='" + map + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
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
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
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