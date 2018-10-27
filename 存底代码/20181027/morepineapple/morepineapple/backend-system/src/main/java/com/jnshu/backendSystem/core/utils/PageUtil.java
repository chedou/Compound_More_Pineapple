package com.jnshu.backendSystem.core.utils;

import java.io.*;

/**
 * @program: morepineapple
 * @description: 分页相关参数
 * @author: Mr.huang
 * @create: 2018-10-21 22:16
 **/
public class PageUtil  implements Serializable {
	private Integer page = 1;

	private Integer size = 10;

	private Integer total;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
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
