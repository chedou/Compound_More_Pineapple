package com.jnshu.backendSystem.web.fakeData.company;

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
 * @description: 信息管理-公司信息
 * @author: Mr.huang
 * @create: 2018-10-20 21:11
 **/

@RestController
@RequestMapping("/duoboluo")
@Api(tags = {"信息管理-公司"}, description = "测试内容管理公司模块的假数据")
public class CompanyManageContro {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * @param {[ompanyName, companyIndustry, city, area, produceName, financingScale, isApprove, isFrozen, page, size]
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @description
	 * @author Mr.HUANG
	 * @date 2018/10/21
	 */
	@ApiOperation(value = "公司列表", notes = "根据搜索条件获取相应的列表")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "companyName", value = "公司名称", required = false,
					dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "companyIndustry", value = "公司行业", required = false,
					dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "city", value = "城市", required = false,
					dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "area", value = "县区", required = false,
					dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "produceName", value = "产品名称", required = false,
					dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "financingScale", value = "融资规模", required = false,
					dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "isApprove", value = "是否认证", required = false,
					dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "isFrozen", value = "是否冻结", required = false,
					dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "page", value = "页码", required = false,
					dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "size", value = "页长", required = false,
					dataType = "Integer", paramType = "query")
	})
	@PostMapping("/a/company/list")
	public RetResult<?> companyList(String companyName, Integer companyIndustry, String city,
									String area, String produceName, Integer financingScale,
									Integer isApprove, Integer isFrozen,
									@RequestParam(defaultValue = "1") Integer page,
									@RequestParam(defaultValue = "10") Integer size) {
		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("companyName:" + companyName + '\n' + "; companyIndustry:" + companyIndustry + '\n' +
				"; city:" + city + '\n' + "; area:" + area + '\n' + "; produceName:" + produceName + '\n' +
				"; financingScale:" + financingScale + '\n' + "; isApprove:" + isApprove + '\n' + "; Integer:" + isFrozen + '\n'
				+ "; page:" + page +'\n' + "; size:" + size);

		// 模拟数据库的信息
		List<CompanyInfo> companyInfoBase = new ArrayList<>();
		for (int i = 1; i < 30; ++i) {
			companyInfoBase.add(new CompanyInfo(new Random().nextInt(4) + 1));
		}

		System.out.println("----------------------------");

		// 返回的数据
		int intSize = (page - 1)*size;
		List<CompanyInfo> companyInfoList = new ArrayList<>() ;

		// 遍历并将需要的参数返回
		for(int i =  (page - 1)*size  ; i < intSize + size; i++) {
			System.out.println(i);
			CompanyInfo companyInfoReturn = new CompanyInfo();
			CompanyInfo companyInfoTem = companyInfoBase.get(i);
			companyInfoReturn.setCompanyId(companyInfoTem.getCompanyId());
			companyInfoReturn.setCompanyName(companyInfoTem.getCompanyName());
			companyInfoReturn.setCompanyIndustry(companyInfoTem.getCompanyIndustry());
			companyInfoReturn.setCity(companyInfoTem.getCity());
			companyInfoReturn.setArea(companyInfoTem.getArea());
			companyInfoReturn.setFinancingScale(companyInfoTem.getFinancingScale());
			companyInfoReturn.setIsApprove(companyInfoTem.getIsApprove());
			companyInfoReturn.setIsFrozen(companyInfoTem.getIsFrozen());
			companyInfoList.add(companyInfoReturn);
			}

		// 分页相关参数
		PageUtil pageUtil = new PageUtil();
		pageUtil.setPage(page);
		pageUtil.setTotal(companyInfoBase.size());
		pageUtil.setSize(size);

		HashMap<String ,Object> resultMap = new HashMap<>();

		resultMap.put("companyList",companyInfoList);
		resultMap.put("pageUtil",pageUtil);

		System.out.println(companyInfoList.toString());
		System.out.println("获取公司列表信息成功");
		return RetResponse.result(RetCode.SUCCESS_COMPANY_LIST_GET).setData(resultMap);
	}

	/**
	 * @description  新增公司信息
	 * @param  {[CompanyInfo]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/22
	 */
	@ApiOperation(value = "新增公司信息", notes = "新增公司信息接口的假数据")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "companyInfo", value = "公司主要信息", required = true,
					dataType = "CompanyInfo", paramType = "body")
	})
	@PostMapping("/a/company")
	public RetResult<?> addCompanyInfo (@RequestBody CompanyInfo companyInfo){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("companyInfo:" + JSON.toJSONString(companyInfo));


		CompanyInfo companyInfoReturn = new CompanyInfo(companyInfo);

		// 将请求参数中的属性注入到返回到的实体类中
		companyInfoReturn.setRecruitingCompanyInformation(companyInfo.getRecruitingCompanyInformation());
		companyInfoReturn.setCompanyProduce(companyInfo.getCompanyProduce());
		System.out.println("新增单个公司信息成功");
		return RetResponse.result(RetCode.SUCCESS_COMPANY_ADD);
	}


	/**
	 * @description 查询单个公司信息
	 * @param {[companyId]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/22
	 */
	@ApiOperation(value = "查询单个公司信息", notes = "获取单个公司详细信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "companyId" ,value = "公司ID" ,required = true,
				dataType = "Long" ,paramType = "path")
	})
	@GetMapping("/a/company/{companyId}")
	public RetResult<?> getCompanyOne(@PathVariable Long companyId){
		// 模拟数据库的信息
		List<CompanyInfo> companyInfoBase = new ArrayList<>();
		for (int i = 1; i < 30; ++i) {
			companyInfoBase.add(new CompanyInfo(new Random().nextInt(4) + 1));
		}
		// 对请求参数进行判断，并获取相应的参数
		for (CompanyInfo companyInfoOne : companyInfoBase) {
			if (companyInfoOne.getCompanyId().equals(companyId)) {
				System.out.println("查询单个公司信息成功");
				HashMap<String, Object> returnMap = new HashMap<>();

				returnMap.put("company",companyInfoOne);
				return RetResponse.result(RetCode.SUCCESS_COMPANY_QUERY).setData(returnMap);
			}
		}
		return RetResponse.result(RetCode.COMPANY_NO_EXIST);
	}

	/**
	 * @description
	 * @param {[companyInfo]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/22
	 */
	@ApiOperation(value = "更新单个公司信息",notes = "更新单个公司信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "companyInfo", value = "修改过的公司的信息", required = true,
					dataType = "CompanyInfo" ,paramType = "body")
	})
	@PutMapping("/a/company")
	public RetResult<?> updateCompany(@RequestBody CompanyInfo companyInfo){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("companyInfo:" + JSON.toJSONString(companyInfo));

		System.out.println("更新单个公司信息成功");
		return RetResponse.result(RetCode.SUCCESS_COMPANY_UPDATE);
	}

	/**
	 * @description 更改公司认证状态
	 * @param {[companyID, isApprove]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/22
	 */
	@ApiOperation(value = "更改公司认证状态" ,notes = "更改公司认证状态")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "companyId", value = "公司ID", required = true,
					dataType = "Long", paramType = "path"),
			@ApiImplicitParam(name = "isApprove", value = "认证状态", required = true,
					dataType = "int", paramType = "query")
	})
	@PutMapping("/a/company/approve/{companyId}")
	public RetResult<?> companyApproveUpdate(@PathVariable Long companyID, @RequestParam Integer isApprove){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("companyID:" + companyID + "; isApprove:" + isApprove);

		return RetResponse.result(RetCode.SUCCESS_COMPANY_APPROVE_UPDATE);
	}

	/**
	 * @description 更改公司冻结状态
	 * @param {[companyID, isFrozen]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/22
	 */
	@ApiOperation(value = "更改公司冻结状态" ,notes = "更改公司冻结状态")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "companyId", value = "公司ID", required = true,
					dataType = "Long", paramType = "path"),
			@ApiImplicitParam(name = "isFrozen", value = "冻结状态", required = true,
					dataType = "int", paramType = "query")
	})
	@PutMapping("/a/company/frozen/{companyId}")
	public RetResult<?> companyStatusUpdate(@PathVariable Long companyID, @RequestParam Integer isFrozen){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("companyID:" + companyID + "; isFrozen:" + isFrozen);

		return RetResponse.result(RetCode.SUCCESS_COMPANY_STATUS_UPDATE);
	}

	/**
	 * @description  删除单个公司信息
	 * @param {[companyID]}
	 * @return com.jnshu.backendSystem.core.ret.RetResult<?>
	 * @author Mr.HUANG
	 * @date 2018/10/22
	 */
	@ApiOperation(value = "删除单个公司信息" ,notes = "根据公司ID删除相应的公司信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "companyId", value = "公司ID", required = true,
					dataType = "Long", paramType = "path")
	})
	@DeleteMapping("/a/company/{companyId}")
	public RetResult<?> companyDele(@PathVariable Long companyID){

		logger.info("-----------------------------------------------");
		logger.info("前端发起的请求数据：");
		logger.info("companyID:" + companyID );

		return RetResponse.result(RetCode.SUCCESS_COMPANY_DELETE);
	}

}