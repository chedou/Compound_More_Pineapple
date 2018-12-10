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
public class PermissionMapperTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired(required = false)
	PermissionMapper permissionMapper;

	@Test
	public void deleteByPrimaryKey() {
		logger.info("-------------------------");
		logger.info("测试删除单个权限信息");
		permissionMapper.deleteByPrimaryKey(27);
	}

	@Test
	public void insert() {
		logger.info("-------------------------");
		logger.info("测试插入单个权限信息");

		Permission permission = new Permission();
		permission.setPermissionName("Test");
		permission.setCreateBy("admin");
		permission.setUpdateBy("admin");
		permission.setGmtCreate(System.currentTimeMillis());
		permission.setGmtUpdate(System.currentTimeMillis());

		permissionMapper.insert(permission);
	}

	@Test
	public void insertSelective() {
	}

	@Test
	public void selectByPrimaryKey() {
		logger.info("-------------------------");
		logger.info("测试根据ID查询单个权限");
		Permission permission = permissionMapper.selectByPrimaryKey(1);
		System.out.println(permission.toStringAll());
	}

	@Test
	public void updateByPrimaryKeySelective() {
		logger.info("-------------------------");
		logger.info("测试更改单个权限信息");

		Permission permission = new Permission();
		permission.setId(28);
		permission.setCreateBy("super");
		permission.setGmtCreate(System.currentTimeMillis());
		permission.setGmtUpdate(System.currentTimeMillis());
		permissionMapper.updateByPrimaryKeySelective(permission);
	}

	@Test
	public void updateByPrimaryKey() {

	}
}