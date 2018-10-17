package com.jnshu.backendSystem.pojo;

public class Permission {
    private Integer id;

    private String permissionName;

    private Integer inNew;

    private Integer inEdit;

    private Integer inDelete;

    private Long gmtCreate;

    private Long gmtUpdate;

    private String createBy;

    private String updateBy;

    public Permission(Integer id, String permissionName, Integer inNew, Integer inEdit, Integer inDelete, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
        this.id = id;
        this.permissionName = permissionName;
        this.inNew = inNew;
        this.inEdit = inEdit;
        this.inDelete = inDelete;
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

    public Integer getInNew() {
        return inNew;
    }

    public void setInNew(Integer inNew) {
        this.inNew = inNew;
    }

    public Integer getInEdit() {
        return inEdit;
    }

    public void setInEdit(Integer inEdit) {
        this.inEdit = inEdit;
    }

    public Integer getInDelete() {
        return inDelete;
    }

    public void setInDelete(Integer inDelete) {
        this.inDelete = inDelete;
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