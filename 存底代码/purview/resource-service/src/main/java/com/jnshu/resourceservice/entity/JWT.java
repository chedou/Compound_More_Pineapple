package com.jnshu.resourceservice.entity;

import com.fasterxml.jackson.databind.annotation.*;

import java.io.*;

/**
 * @program: purview
 * @description: jwt实体类
 * @author: Mr.huang
 * @create: 2018-12-05 23:44
 **/
@JsonSerialize
public class JWT implements Serializable {
	private static final long serialVersionUID = -1428285660796168326L;

	private String access_token;
	private String token_type;
	private String refresh_token;
	private int expires_in;
	private String scope;
	private String jti;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getJti() {
		return jti;
	}

	public void setJti(String jti) {
		this.jti = jti;
	}

	@Override
	public String toString() {
		return "JWT{" +
				"access_token='" + access_token + '\'' +
				", token_type='" + token_type + '\'' +
				", refresh_token='" + refresh_token + '\'' +
				", expires_in=" + expires_in +
				", scope='" + scope + '\'' +
				", jti='" + jti + '\'' +
				'}';
	}
}
