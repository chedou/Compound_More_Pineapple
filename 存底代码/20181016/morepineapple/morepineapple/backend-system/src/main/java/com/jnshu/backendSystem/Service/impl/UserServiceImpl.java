package com.jnshu.backendSystem.Service.impl;

import com.github.pagehelper.*;
import com.jnshu.backendSystem.Service.*;
import com.jnshu.backendSystem.dao.*;
import com.jnshu.backendSystem.pojo.*;
import org.springframework.stereotype.*;

import javax.annotation.*;
import java.util.*;

/**
 * @program: morepineapple
 * @description: 用户查询实现类
 * @author: Mr.huang
 * @create: 2018-10-14 14:54
 **/
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public User selectByPrimaryKey(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageInfo<User> selectAll(Integer page, Integer size) {
		//开启分页查询，写在查询语句上方
		//只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页。
		PageHelper.startPage(page, size);
		List<User> userInfoList = userMapper.selectAll();
		return new PageInfo<>(userInfoList);
	}

}
