package com.jnshu.backendSystem.web.fakeData.role;

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
 * @description: 用户角色管理模块
 * @author: Mr.huang
 * @create: 2018-10-26 09:59
 **/

@RestController
@RequestMapping("/duoboluo")
@Api(tags = {"Role角色管理"}, description = "测试Role角色管理")
public class RoleManageContro {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * @param [pageUtil]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @description 获取角色列表
	 * @author Mr.HUANG
	 * @date 2018/10/26
	 */
	@ApiOperation(value = "获取角色列表", notes = "获取角色列表")
	@PostMapping("/a/role/list")
	public RetResult<?> roleList(PageUtil pageUtil) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("pageUtil:" + pageUtil);

		// 模拟数据库
		List<Role> roleBase = new ArrayList<>();
		for (int i = 1; i < 30; ++i) {
			roleBase.add(new Role(new Random().nextInt(5) + 1));
		}

		if ("".equals(pageUtil.getSize()) || (pageUtil.getSize() == null)) {
			pageUtil.setSize(10);
		}
		if ("".equals(pageUtil.getPage()) || (pageUtil.getPage() == null)) {
			pageUtil.setSize(1);
		}

		List<Role> roleList = new ArrayList<>();

		for (int i = 0; i < pageUtil.getSize(); ++i) {
			System.out.println(i);
			System.out.println("-----开始1---------");

			// 返回的用户
			Role roleReturn = new Role();
			// 临时的用户
			Role roleTem = roleBase.get(i);

			roleReturn.setId(roleTem.getId());
			roleReturn.setRoleName(roleTem.getRoleName());
			roleReturn.setGmtCreate(roleTem.getGmtCreate());
			roleReturn.setGmtUpdate(roleTem.getGmtUpdate());
			roleReturn.setCreateBy(roleTem.getCreateBy());
			roleReturn.setUpdateBy(roleTem.getUpdateBy());

			roleList.add(roleReturn);
			System.out.println("-----结束1---------");
		}

		pageUtil.setTotal(roleBase.size());
		System.out.println("获取职位列表成功");

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("roleList", roleList);
		resultMap.put("pageUtil", pageUtil);

		return RetResponse.result(RetCode.SUCCESS_ROLE_LIST_GET).setData(resultMap);

	}

	/**
	 * @param [roleName, method]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @description 添加角色信息
	 * @author Mr.HUANG
	 * @date 2018/10/26
	 */
	@ApiOperation(value = "增加角色信息", notes = "增加角色信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "roleName", value = "用户角色信息", required = true,
					dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "method", value = "权限名", required = true,
					dataType = "String", paramType = "query")
	})
	@PostMapping("/a/role")
	public RetResult<?> userAdd(@RequestParam String roleName, @RequestParam String[] method) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("roleName:" + roleName);
		logger.info("method:" + JSONArray.toJSON(method));

		return RetResponse.result(RetCode.SUCCESS_ROLE_ONE_ADD);
	}


	/**
	 * @description 编辑端个Role角色信息
	 * @param [id, roleName, method]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/26
	 */
	@ApiOperation(value = "编辑role信息", notes = "编辑role信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "roleName", value = "用户角色信息", required = false,
					dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "method", value = "权限名", required = false,
					dataType = "String", paramType = "query")
	})
	@PutMapping("/a/role/{id}")
	public RetResult<?> roleUpdate(@PathVariable Integer id, @RequestParam(required = false) String roleName, @RequestParam(required = false) String[] method) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("id:" + id);
		logger.info("roleName:" + roleName);
		logger.info("method:" + JSONArray.toJSON(method));

		System.out.println("更新职位信息成功");

		return RetResponse.result(RetCode.SUCCESS_ROLE_ONE_UPDATE);
	}


	/**
	 * @description 删除单个role信息
	 * @param [id]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/26
	 */
	@ApiOperation(value = "删除单个role信息", notes = "删除单个role信息")
	@DeleteMapping("/a/role/{id}")
	public RetResult<?> roleDelete(@PathVariable(required = true) Long id) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("id" + id);

		System.out.println(id);
		if (id == null) {
			return RetResponse.result(RetCode.ROLE_ID_NO_EXIST);
		}

		System.out.println("删除对应的职位信息成功");
		return RetResponse.result(RetCode.SUCCESS_ROLE_ONE_DELETE);
	}


	/**
	 * @description 获取单个角色信息
	 * @param [id]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/26
	 */
	@ApiOperation(value = "获取单个角色信息", notes = "获取单个角色信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "角色ID", required = true,
					type = "int", paramType = "path")
	})
	@GetMapping("/a/role/{id}")
	public RetResult<?> getRole(@PathVariable Integer id) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("id:" + id);

		// 模拟数据库
		List<Role> roleBase = new ArrayList<>();
		for (int i = 1; i < 30; ++i) {
			roleBase.add(new Role(new Random().nextInt(6)));
		}

		Role roleReturn = new Role();
		for (Role roleTem : roleBase) {
			if (roleTem.getId().equals(id)) {

				roleReturn.setId(roleTem.getId());
				roleReturn.setPermissionList(roleTem.getPermissionList());

				System.out.println("查询单个公司信息成功");
				HashMap<String, Object> resultMap = new HashMap<>();
				resultMap.put("role", roleReturn);

				return RetResponse.result(RetCode.SUCCESS_ROLE_ONE_GET).setData(resultMap);
			}
		}

		return RetResponse.result(RetCode.ROLE_ID_NO_EXIST);

	}

}
