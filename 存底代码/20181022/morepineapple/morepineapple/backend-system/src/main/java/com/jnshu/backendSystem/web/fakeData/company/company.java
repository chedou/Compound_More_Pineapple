package com.jnshu.backendSystem.web.fakeData.company;

import com.jnshu.backendSystem.core.ret.*;
import com.jnshu.backendSystem.core.utils.*;
import com.jnshu.backendSystem.pojo.*;
import io.swagger.annotations.*;
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
public class company {

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

		// 模拟数据库的信息
		List<CompanyInfo> companyInfoBase = new ArrayList<>();
		for (int i = 1; i < 30; ++i) {
			companyInfoBase.add(new CompanyInfo(new Random().nextInt(4) + 1));
		}

		System.out.println("----------------------------");
		System.out.println("page:" + page);
		System.out.println("size:" + size);

		int intSize = (page - 1)*size;
		List<CompanyInfo> companyInfoList = new ArrayList<>() ;

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

		PageUtil pageUtil = new PageUtil();
		pageUtil.setPage(page);
		pageUtil.setTotal(companyInfoBase.size());
		pageUtil.setSize(size);

		System.out.println(companyInfoList.toString());
		return RetResponse.result(RetCode.SUCCESS).setData(companyInfoList,pageUtil);
	}

	@ApiOperation(value = "新增公司信息", notes = "新增公司信息接口的假数据")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "companyInfo", value = "公司主要信息", required = true,
					dataType = "Object", paramType = "body")
	})
	@PostMapping("/a/company")
	public RetResult<?> addCompanyInfo (@RequestBody CompanyInfo companyInfo
										// @RequestBody CompanyProduce companyProduce,
										// @RequestBody RecruitingCompanyInformation recruitingCompanyInformation
										){

		CompanyInfo companyInfoReturn = new CompanyInfo(companyInfo);
		companyInfoReturn.setRecruitingCompanyInformation(companyInfo.getRecruitingCompanyInformation());
		companyInfoReturn.setCompanyProduce(companyInfo.getCompanyProduce());
		return RetResponse.result(RetCode.SUCCESS).setData(companyInfoReturn);
	}
}