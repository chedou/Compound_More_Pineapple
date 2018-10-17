package com.jnshu.backendSystem.web.login;

import com.github.pagehelper.*;
import com.jnshu.backendSystem.Service.*;
import com.jnshu.backendSystem.core.ret.*;
import com.jnshu.backendSystem.pojo.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.*;

/**
 * @program: morepineapple
 * @description: UserController
 * @author: Mr.huang
 * @create: 2018-10-14 14:57
 **/

@RestController
@RequestMapping("user")
@Api(tags = {"后台登录接口"}, description = "user")
public class UserContro {

	@Resource
	private UserService userService;

	@ApiOperation(value = "查询用户", notes = "根据用户ID查询用户")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "用户ID", required = true,
					dataType = "Long", paramType = "query")
	})
	@PostMapping("/selectById")
	public RetResult<User> selectById(Long id){
		User user = userService.selectByPrimaryKey(id);
		return RetResponse.makeOKRsp(user);
	}
	@ApiOperation(value = "查询用户", notes = "分页查询用户所有")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "当前页码",
					dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "size", value = "每页显示条数",
					dataType = "Integer", paramType = "query")
	})
	@PostMapping("/selectAll")
	public RetResult<PageInfo<User>> selectAll(@RequestParam(defaultValue = "0") Integer page,
											   @RequestParam(defaultValue = "0") Integer size) {
		PageInfo<User> pageInfo = userService.selectAll(page, size);


		return RetResponse.makeOKRsp(pageInfo);

	}

}
