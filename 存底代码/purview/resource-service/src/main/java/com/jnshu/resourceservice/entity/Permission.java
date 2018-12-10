package com.jnshu.resourceservice.entity;

import com.fasterxml.jackson.databind.annotation.*;
import org.springframework.security.core.*;

import java.io.*;
/**
 * @description 权限实体类
 * @author Mr.HUANG
 * @date 2018/12/6
 */
@JsonSerialize
public class Permission implements GrantedAuthority, Serializable {

    private static final long serialVersionUID = -1428285660796168326L;

    private Integer id;

    private String permissionName;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    public Permission(Integer id, String permissionName, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
        this.id = id;
        this.permissionName = permissionName;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
        this.createBy = createBy;
        this.updateBy = updateBy;
    }

    public Permission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
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
    public String getAuthority() {
        return permissionName;
    }

    @Override
    public String toString() {
        return permissionName;
    }

    public String toStringAll() {
        return "Permission{" +
                "id=" + id +
                ", permissionName='" + permissionName + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }

}