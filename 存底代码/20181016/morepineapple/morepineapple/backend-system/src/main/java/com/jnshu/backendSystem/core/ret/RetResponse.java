package com.jnshu.backendSystem.core.ret;

import java.io.*;

/**
 * @program: morepineapple
 * @description: 将结果转换为封装后的对象
 * @author: Mr.huang
 * @create: 2018-10-14 21:38
 **/
public class RetResponse implements Serializable   {

	private final static String SUCCESS = "success";

	public static <T> RetResult<T> makeOKRsp() {
		return new RetResult<T>().setCode(RetCode.SUCCESS).setMsg(SUCCESS);
	}

	public static <T> RetResult<T> makeOKRsp(T data) {
		return new RetResult<T>().setCode(RetCode.INTERFACE_EXCEED_LOAD).setMsg(RetCode.INTERFACE_EXCEED_LOAD.message()).setData(data);
	}

	// public static <T> RetResult<T> makeErrRsp(String message) {
	// 	return new RetResult<T>().setCode(RetCode.FAIL).setMsg(SUCCESS);
	// }

	public static <T> RetResult<T> makeRsp(int code, String msg) {
		return new RetResult<T>().setCode(code).setMsg(msg);
	}

	public static <T> RetResult<T> makeRsp(int code, String msg, T data) {
		return new RetResult<T>().setCode(code).setMsg(msg).setData(data);
	}

	// private static final long serialVersionUID = -3948389268046368059L;
	//
	// private Integer code;
	//
	// private String msg;
	//
	// private Object data;
	//
	// public RetResponse() {}
	//
	// public RetResponse(Integer code, String msg) {
	// 	this.code = code;
	// 	this.msg = msg;
	// }
	//
	// public static RetResponse success() {
	// 	RetResponse retResponse = new RetResponse();
	// 	retResponse.setResultCode(RetCode.SUCCESS);
	// 	return retResponse;
	// }
	//
	// public static RetResponse success(Object data) {
	// 	RetResponse retResponse = new RetResponse();
	// 	retResponse.setResultCode(RetCode.SUCCESS);
	// 	retResponse.setData(data);
	// 	return retResponse;
	// }
	//
	// public static RetResponse failure(RetCode resultCode) {
	// 	RetResponse retResponse = new RetResponse();
	// 	retResponse.setResultCode(resultCode);
	// 	return retResponse;
	// }
	//
	// public static RetResponse failure(RetCode resultCode, Object data) {
	// 	RetResponse retResponse = new RetResponse();
	// 	retResponse.setResultCode(resultCode);
	// 	retResponse.setData(data);
	// 	return RetResponse;
	// }
	//
	// public void setResultCode(RetCode code) {
	// 	this.code = code.code();
	// 	this.msg = code.message();
	// }



}
