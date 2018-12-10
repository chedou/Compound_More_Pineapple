package com.jnshu.uaaservice.service;

import com.jnshu.uaaservice.dao.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;

/**
 * @program: purview
 * @description: 用户详情服务
 * @author: Mr.huang
 * @create: 2018-12-06 09:17
 **/
@Service
public class UserServiceDetail implements UserDetailsService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userMapper.findByUsername(username);
	}
}
