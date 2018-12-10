package com.jnshu.uaaservice.configue.druid;

import com.alibaba.druid.pool.*;
import com.alibaba.druid.support.http.*;
import org.slf4j.*;
import org.springframework.boot.context.properties.*;
import org.springframework.boot.web.servlet.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

import javax.sql.*;
import java.sql.*;

/**
 * @program: morepineapple
 * @description: Druid监控配置
 * @author: Mr.huang
 * @create: 2018-10-14 20:56
 **/

// @Configuration
public class DruidMonitorConfigurer {

	// private static final Logger logger = LoggerFactory.getLogger(DruidMonitorConfigurer.class);
	//
	//
	// /**
	//  * 注册ServletRegistrationBean
	//  * @return
	//  */
	// @Bean
	// public ServletRegistrationBean registrationBean() {
	// 	ServletRegistrationBean bean = new ServletRegistrationBean(
	// 			new StatViewServlet(), "/druid/*");
	// 	/** 初始化参数配置，initParams**/
	// 	//白名单
	// 	//多个ip逗号隔开
	// 	bean.addInitParameter("allow", "127.0.0.1");
	// 	//IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
	// 	//bean.addInitParameter("deny", "192.168.1.110");
	// 	//登录查看信息的账号密码.
	// 	bean.addInitParameter("loginUsername", "admin");
	// 	bean.addInitParameter("loginPassword", "123456");
	// 	//是否能够重置数据.
	// 	bean.addInitParameter("resetEnable", "false");
	// 	return bean;
	// }
	//
	// /**
	//  * 注册FilterRegistrationBean
	//  * @return
	//  */
	// @Bean
	// public FilterRegistrationBean druidStatFilter() {
	// 	FilterRegistrationBean bean = new FilterRegistrationBean(new WebStatFilter());
	// 	//添加过滤规则.
	// 	bean.addUrlPatterns("/*");
	// 	//添加不需要忽略的格式信息.
	// 	bean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
	// 	return bean;
	// }
	//
	// @Component
	// @ConfigurationProperties(prefix = "spring.datasource")
	// class IDataSourceProperties {
	// 	private String url;
	//
	// 	private String username;
	//
	// 	private String password;
	//
	// 	private String driverClassName;
	//
	// 	private int initialSize;
	//
	// 	private int minIdle;
	//
	// 	private int maxActive;
	//
	// 	private int maxWait;
	//
	// 	private int timeBetweenEvictionRunsMillis;
	//
	// 	private int minEvictableIdleTimeMillis;
	//
	// 	private String validationQuery;
	//
	// 	private boolean testWhileIdle;
	//
	// 	private boolean testOnBorrow;
	//
	// 	private boolean testOnReturn;
	//
	// 	private boolean poolPreparedStatements;
	//
	// 	private int maxPoolPreparedStatementPerConnectionSize;
	//
	// 	private String filters;
	//
	// 	private String connectionProperties;
	//
	// 	@Bean     //声明其为Bean实例
	// 	@Primary  //在同样的DataSource中，首先使用被标注的DataSource
	// 	public DataSource dataSource() {
	//
	// 		System.out.println("0-------------------------------------");
	// 			DruidDataSource datasource = new DruidDataSource();
	// 			System.out.println("1-------------------------------------");
	// 			datasource.setUrl(url);
	// 			datasource.setUsername(username);
	// 			datasource.setPassword(password);
	// 			datasource.setDriverClassName(driverClassName);
	//
	// 			System.out.println("-------------------------------------");
	// 			System.out.println(initialSize);
	// 			System.out.println(minIdle);
	// 			//configuration
	// 			datasource.setInitialSize(initialSize);
	// 			datasource.setMinIdle(minIdle);
	// 			datasource.setMaxActive(maxActive);
	// 			datasource.setMaxWait(maxWait);
	// 			datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
	// 			datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
	// 			datasource.setValidationQuery(validationQuery);
	// 			datasource.setTestWhileIdle(testWhileIdle);
	// 			datasource.setTestOnBorrow(testOnBorrow);
	// 			datasource.setTestOnReturn(testOnReturn);
	// 			datasource.setPoolPreparedStatements(poolPreparedStatements);
	// 			datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
	// 			try {
	// 				datasource.setFilters(filters);
	// 			} catch (SQLException e) {
	// 				logger.error("druid configuration initialization filter", e);
	// 			}
	// 			datasource.setConnectionProperties(connectionProperties);
	//
	// 			return datasource;
	//
	// 	}
	//
	// 	public String getUrl() {
	// 		return url;
	// 	}
	//
	// 	public void setUrl(String url) {
	// 		this.url = url;
	// 	}
	//
	// 	public String getUsername() {
	// 		return username;
	// 	}
	//
	// 	public void setUsername(String username) {
	// 		this.username = username;
	// 	}
	//
	// 	public String getPassword() {
	// 		return password;
	// 	}
	//
	// 	public void setPassword(String password) {
	// 		this.password = password;
	// 	}
	//
	// 	public String getDriverClassName() {
	// 		return driverClassName;
	// 	}
	//
	// 	public void setDriverClassName(String driverClassName) {
	// 		this.driverClassName = driverClassName;
	// 	}
	//
	// 	public int getInitialSize() {
	// 		return initialSize;
	// 	}
	//
	// 	public void setInitialSize(int initialSize) {
	// 		this.initialSize = initialSize;
	// 	}
	//
	// 	public int getMinIdle() {
	// 		return minIdle;
	// 	}
	//
	// 	public void setMinIdle(int minIdle) {
	// 		this.minIdle = minIdle;
	// 	}
	//
	// 	public int getMaxActive() {
	// 		return maxActive;
	// 	}
	//
	// 	public void setMaxActive(int maxActive) {
	// 		this.maxActive = maxActive;
	// 	}
	//
	// 	public int getMaxWait() {
	// 		return maxWait;
	// 	}
	//
	// 	public void setMaxWait(int maxWait) {
	// 		this.maxWait = maxWait;
	// 	}
	//
	// 	public int getTimeBetweenEvictionRunsMillis() {
	// 		return timeBetweenEvictionRunsMillis;
	// 	}
	//
	// 	public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
	// 		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	// 	}
	//
	// 	public int getMinEvictableIdleTimeMillis() {
	// 		return minEvictableIdleTimeMillis;
	// 	}
	//
	// 	public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
	// 		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	// 	}
	//
	// 	public String getValidationQuery() {
	// 		return validationQuery;
	// 	}
	//
	// 	public void setValidationQuery(String validationQuery) {
	// 		this.validationQuery = validationQuery;
	// 	}
	//
	// 	public boolean isTestWhileIdle() {
	// 		return testWhileIdle;
	// 	}
	//
	// 	public void setTestWhileIdle(boolean testWhileIdle) {
	// 		this.testWhileIdle = testWhileIdle;
	// 	}
	//
	// 	public boolean isTestOnBorrow() {
	// 		return testOnBorrow;
	// 	}
	//
	// 	public void setTestOnBorrow(boolean testOnBorrow) {
	// 		this.testOnBorrow = testOnBorrow;
	// 	}
	//
	// 	public boolean isTestOnReturn() {
	// 		return testOnReturn;
	// 	}
	//
	// 	public void setTestOnReturn(boolean testOnReturn) {
	// 		this.testOnReturn = testOnReturn;
	// 	}
	//
	// 	public boolean isPoolPreparedStatements() {
	// 		return poolPreparedStatements;
	// 	}
	//
	// 	public void setPoolPreparedStatements(boolean poolPreparedStatements) {
	// 		this.poolPreparedStatements = poolPreparedStatements;
	// 	}
	//
	// 	public int getMaxPoolPreparedStatementPerConnectionSize() {
	// 		return maxPoolPreparedStatementPerConnectionSize;
	// 	}
	//
	// 	public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
	// 		this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
	// 	}
	//
	// 	public String getFilters() {
	// 		return filters;
	// 	}
	//
	// 	public void setFilters(String filters) {
	// 		this.filters = filters;
	// 	}
	//
	// 	public String getConnectionProperties() {
	// 		return connectionProperties;
	// 	}
	//
	// 	public void setConnectionProperties(String connectionProperties) {
	// 		this.connectionProperties = connectionProperties;
	// 	}
	//
	//
	// }

}
