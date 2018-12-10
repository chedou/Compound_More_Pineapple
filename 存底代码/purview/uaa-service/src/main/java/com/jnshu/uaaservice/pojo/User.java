package com.jnshu.uaaservice.pojo;

import org.codehaus.jackson.map.annotate.*;
import org.springframework.security.core.*;
import org.springframework.security.core.userdetails.*;

import java.io.*;
import java.util.*;

@JsonSerialize
public class User implements UserDetails, Serializable {

	private static final long serialVersionUID = -1428285660796168326L;

	private Long id;

	private String name;

	private String password;

	private String salt;

	private String phoneNum;

	private String headImage;

	private Long gmtCreate;

	private Long gmtUpdate;

	private String createBy;

	private String updateBy;

	private Integer status;

	private List<Role> roleList;

	private List<Permission> authorities;


	public User(Long id, String name, String password, String salt, String phoneNum, String headImage,
				Long gmtCreate, Long gmtUpdate, String createBy, String updateBy, Integer status
	) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.salt = salt;
		this.phoneNum = phoneNum;
		this.headImage = headImage;
		this.gmtCreate = gmtCreate;
		this.gmtUpdate = gmtUpdate;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.status = status;
	}


	public User() {
		super();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		List<Permission> permissionListTem = new ArrayList<>();
		for (Role aRoleList : roleList) {
			permissionListTem.addAll(aRoleList.getPermissionsList());
			authorities = permissionListTem;
		}
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	@Override
	public String getUsername() {
		return name;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt == null ? null : salt.trim();
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum == null ? null : phoneNum.trim();
	}

	public String getHeadImage() {
		return headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage == null ? null : headImage.trim();
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", salt='" + salt + '\'' +
				", phoneNum='" + phoneNum + '\'' +
				", headImage='" + headImage + '\'' +
				", gmtCreate=" + gmtCreate +
				", gmtUpdate=" + gmtUpdate +
				", createBy='" + createBy + '\'' +
				", updateBy='" + updateBy + '\'' +
				", status=" + status +
				", roleList=" + roleList +
				", authorities=" + authorities +
				'}';
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public void setAuthorities(List<Permission> authorities) {
		this.authorities = authorities;
	}

}