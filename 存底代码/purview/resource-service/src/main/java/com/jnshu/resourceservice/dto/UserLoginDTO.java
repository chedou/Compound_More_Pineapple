package com.jnshu.resourceservice.dto;

import com.jnshu.resourceservice.entity.*;

/**
 * @program: purview
 * @description: 用户登录返回封装
 * @author: Mr.huang
 * @create: 2018-12-06 20:30
 **/
public class UserLoginDTO {
	private JWT jwt;

	private User user;

	public JWT getJwt() {
		return jwt;
	}

	public void setJwt(JWT jwt) {
		this.jwt = jwt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
