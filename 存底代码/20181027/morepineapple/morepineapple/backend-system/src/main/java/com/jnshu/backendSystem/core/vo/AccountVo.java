package com.jnshu.backendSystem.core.vo;

import com.jnshu.backendSystem.core.utils.*;
import com.jnshu.backendSystem.pojo.*;

import java.io.*;
import java.util.*;

/**
 * @program: morepineapple
 * @description: account请求参数的统一封装
 * @author: Mr.huang
 * @create: 2018-10-27 10:05
 **/
public class AccountVo implements Serializable {

	private static final long serialVersionUID = -8965332263775351545L;

	private BannerShow bannerShow;

	private PageUtil pageUtil;

	private Long createAtStart;

	private Long createAtEnd;

	private Long[] oldIdArray;

	private Long[] newIdArray;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public BannerShow getBannerShow() {
		return bannerShow;
	}

	public void setBannerShow(BannerShow bannerShow) {
		this.bannerShow = bannerShow;
	}

	public PageUtil getPageUtil() {
		return pageUtil;
	}

	public void setPageUtil(PageUtil pageUtil) {
		this.pageUtil = pageUtil;
	}

	public Long getCreateAtStart() {
		return createAtStart;
	}

	public void setCreateAtStart(Long createAtStart) {
		this.createAtStart = createAtStart;
	}

	public Long getCreateAtEnd() {
		return createAtEnd;
	}

	public void setCreateAtEnd(Long createAtEnd) {
		this.createAtEnd = createAtEnd;
	}

	public Long[] getOldIdArray() {
		return oldIdArray;
	}

	public void setOldIdArray(Long[] oldIdArray) {
		this.oldIdArray = oldIdArray;
	}

	public Long[] getNewIdArray() {
		return newIdArray;
	}

	public void setNewIdArray(Long[] newIdArray) {
		this.newIdArray = newIdArray;
	}


	@Override
	public String toString() {
		return "AccountVo{" +
				"bannerShow=" + bannerShow +
				", pageUtil=" + pageUtil +
				", createAtStart=" + createAtStart +
				", createAtEnd=" + createAtEnd +
				", oldIdArray=" + Arrays.toString(oldIdArray) +
				", newIdArray=" + Arrays.toString(newIdArray) +
				'}';
	}
}
