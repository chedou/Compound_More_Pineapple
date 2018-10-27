package com.jnshu.backendSystem.web.fakeData.account;

import com.alibaba.fastjson.*;
import com.jnshu.backendSystem.core.ret.*;
import com.jnshu.backendSystem.core.utils.*;
import com.jnshu.backendSystem.pojo.*;
import io.swagger.annotations.*;
import org.slf4j.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @program: morepineapple
 * @description: 用户账号管理模块
 * @author: Mr.huang
 * @create: 2018-10-25 19:09
 **/
@RestController
@RequestMapping("/duoboluo")
@Api(tags = {"Accout管理"}, description = "测试 Account 管理假数据")
public class AccoutManageContro {

	private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * @description 读取用户列表
	 * @param [roleId, name, pageUtil]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/26
	 */
	@ApiOperation(value = "获取用户列表", notes = "获取用户列表")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "roleId", value = "角色id", required = false,
					dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "name", value = "用户名", required = false,
					dataType = "String", paramType = "query")

	})
	@PostMapping("/a/user/list")
	public RetResult<?> accountList(@RequestParam(required = false) Long roleId,
									@RequestParam(required = false) String name,
									PageUtil pageUtil) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("roleId:" + roleId);
		logger.info("name:" + name);
		logger.info("pageUtil:" + pageUtil);

		// 模拟数据库
		List<User> userBase = new ArrayList<>();
		for (int i = 1; i < 30; ++i) {
			userBase.add(new User(new Random().nextInt(3) + 1));
		}

		if ("".equals(pageUtil.getSize()) || (pageUtil.getSize() == null)) {
			pageUtil.setSize(10);
		}
		if ("".equals(pageUtil.getPage()) || (pageUtil.getPage() == null)) {
			pageUtil.setSize(1);
		}

		List<User> userList = new ArrayList<>();

		for (int i = 0; i < pageUtil.getSize(); ++i) {
			System.out.println(i);
			System.out.println("-----开始1---------");

			// 返回的用户
			User userReturn = new User();
			// 临时的用户
			User userTem = userBase.get(i);

			userReturn.setId(userTem.getId());
			userReturn.setName(userTem.getName());
			// Role role =new Role();

			System.out.println("---------------分割线------------");
			// 返回的数据
			List<Role> roleReturnList = new ArrayList<>();
			// 临时中转的数据
			List<Role> roleTemList = userTem.getRolesList();

			for (int a = 0; a < roleTemList.size(); ++a) {

				Role roleTem = roleTemList.get(a);
				Role returnRole = new Role();
				returnRole.setRoleName(roleTem.getRoleName());
				roleReturnList.add(returnRole);
				System.out.println("==========================");

			}
			userReturn.setRolesList(roleReturnList);
			userReturn.setGmtCreate(userTem.getGmtCreate());
			userReturn.setGmtUpdate(userTem.getGmtUpdate());
			userReturn.setCreateBy(userTem.getCreateBy());
			userReturn.setUpdateBy(userTem.getUpdateBy());
			System.out.println(userReturn.toString());
			userList.add(userReturn);
			System.out.println("-----结束1---------");
		}

		pageUtil.setTotal(userBase.size());
		System.out.println("获取职位列表成功");

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("userList", userList);
		resultMap.put("pageUtil", pageUtil);

		return RetResponse.result(RetCode.SUCCESS_USER_LIST_GET).setData(resultMap);

	}

	/**
	 * @description 增加用户信息
	 * @param [user]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/26
	 */
	@ApiOperation(value = "增加单个用户信息", notes = "增加单个用户信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "user", value = "用户详细信息", required = true,
					dataType = "User", paramType = "body")
	})
	@PostMapping("/a/user")
	public RetResult<?> userAdd(@RequestBody User user) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("user:" + JSON.toJSONString(user));

		return RetResponse.result(RetCode.SUCCESS_USER_ONE_ADD);
	}


	/**
	 * @description 更改单个用户信息
	 * @param [user]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/26
	 */
	@ApiOperation(value = "编辑User用户信息", notes = "编辑User用户信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "user", value = "user用户相关信息", required = true,
					dataType = "User", paramType = "body")
	})
	@PutMapping("/a/user")
	public RetResult<?> userUpdate(@RequestBody User user) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("user:" + JSON.toJSONString(user));

		System.out.println("更新职位信息成功");
		return RetResponse.result(RetCode.SUCCESS_USER_ONE_UPDATE);
	}

	/**
	 * @description 删除单个用户信息
	 * @param [id] 
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?> 
	 * @author Mr.HUANG
	 * @date 2018/10/26 
	 */ 
	@ApiOperation(value = "删除单个user信息", notes = "删除单个user信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "userID", required = true,
					dataType = "Long", paramType = "path")
	})
	@DeleteMapping("/a/user/{id}")
	public RetResult<?> userDelete(@PathVariable(required = true) Long id) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("id" + id);

		if (id == null) {
			return RetResponse.result(RetCode.USER_ID_NO_EXIST);
		}

		System.out.println("删除对应的职位信息成功");
		return RetResponse.result(RetCode.SUCCESS_USER_ONE_GET);
	}


	/**
	 * @description 获取单个用户信息
	 * @param [id]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/26
	 */
	@ApiOperation(value = "获取单个user信息", notes = "获取单个user信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "user的id", required = true,
					type = "Long", paramType = "path")
	})
	@GetMapping("/a/user/{id}")
	public RetResult<?> getUser(@PathVariable Long id) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("id:" + id);

		// 模拟数据库
		List<User> userBase = new ArrayList<>();
		for (int i = 1; i < 30; ++i) {
			userBase.add(new User(new Random().nextInt(3) + 1));
		}

		User userReturn = new User();
		for (User userTem : userBase) {
			if (userTem.getId().equals(id)) {

				userReturn.setName(userTem.getName());
				userReturn.setPhoneNum(userTem.getPhoneNum());
				userReturn.setHeadImage(userTem.getHeadImage());

				System.out.println("查询单个公司信息成功");
				HashMap<String, Object> resultMap = new HashMap<>();
				resultMap.put("user", userReturn);

				return RetResponse.result(RetCode.SUCCESS_BANNER_SHOW_ONE_GET).setData(resultMap);
			}
		}

		return RetResponse.result(RetCode.USER_ID_NO_EXIST);

	}

	/**
	 * @description 用户密码修改 
	 * @param [id, oldPassword, newPassword] 
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?> 
	 * @author Mr.HUANG
	 * @date 2018/10/26 
	 */ 
	@ApiOperation(value = "User密码修改", notes = "User密码修改")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "user用户ID", required = true,
					dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "oldPassword", value = "user用户旧密码", required = true,
					dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "newPassword", value = "user用户新密码", required = true,
					dataType = "String", paramType = "query")
	})
	@PutMapping("/a/user/password")
	public RetResult<?> passwordUpdate(@RequestParam Long id, @RequestParam String oldPassword, @RequestParam String  newPassword ) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("id:" + id);
		logger.info("oldPassword:" + oldPassword);
		logger.info("newPassword:" + newPassword );

		System.out.println("更新职位信息成功");
		return RetResponse.result(RetCode.SUCCESS_USER_PASSWORD_UPDATE);
	}

	/**
	 * @description 用户获取短信验证码 
	 * @param                               
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?> 
	 * @author Mr.HUANG
	 * @date 2018/10/26 
	 */ 
	@ApiOperation(value = "获取短信验证码", notes = "获取短信验证码")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "用户id", required = true,
					dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "phoneNum", value = "用户手机号码", required = true,
					dataType = "String", paramType = "query")
	})
	@PostMapping("/a/verification")
	public RetResult<?> userAdd(@RequestParam Long id, @RequestParam String phoneNum) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("id:" + id);
		logger.info("phoneNum:" + phoneNum);

		return RetResponse.result(RetCode.SUCCESS_VERIFICATION_GET);
	}
}
