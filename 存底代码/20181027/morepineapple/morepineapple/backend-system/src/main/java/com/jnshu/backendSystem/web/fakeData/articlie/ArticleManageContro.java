package com.jnshu.backendSystem.web.fakeData.articlie;

import com.alibaba.fastjson.*;
import com.jnshu.backendSystem.core.ret.*;
import com.jnshu.backendSystem.core.utils.*;
import com.jnshu.backendSystem.core.vo.*;
import com.jnshu.backendSystem.pojo.*;
import io.swagger.annotations.*;
import org.slf4j.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @program: morepineapple
 * @description: banner图管理
 * @author: Mr.huang
 * @create: 2018-10-23 17:02
 **/
@RestController
@RequestMapping("/duoboluo")
@Api(tags = {"Article管理"}, description = "测试 Article管理假数据")
public class ArticleManageContro {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	/**
	 * @param {[tilesName, isOnline, type, createBy, createAtStart, createAtEnd, pageUtil]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @description 获取banner图列表
	 * @author Mr.HUANG
	 * @date 2018/10/24
	 */
	@ApiOperation(value = "获取banner图的列表", notes = "获取banner图的列表")
	@ApiImplicitParams({
			// @ApiImplicitParam(name = "tilesName", value = "标题名字", required = false,
			// 		dataType = "String", paramType = "query"),
			// @ApiImplicitParam(name = "isOnline", value = "状态", required = false,
			// 		dataType = "int", paramType = "query"),
			// @ApiImplicitParam(name = "type", value = "类型", required = false,
			// 		dataType = "int", paramType = "query"),
			// @ApiImplicitParam(name = "createBy", value = "创建者", required = false,
			// 		dataType = "String", paramType = "query"),
			// @ApiImplicitParam(name = "createAtStart", value = "创建开始时间", required = false,
			// 		dataType = "Long", paramType = "query"),
			// @ApiImplicitParam(name = "createAtEnd", value = "创建结束时间", required = false,
			// 		dataType = "Long", paramType = "query")
			@ApiImplicitParam(name = "accountVo", value = "banner图参数", required = false,
					dataType = "Accoun tVo", paramType = "body")
	})
	@PostMapping("/a/banner/list")
	public RetResult<?> bannerList(
			// @RequestParam(required = false) String tilesName,
			// @RequestParam(required = false) Integer isOnline,
			// @RequestParam(required = false) Integer type,
			// @RequestParam(required = false) String createBy,
			// @RequestParam(required = false) Long createAtStart,
			// @RequestParam(required = false) Long createAtEnd,
			// PageUtil pageUtil
			@RequestBody AccountVo accountVo) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info(accountVo.toString());

		// 模拟数据库
		List<BannerShow> bannerShowsBase = new ArrayList<>();
		for (int i = 1; i < 30; ++i) {
			bannerShowsBase.add(new BannerShow(new Random().nextInt(6)));
		}

		System.out.println(accountVo.getPageUtil().toString());

		if ("".equals(accountVo.getPageUtil().getSize()) || (accountVo.getPageUtil().getSize() == null)) {
			accountVo.getPageUtil().setSize(10);
			System.out.println("size:修改成功");
		}
		if ("".equals(accountVo.getPageUtil().getPage()) || (accountVo.getPageUtil().getPage() == null)) {
			accountVo.getPageUtil().setSize(1);
			System.out.println("page:修改成功");
		}

		// 返回 bannershoow 的清单
		List<BannerShow> bannerShowsList = new ArrayList<>();

		// 遍历并将需要返回的参数返回
		for (int i = 0; i < accountVo.getPageUtil().getSize(); ++i) {
			System.out.println(i);
			BannerShow bannerShowReturn = new BannerShow();
			BannerShow bannerShowTem = bannerShowsBase.get(i);

			bannerShowReturn.setPhoto(bannerShowTem.getPhoto());
			bannerShowReturn.setTilesName(bannerShowTem.getTilesName());
			bannerShowReturn.setType(bannerShowTem.getType());
			bannerShowReturn.setCreateBy(bannerShowTem.getCreateBy());
			bannerShowReturn.setGmtCreate(bannerShowTem.getGmtCreate());
			bannerShowReturn.setGmtUpdate(bannerShowTem.getGmtUpdate());
			bannerShowReturn.setIsOnline(bannerShowTem.getIsOnline());

			bannerShowsList.add(bannerShowReturn);
		}

