package com.jnshu.resourceservice.dao;

import com.jnshu.resourceservice.entity.*;
import org.junit.*;
import org.junit.runner.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {
	private final org.slf4j.Logger logger =LoggerFactory.getLogger(this.getClass());

	@Autowired(required = false)
	private UserMapper userMapper;

	@Test
	public void findByUsername() {
		logger.info("-------------------------");
		logger.info("根据用户名测试获取单个角色权限关联信息");

		User user = userMapper.findByUsername("cheodu");
		System.out.println(user);
		// System.out.println(user.toString());

		logger.info("-------------------------");
		if (user.getAuthorities() != null){
			logger.info("getAuthorities 不为null");
			System.out.println("1212");
			System.out.println(user.getAuthorities().toString());

		}
	}

	@Test
	public void selectUserDetailById() {
		logger.info("-------------------------");
		logger.info("根据用户名测试获取单个角色权限关联信息");

		User user = userMapper.selectUserDetailById(1);
		System.out.println(user);
		// System.out.println(user.toString());

		logger.info("-------------------------");
		if (user.getAuthorities() != null){
			logger.info("getAuthorities 不为null");
			System.out.println("1212");
			System.out.println(user.getAuthorities().toString());

		}
	}
}