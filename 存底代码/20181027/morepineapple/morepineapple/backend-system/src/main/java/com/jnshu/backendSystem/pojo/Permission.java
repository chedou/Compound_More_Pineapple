package com.jnshu.backendSystem.pojo;
import com.fasterxml.jackson.databind.annotation.*;

import java.io.*;


@JsonSerialize
public class Permission implements Serializable {

    private static final long serialVersionUID = 7556487324951964429L;

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

    public Permission(int i){
        Integer[] idArray = {1, 2, 3, 4, 5, 6};
        String[] permissionNameArray ={"AccountAdd", "AccountUpdate","AccountDelete" ,
                "PasswordAdd" ,"RoleAll" ,"ModuleAll" };
        Long[] gmtCreateArray = {1000000L, 2222222222L, 33333333333L, 444444444L, 55555555555L, 6666666666L};
        Long[] gmtUpdateArray = {111111111L, 2232323232L, 333333232323L, 45434343434L, 551434432423L, 654656565L} ;
        String[] createByArray = {"admin", "super", "admin", "super", "admin", "admin"};
        String[] updateByArray = {"super", "admin", "super", "admin", "admin", "super"};

        this.id = idArray[i];
        this.permissionName = permissionNameArray[i];
        this.gmtCreate = gmtCreateArray[i];
        this.gmtUpdate = gmtUpdateArray[i];
        this.createBy = createByArray[i];
        this.updateBy = updateByArray[i];
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
}