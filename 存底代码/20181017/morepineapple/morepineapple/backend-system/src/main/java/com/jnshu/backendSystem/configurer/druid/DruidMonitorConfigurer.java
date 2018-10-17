package com.jnshu.backendSystem.configurer.druid;

import com.alibaba.druid.support.http.*;
import org.springframework.boot.web.servlet.*;
import org.springframework.context.annotation.*;

/**
 * @program: morepineapple
 * @description: Druid监控配置
 * @author: Mr.huang
 * @create: 2018-10-14 20:56
 **/

@Configuration
public class DruidMonitorConfigurer {
	/**
	 * 注册ServletRegistrationBean
	 * @return
	 */
	@Bean
	public ServletRegistrationBean registrationBean() {
		ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
		/** 初始化参数配置，initParams**/
		//白名单
		bean.addInitParameter("allow", "127.0.0.1");//多个ip逗号隔开
		//IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
		//bean.addInitParameter("deny", "192.168.1.110");
		//登录查看信息的账号密码.
		bean.addInitParameter("loginUsername", "admin");
		bean.addInitParameter("loginPassword", "123456");
		//是否能够重置数据.
		bean.addInitParameter("resetEnable", "false");
		return bean;
	}

	/**
	 * 注册FilterRegistrationBean
	 * @return
	 */
	@Bean
	public FilterRegistrationBean druidStatFilter() {
		FilterRegistrationBean bean = new FilterRegistrationBean(new WebStatFilter());
		//添加过滤规则.
		bean.addUrlPatterns("/*");
		//添加不需要忽略的格式信息.
		bean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		return bean;
	}



}
