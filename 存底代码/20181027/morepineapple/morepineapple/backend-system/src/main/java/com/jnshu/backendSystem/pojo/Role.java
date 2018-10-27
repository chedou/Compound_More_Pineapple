package com.jnshu.backendSystem.pojo;

import com.fasterxml.jackson.databind.annotation.*;

import java.io.*;
import java.util.*;

@JsonSerialize
public class Role implements Serializable {

    private static final long serialVersionUID = -5349444458012755664L;

    private Integer id;

    private String roleName;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    private List<Permission> permissionList;

    public Role(Integer id, String roleName, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy, List<Permission> permissionList) {
        this.id = id;
        this.roleName = roleName;
        this.gmtCreate = gmtCreate;
        this.gmtUpdate = gmtUpdate;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.permissionList = permissionList;
    }

    public Role(int i){
        Integer[] idArray = {1, 2, 3, 4, 5, 6};
        String[] roleNameArray ={"admin", "super","man" ,"women" ,"real" ,"min" };
        Long[] gmtCreateArray = {1000000L, 2222222222L, 33333333333L, 444444444L, 55555555555L, 6666666666L};
        Long[] gmtUpdateArray = {111111111L, 2232323232L, 333333232323L, 45434343434L, 551434432423L, 654656565L} ;
        String[] createByArray = {"admin", "super", "admin", "super", "admin", "admin"};
        String[] updateByArray = {"super", "admin", "super", "admin", "admin", "super"};


        this.id = idArray[i];
        this.roleName = roleNameArray[i];
        this.gmtCreate = gmtCreateArray[i];
        this.gmtUpdate = gmtUpdateArray[i];
        this.createBy = createByArray[i];
        this.updateBy = updateByArray[i];

        List<Permission> permissionList = new ArrayList<>();
        Permission permissionOne = new Permission(1);
        Permission permissionTwo= new Permission(2);

        permissionList.add(permissionOne);
        permissionList.add(permissionTwo);

        this.permissionList = permissionList;
    }

    public Role() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", permissionList=" + permissionList +
                '}';
    }
}