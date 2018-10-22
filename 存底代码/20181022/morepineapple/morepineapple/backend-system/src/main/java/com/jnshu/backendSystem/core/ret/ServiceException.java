package com.jnshu.backendSystem.core.ret;

import java.io.*;

/**
 * @program: morepineapple
 * @description: 业务类异常
 * @author: Mr.huang
 * @create: 2018-10-14 21:50
 **/
public class ServiceException extends RuntimeException implements Serializable {

	private static final long serialVersionUID = 1213855733833039552L;

	public ServiceException() {
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}
