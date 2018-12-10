package com.jnshu.uaaservice.dao;

import com.jnshu.uaaservice.pojo.*;
import org.junit.*;
import org.junit.runner.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RolePermissionMapperTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired(required = false)
	RolePermissionMapper rolePermissionMapper;

	@Test
	public void deleteByPrimaryKey() {
	}

	@Test
	public void insert() {
	}

	@Test
	public void insertSelective() {
	}

	@Test
	public void selectByPrimaryKey() {
		logger.info("-------------------------");
		logger.info("测试获取单个角色权限关联信息");

		RolePermission rolePermission = rolePermissionMapper.selectByPrimaryKey(1);
		System.out.println(rolePermission.toString());
	}

	@Test
	public void updateByPrimaryKeySelective() {
	}

	@Test
	public void updateByPrimaryKey() {
	}
}