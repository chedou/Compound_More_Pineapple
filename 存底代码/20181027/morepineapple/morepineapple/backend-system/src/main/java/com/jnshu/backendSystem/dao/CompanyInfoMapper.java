package com.jnshu.backendSystem.dao;

import com.jnshu.backendSystem.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.*;

@Mapper
public interface CompanyInfoMapper {
	int deleteByPrimaryKey(Long companyId);

	int insert(CompanyInfo record);

	int insertSelective(CompanyInfo record);

	CompanyInfo selectByPrimaryKey(Long companyId);

	int updateByPrimaryKeySelective(CompanyInfo record);

	int updateByPrimaryKey(CompanyInfo record);

	List<CompanyInfo> selectCompanyInfoList();

}