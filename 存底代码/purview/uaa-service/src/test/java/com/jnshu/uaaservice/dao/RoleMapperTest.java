package com.jnshu.uaaservice.dao;

import com.jnshu.uaaservice.pojo.*;
import org.junit.*;
import org.junit.runner.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.security.core.parameters.*;
import org.springframework.test.context.junit4.*;



@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleMapperTest {

	private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired(required = false)
	private RoleMapper roleMapper;

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

		Role role = roleMapper.selectByPrimaryKey(1);
		System.out.println(role);
	}

	@Test
	public void updateByPrimaryKeySelective() {
	}

	@Test
	public void updateByPrimaryKey() {
	}

	@Test
	public void selectRolePermissionById(){
		logger.info("-------------------------");
		logger.info("测试获取单个角色权限关联信息");

		Role role = roleMapper.selectRolePermissionById(1);
		System.out.println(role);
		System.out.println(role.getPermissionsList().toString());
		System.out.println(role.getPermissionsList().size());

		logger.info("-------------------------");
		Permission permission = role.getPermissionsList().get(0);
		System.out.println(permission.toStringAll());
		Permission permission1 = role.getPermissionsList().get(1);
		System.out.println(permission1.toStringAll());

	}

}