package com.jnshu.backendSystem.web.fakeData.login;

import com.jnshu.backendSystem.core.ret.*;
import com.jnshu.backendSystem.pojo.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.*;
import java.util.*;

/**
 * @program: morepineapple
 * @description: 后台登录
 * @author: Mr.huang
 * @create: 2018-10-19 17:02
 **/
@RestController
@RequestMapping("/duoboluo")
@Api(tags = {"后台登录、登出接口"} ,description = "测试登录登出的假数据")
public class LoginManageContro {

	/**
	 * @description  登录验证接口
	 * @param password, password
	 * @return com.jnshu.backendSystem.core.ret.RetResult<com.jnshu.backendSystem.pojo.User>
	 * @author Mr.HUANG
	 * @date 2018/10/20
	 */
	@ApiOperation(value = "登录", notes = "用户登录验证")
	@ApiImplicitParams({

			@ApiImplicitParam(name = "username", value = "用户名（例如：张三）",
					required = true, dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "password",value = "用户密码(例如：123456)",
					required =true ,dataType = "String",paramType = "query")
	})
	@PostMapping("/login")
	public RetResult<?> login (@RequestParam @Null String username , @RequestParam @Null String password) {

		// 生成假数据
		List<User> userList = new ArrayList<>();
		userList.add(new User(1));
		userList.add(new User(2));
		userList.add(new User(3));
		userList.add(new User(4));

		// 登录的用户信息
		User loginUser;

		for (User anUserList : userList) {
			loginUser = anUserList;
			if (loginUser.getName().equals(username) && loginUser.getPassword().equals(password)) {
				return RetResponse.result(RetCode.SUCCESS, loginUser);
			}
		}
		return RetResponse.result(RetCode.USER_LOGIN_ERROR);
	}

	/**
	 * @description  登出
	 * @param  userID
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/20
	 */
	@ApiOperation(value = "登出", notes = "用户退出登录")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "userID",value = "用户的ID(例如：1)", required = true,
					dataType = "Long", paramType = "query")
	})
	@PostMapping("/a/signOut")
	public RetResult<?> logOut(@RequestParam("userID") @NotNull Long userID){
		// 生成假数据
		List<User> userList = new ArrayList<>();
		userList.add(new User(1));
		userList.add(new User(2));
		userList.add(new User(3));
		userList.add(new User(4));
		System.out.println("传入的值：" + userID);

		for (User anUserList : userList) {
			User loginUser = anUserList;
			if (loginUser.getId().equals(userID)) {
				return RetResponse.result(RetCode.SUCCESS);
			}
		}
		return RetResponse.result(RetCode.USER_LOGIN_OUT_ERROR);
	}
}





