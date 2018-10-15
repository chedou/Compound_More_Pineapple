package com.jnshu.backendSystem.Service;

import com.github.pagehelper.*;
import com.jnshu.backendSystem.pojo.*;
import org.hibernate.validator.constraints.EAN.*;

/**
 * @program: morepineapple
 * @description: 用户信息查询
 * @author: Mr.huang
 * @create: 2018-10-14 14:51
 **/
public interface UserService {
	User selectByPrimaryKey(Long id);

	PageInfo<User> selectAll(Integer page, Integer size);
}
