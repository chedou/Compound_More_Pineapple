package com.jnshu.backendSystem.web.fakeData.position;

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
 * @description: 职位相关信息
 * @author: Mr.huang
 * @create: 2018-10-22 16:11
 **/
@RestController
@RequestMapping("/duoboluo")
@Api(tags = {"信息管理-职位"}, description = "测试内容管理职位信息模块假数据")
public class PositionManageContro {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	/**
	 * @description 获取职位信息列表
	 * @param {[positionInfo, pageUtil]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/23
	 */
	@ApiOperation(value = "获取职位列表" ,notes = "获取职位列表信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "positionInfo" ,value = "职位的搜索条件", required = false,
					dataType = "PositionInfo", paramType = "body")
	})
	@PostMapping("/a/position/list")
	public RetResult<?> positionInfoList(@RequestBody PositionInfo positionInfo, PageUtil pageUtil){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("positionInfo:" + JSON.toJSONString(positionInfo));
		logger.info("pageUtils:" + JSON.toJSONString(pageUtil));


		// 模拟数据库
		List<PositionInfo> positionsBase = new ArrayList<>();
		for (int i =1; i < 30; ++i){
			positionsBase.add(new PositionInfo(new Random().nextInt(6)));
		}

		if ("".equals(pageUtil.getSize()) || (pageUtil.getSize() == null)){
			pageUtil.setSize(10);
		}
		if ("".equals(pageUtil.getPage()) || (pageUtil.getPage() == null)){
			pageUtil.setSize(1);
		}

		System.out.println(pageUtil.toString());
		// 返回的职位清单
		List<PositionInfo> positionInfoList = new ArrayList<>();

		// 遍历并将需要的参数返回
		for (int i = 0; i < pageUtil.getSize(); ++i){
			System.out.println(i);
			PositionInfo positionInfoReturn = new PositionInfo();
			PositionInfo positionInfoTem = positionsBase.get(i);

			positionInfoReturn.setCompanyId(positionInfoTem.getCompanyId());
			positionInfoReturn.setCompanyName(positionInfoTem.getCompanyName());
			positionInfoReturn.setPositionId(positionInfoTem.getPositionId());
			positionInfoReturn.setPositionName(positionInfoTem.getPositionName());
			positionInfoReturn.setPositionType(positionInfoTem.getPositionType());
			positionInfoReturn.setSalary(positionInfoTem.getSalary());
			positionInfoReturn.setEducation(positionInfoTem.getEducation());
			positionInfoReturn.setWorkExperience(positionInfoTem.getWorkExperience());
			positionInfoReturn.setGmtUpdate(positionInfoTem.getGmtUpdate());
			positionInfoReturn.setIsOnline(positionInfoTem.getIsOnline());
			positionInfoReturn.setIsRecommend(positionInfoTem.getIsRecommend());

			positionInfoList.add(positionInfoReturn);
		}

		System.out.println(JSON.toJSONString(positionInfoList).toCharArray());
		pageUtil.setTotal(positionsBase.size());
		System.out.println("获取职位列表成功");

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("positionInfoList", positionInfoList);
		resultMap.put("pageUtil", pageUtil);

		return RetResponse.result(RetCode.SUCCESS_POSITION_LIST_GET).setData(resultMap);
	}



	/**
	 * @description 新增职位信息
	 * @param {positionInfo}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/23
	 */
	@ApiOperation(value = "增加单个职位信息", notes = "增加单个职位信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "positionInfo", value = "职位详细参数", required = true,
			 		dataType = "PositionInfo", paramType = "body")
	})
	@PostMapping("/a/position")
	public RetResult<?> addPosition(@RequestBody PositionInfo positionInfo){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("positionInfo:" + JSON.toJSONString(positionInfo));

		System.out.println(positionInfo.toString());
		System.out.println("新增职位信息成功");
		return RetResponse.result(RetCode.SUCCESS_POSITION_ADD);
	}


	/**
	 * @description  获取单个职位信息
	 * @param {[positionID]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/23
	 */
	@ApiOperation(value = "获取单个职位信息", notes = "获取单个职位薪资")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "positionID", value = "职位信息ID", required = true,
					type = "Long", paramType = "path")
	})
	@GetMapping("/a/position/{positionID}")
	public RetResult<?> getPosition(@PathVariable Long positionID){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("positionID:" + positionID);

		// 模拟数据库
		List<PositionInfo> positionsBase = new ArrayList<>();
		for (int i =1; i < 30; ++i){
			positionsBase.add(new PositionInfo(new Random().nextInt(6)));
		}

		PositionInfo positionInfoReturn = new PositionInfo();
		for (PositionInfo positionInfoTem : positionsBase) {
			if (positionInfoTem.getCompanyId().equals(positionID)) {


				positionInfoReturn.setCompanyId(positionInfoTem.getCompanyId());
				positionInfoReturn.setCompanyName(positionInfoTem.getCompanyName());

				positionInfoReturn.setPositionId(positionInfoTem.getPositionId());
				positionInfoReturn.setPositionName(positionInfoTem.getPositionName());
				positionInfoReturn.setWorkExperience(positionInfoTem.getWorkExperience());
				positionInfoReturn.setSalary(positionInfoTem.getSalary());
				positionInfoReturn.setEducation(positionInfoTem.getEducation());
				positionInfoReturn.setPositionType(positionInfoTem.getPositionType());
				positionInfoReturn.setWelfare(positionInfoTem.getWelfare());
				positionInfoReturn.setPostDuties(positionInfoTem.getPostDuties());
				positionInfoReturn.setSkills(positionInfoTem.getSkills());
				positionInfoReturn.setPositionTag(positionInfoTem.getPositionTag());
				positionInfoReturn.setIsOnline(positionInfoTem.getIsOnline());
				positionInfoReturn.setIsRecommend(positionInfoTem.getIsRecommend());

				System.out.println("查询单个公司信息成功");

				HashMap<String, Object> resultMap = new HashMap<>();
				resultMap.put("positionInfo",positionInfoTem);

				return RetResponse.result(RetCode.SUCCESS_POSITION_GET).setData(resultMap);
			}
		}

		return RetResponse.result(RetCode.POSITION_ID_NO_EXIST);
	}

	/**
	 * @description  更新职位信息
	 * @param {[positionInfo]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/23
	 */
	@ApiOperation(value = "编辑职位信息", notes = "对职位信息更新")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "positionInfo", value = "职位相关信息", required = true,
					dataType = "PositionInfo", paramType = "body")
	})
	@PutMapping("/a/position")
	public RetResult<?> positionUpdate(@RequestBody PositionInfo positionInfo){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("positionInfo:" + JSON.toJSONString(positionInfo));

		System.out.println(positionInfo.toString());

		System.out.println("更新职位信息成功");

		return RetResponse.result(RetCode.SUCCESS_POSITION_UPDATE);
	}


	/**
	 * @description 删除对应的职位信息
	 * @param {[positionID]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/23
	 */
	@ApiOperation(value = "删除单个公司信息", notes = "根据职位ID删除对应的职位信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "positionId", value = "职位ID", required = true,
				dataType = "Long", paramType = "path")
	})
	@DeleteMapping("a/position/{positionId}")
	public RetResult<?> positionInfoDelete(@PathVariable(required = true) Long positionId){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("positionID:" + positionId);

		System.out.println(positionId);
		if (positionId == null){
			return RetResponse.result(RetCode.POSITION_ID_NO_EXIST);
		}

		System.out.println("删除对应的职位信息成功");
		return RetResponse.result(RetCode.SUCCESS_POSITION_DELETE);
	}

	/**
	 * @description  更高职位上线状态
	 * @param {[positionID, isOnline]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/23
	 */
	@ApiOperation(value = "更改职位上线状态", notes = "更改职位上线状态")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "positionId", value = "职位ID", required = true,
					dataType = "Long", paramType = "path"),
			@ApiImplicitParam(name = "isOnline", value = "上线状态", required = true,
					dataType = "int", paramType = "query")
	})
	@PutMapping("/a/position/online/{positionId}")
	public RetResult<?> positionOnlineUpdate(@PathVariable Long positionId, @RequestParam Integer isOnline){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("positionID:" + positionId);
		logger.info("isOnline:" + isOnline);

		System.out.println("positionID:" + positionId );
		System.out.println("isOnline:" + isOnline );

		return RetResponse.result(RetCode.SUCCESS_POSITION_IS_ONLINE_UPDATE);
	}


	/**
	 * @description 更改职位推荐状态
	 * @param {[positionID, isRecommend]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/23
	 */
	@ApiOperation(value = "更改职位推荐状态", notes = "更改职位推荐状态")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "positionId", value = "职位ID", required = true,
					dataType = "Long", paramType = "path"),
			@ApiImplicitParam(name = "isRecommend", value = "推荐状态", required = true,
					dataType = "int", paramType = "query")
	})
	@PutMapping("/a/position/recommend/{positionId}")
		public RetResult<?> positionRecommend(@PathVariable Long positionId,@RequestParam Integer isRecommend){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("positionID:" + positionId);
		logger.info("isRecommend:" + isRecommend);

		System.out.println("positionID:" + positionId );
		System.out.println("isRecommend:" + isRecommend );

		return RetResponse.result(RetCode.SUCCESS_POSITION_IS_RECOMMEND_UPDATE);
	}

}