		accountVo.getPageUtil().setTotal(bannerShowsBase.size());
		System.out.println("获取banner图列表成功");

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("bannerShow", bannerShowsList);
		resultMap.put("pageUtil", accountVo.getPageUtil());
		return RetResponse.result(RetCode.SUCCESS_BANNER_SHOW_LIST_GET).setData(resultMap);
	}

	/**
	 * @param [bannerShow]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @description 新增单个banner图信息
	 * @author Mr.HUANG
	 * @date 2018/10/24
	 */
	@ApiOperation(value = "增加单个banner信息", notes = "增加单个banner信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "bannerShow", value = "banner详细参数", required = true,
					dataType = "BannerShow", paramType = "body")
	})
	@PostMapping("/a/banner")
	public RetResult<?> addBannerShow(@RequestBody BannerShow bannerShow) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("bannerShow:" + JSON.toJSONString(bannerShow));

		System.out.println(bannerShow.toString());
		System.out.println("新增职位信息成功");
		return RetResponse.result(RetCode.SUCCESS_BANNER_SHOW_ONE_ADD);
	}

	/**
	 * @description 获取单个职位信息 
	 * @param [id] 
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?> 
	 * @author Mr.HUANG
	 * @date 2018/10/26 
	 */ 
	@ApiOperation(value = "获取单个职位信息", notes = "获取单个职位薪资")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "banner图的ID", required = true,
					type = "Long", paramType = "path")
	})
	@GetMapping("/a/banner/{id}")
	public RetResult<?> getBannerShow(@PathVariable Long id) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("id:" + id);

		// 模拟数据库
		List<BannerShow> bannerShowsBase = new ArrayList<>();
		for (int i = 1; i < 30; ++i) {
			bannerShowsBase.add(new BannerShow(new Random().nextInt(6)));
		}

		BannerShow bannerShowReturn = new BannerShow();
		for (BannerShow bannerShowTem : bannerShowsBase) {
			if (bannerShowTem.getId().equals(id)) {

				bannerShowReturn.setId(bannerShowTem.getId());
				bannerShowReturn.setType(bannerShowTem.getType());
				bannerShowReturn.setTilesName(bannerShowTem.getTilesName());
				bannerShowReturn.setJumpUrl(bannerShowTem.getJumpUrl());
				bannerShowReturn.setPhoto(bannerShowTem.getPhoto());
				bannerShowReturn.setIsOnline(bannerShowTem.getIsOnline());
				bannerShowReturn.setIndustryType(bannerShowTem.getIndustryType());

				System.out.println("查询单个公司信息成功");
				HashMap<String, Object> resultMap = new HashMap<>();
				resultMap.put("bannerShow", bannerShowReturn);

				return RetResponse.result(RetCode.SUCCESS_BANNER_SHOW_ONE_GET).setData(resultMap);
			}
		}

		return RetResponse.result(RetCode.BANNER_SHOW_NO_EXIST);

	}

	/**
	 * @param {[bannerShow]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @description 更新单个banner图信息
	 * @author Mr.HUANG
	 * @date 2018/10/24
	 */
	@ApiOperation(value = "编辑Banner信息", notes = "编辑Banner信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "bannerShow", value = "Banner相关信息", required = true,
					dataType = "BannerShow", paramType = "body")
	})
	@PutMapping("/a/banner")
	public RetResult<?> bannerShowUpdate(@RequestBody BannerShow bannerShow) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("bannerShow:" + JSON.toJSONString(bannerShow));

		BannerShow bannerShowReturn = new BannerShow(bannerShow);
		System.out.println(bannerShowReturn.toString());

		System.out.println("更新职位信息成功");

		return RetResponse.result(RetCode.SUCCESS_BANNER_SHOW_ONE_UPDATE);
	}


	/**
	 * @param {[positionID]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @description 删除单个banner图信息
	 * @author Mr.HUANG
	 * @date 2018/10/24
	 */
	@ApiOperation(value = "删除单个banner信息", notes = "删除单个banner信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "banner ID", required = true,
					dataType = "Long", paramType = "path")
	})
	@DeleteMapping("/a/banner/{id}")
	public RetResult<?> positionInfoDelete(@PathVariable(required = true) Long id) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("id" + id);


		System.out.println(id);
		if (id == null) {
			return RetResponse.result(RetCode.BANNER_SHOW_ID_NO_EXIST);
		}

		System.out.println("删除对应的职位信息成功");
		return RetResponse.result(RetCode.SUCCESS_BANNER_SHOW_ONE_DELETE);
	}


	/**
	 * @param {[id, isOnline]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @description 更改banner上线状态
	 * @author Mr.HUANG
	 * @date 2018/10/24
	 */
	@ApiOperation(value = "更改banner上线状态", notes = "更改banner上线状态")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "banner图ID", required = true,
					dataType = "Long", paramType = "path"),
			@ApiImplicitParam(name = "isOnline", value = "上线状态", required = true,
					dataType = "int", paramType = "query")
	})
	@PutMapping("/a/banner/online/{id}")
	public RetResult<?> bannerShowOnlineUpdate(@PathVariable Long id, @RequestParam int isOnline) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("id:" + id);
		logger.info("isOnline:" + isOnline);

		System.out.println("id:" + id);
		System.out.println("isOnline:" + isOnline);

		System.out.println("更改banner上线状态新成功");
		return RetResponse.result(RetCode.SUCCESS_BANNER_SHOW_ONE_ONLINE_UPDATE);
	}


	/**
	 * @param [oldIdArray, newIdArray]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @description 拖动排序更新
	 * @author Mr.HUANG
	 * @date 2018/10/24
	 */
	@ApiOperation(value = "更改banner排序", notes = "通过拖动更改banner排序")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "accountVo", value = "AccountVo", required = true,
					dataType = "AccountVo", paramType = "body")

	})
	@PostMapping("/a/banner/order")
	public RetResult<?> bannerOrder(@RequestBody AccountVo accountVo) {

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("oldIdArray:" + JSON.toJSONString(accountVo.getOldIdArray()));
		logger.info("newIdArray:" + JSON.toJSONString(accountVo.getNewIdArray()));

		System.out.println("banner 顺序更新成功");
		return RetResponse.result(RetCode.SUCCESS_BANNER_SHOW_OLDER_UPDATE);
	}


}
