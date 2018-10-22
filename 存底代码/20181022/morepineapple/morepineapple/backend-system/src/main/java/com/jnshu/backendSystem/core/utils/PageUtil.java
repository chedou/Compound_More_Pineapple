package com.jnshu.backendSystem.core.utils;

import java.io.*;

/**
 * @program: morepineapple
 * @description: 分页相关参数
 * @author: Mr.huang
 * @create: 2018-10-21 22:16
 **/
public class PageUtil  implements Serializable {
	private int page;

	private int size;

	private int total;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "PageUtil{" +
				"page=" + page +
				", size=" + size +
				", total=" + total +
				'}';
	}
}
