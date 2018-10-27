package com.jnshu.backendSystem.core.ret;

import java.util.*;

/**
 * @program: morepineapple
 * @description: 响应码枚举，参考HTTP状态码的语义
 * @author: Mr.huang
 * @create: 2018-10-13 20:44
 **/
public enum RetCode {

	// 成功
	// SUCCESS(200),

	// 失败
	FAIL(400),

	// 未认证（签名错误）
	UNAUTHORIZED(401,"未认证（签名错误）"),

	// 接口不存在
	NOT_FOUND(404,"接口不存在"),

	// 服务器内部错误
	INTERNAL_SERVER_ERROR(500,"服务器内部错误"),

	/* 成功状态码 */
	SUCCESS(1, "成功"),
	SUCCESS_COMPANY_LIST_GET(1,"公司信息更新成功"),
	SUCCESS_COMPANY_ADD(1,"公司信息新增成功"),
	SUCCESS_COMPANY_QUERY(1,"公司信息新增成功"),
	SUCCESS_COMPANY_UPDATE(1,"公司信息更新成功"),
	SUCCESS_COMPANY_APPROVE_UPDATE(1,"公司认证费状态更新成功"),
	SUCCESS_COMPANY_STATUS_UPDATE(1,"公司认证费状态更新成功"),
	SUCCESS_COMPANY_DELETE(1,"公司相关信息删除成功"),

	SUCCESS_POSITION_LIST_GET(1,"职位列表获取成功"),
	SUCCESS_POSITION_ADD(1,"新增职位信息成功"),
	SUCCESS_POSITION_GET(1,"新增职位信息成功"),
	SUCCESS_POSITION_UPDATE(1,"新增职位信息成功"),
	SUCCESS_POSITION_DELETE(1,"删除职位信息成功"),
	SUCCESS_POSITION_IS_ONLINE_UPDATE(1,"职位上线状态更新成功"),
	SUCCESS_POSITION_IS_RECOMMEND_UPDATE(1,"职位推荐状态更新成功"),

	SUCCESS_BANNER_SHOW_LIST_GET(1,"banner图列表获取成功"),
	SUCCESS_BANNER_SHOW_ONE_ADD(1,"banner图新增成功"),
	SUCCESS_BANNER_SHOW_ONE_GET(1,"banner图获取成功"),
	SUCCESS_BANNER_SHOW_ONE_UPDATE(1,"banner图更新成功"),
	SUCCESS_BANNER_SHOW_ONE_DELETE(1,"banner图删除成功"),
	SUCCESS_BANNER_SHOW_ONE_ONLINE_UPDATE(1,"banner图上线状态更新成功"),
	SUCCESS_BANNER_SHOW_OLDER_UPDATE(1,"banner图排序更新成功"),



	SUCCESS_USER_LIST_GET(1,"User用户列表获取成功"),
	SUCCESS_USER_ONE_ADD(1,"User单个用户信息添加成功"),
	SUCCESS_USER_ONE_UPDATE(1,"User单个用户信息更新成功"),
	SUCCESS_USER_ONE_DELETE(1,"User单个用户信息删除成功"),
	SUCCESS_USER_ONE_GET(1,"User单个用户信息获取成功"),
	SUCCESS_USER_PASSWORD_UPDATE(1,"User单个用户密码更新成功"),
	SUCCESS_VERIFICATION_GET(1,"User单个用户密码更新成功"),

	SUCCESS_ROLE_LIST_GET(1,"role角色列表获取成功"),
	SUCCESS_ROLE_ONE_ADD(1,"role角色添加成功"),
	SUCCESS_ROLE_ONE_UPDATE(1,"role角色更新成功"),
	SUCCESS_ROLE_ONE_DELETE(1,"role角色删除成功"),
	SUCCESS_ROLE_ONE_GET(1,"短信验证码已发送"),




	 // 新增状态码
	/* 参数错误：10001-19999 */
	PARAM_IS_INVALID(10001, "参数无效"),
	PARAM_IS_BLANK(10002, "参数为空"),
	PARAM_TYPE_BIND_ERROR(10003, "参数类型错误"),
	PARAM_NOT_COMPLETE(10004, "参数缺失"),


	/* 用户错误：20001-29999*/
	USER_NOT_LOGGED_IN(20001, "用户未登录"),
	USER_LOGIN_ERROR(20002, "账号不存在或密码错误"),
	USER_ACCOUNT_FORBIDDEN(20003, "账号已被禁用"),
	USER_NOT_EXIST(20004, "用户不存在"),
	USER_HAS_EXISTED(20005, "用户已存在"),

	// 登出模块
	USER_LOGIN_OUT_ERROR(20101,"登出失败，请稍后再试"),


	/* 业务错误：30001-39999 */
	SPECIFIED_QUESTIONED_USER_NOT_EXIST(30001, "某业务出现问题"),
	COMPANY_POSITION_NOT_ALL_OFFLINE(30002, "该公司未下线所有在招职位"),
	POSITION_ONLINE_NOT_OFF(30003, "职位未下线"),


	// 公司内容管理
	COMPANY_NO_EXIST(30100,"该公司不存在"),

	// 职位内容管理
	POSITION_ID_NO_EXIST(30200,"该职位ID不存在"),

	// banner 图
	BANNER_SHOW_NO_EXIST(30300,"该banner图不存在"),
	BANNER_SHOW_ID_NO_EXIST(30301,"该banner图 ID不存在"),

	// user
	USER_ID_NO_EXIST(30401,"该USER ID不存在"),

	// role
	ROLE_ID_NO_EXIST(30501,"该ROLE ID不存在"),




	/* 系统错误：40001-49999 */
	SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),

	/* 数据错误：50001-599999 */
	RESULE_DATA_NONE(50001, "数据未找到"),
	DATA_IS_WRONG(50002, "数据有误"),
	DATA_ALREADY_EXISTED(50003, "数据已存在"),

	/* 接口错误：60001-69999 */
	INTERFACE_INNER_INVOKE_ERROR(60001, "内部系统接口调用异常"),
	INTERFACE_OUTTER_INVOKE_ERROR(60002, "外部系统接口调用异常"),
	INTERFACE_FORBID_VISIT(60003, "该接口禁止访问"),
	INTERFACE_ADDRESS_INVALID(60004, "接口地址无效"),
	INTERFACE_REQUEST_TIMEOUT(60005, "接口请求超时"),
	INTERFACE_EXCEED_LOAD(60006, "接口负载过高"),

	/* 权限错误：70001-79999 */
	PERMISSION_NO_ACCESS(70001, "无访问权限");

	public int code;

	private String message;


	RetCode(Integer code) {
		this.code = code;
	}

	RetCode(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer code() {
		return this.code;
	}

	public String message() {
		return this.message;
	}

	public static String getMessage(String name) {
		for (RetCode item : RetCode.values()) {
			if (item.name().equals(name)) {
				return item.message;
			}
		}
		return name;
	}

	public static Integer getCode(String name) {
		for (RetCode item : RetCode.values()) {
			if (item.name().equals(name)) {
				return item.code;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return this.name();
	}

	//校验重复的code值
	public static void main(String[] args) {
		RetCode[] ApiResultCodes = RetCode.values();
		List<Integer> codeList = new ArrayList<Integer>();
		for (RetCode ApiResultCode : ApiResultCodes) {
			if (codeList.contains(ApiResultCode.code)) {
				System.out.println(ApiResultCode.code);
			} else {
				codeList.add(ApiResultCode.code());
			}
		}
	}






}
