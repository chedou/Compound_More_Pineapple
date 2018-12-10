package com.jnshu.uaaservice.pojo;

import org.codehaus.jackson.map.annotate.*;

import java.io.*;

@JsonSerialize
public class UserRole implements Serializable {

	private static final long serialVersionUID = -1428285660796168326L;

	private Integer id;

	private Long userId;

	private Long roleId;

	private Long gmtCreate;

	private Long gmtUpdate;

	private String createBy;

	private String updateBy;

	public UserRole(Integer id, Long userId, Long roleId, Long gmtCreate, Long gmtUpdate, String createBy, String updateBy) {
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
		this.gmtCreate = gmtCreate;
		this.gmtUpdate = gmtUpdate;
		this.createBy = createBy;
		this.updateBy = updateBy;
	}

	public UserRole() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
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