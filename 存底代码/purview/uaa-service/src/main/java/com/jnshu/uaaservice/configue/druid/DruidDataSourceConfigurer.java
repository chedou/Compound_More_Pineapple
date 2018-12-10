package com.jnshu.uaaservice.configue.druid;

import com.alibaba.druid.pool.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;


import javax.sql.*;
import java.sql.*;

/**
 * @program: morepineapple
 * @description: Druid连接池配置文件
 * @author: Mr.huang
 * @create: 2018-10-14 20:49
 **/
// @Configuration
// @Component
// @ConfigurationProperties(prefix = "spring.datasource")
public class DruidDataSourceConfigurer {
	// private Logger logger = LoggerFactory.getLogger(DruidDataSourceConfigurer.class);

	// @Value("${spring.datasource.url}")
	// private String dbUrl;
	//
	// @Value("${spring.datasource.username}")
	// private String username;
	//
	// @Value("${spring.datasource.password}")
	// private String password;
	//
	// @Value("${spring.datasource.driverClassName}")
	// private String driverClassName;
	//
	// @Value("${spring.datasource.initialSize}")
	// private int initialSize;
	//
	// @Value("${spring.datasource.minIdle}")
	// private int minIdle;
	//
	// @Value("${spring.datasource.maxActive}")
	// private int maxActive;
	//
	// @Value("${spring.datasource.maxWait}")
	// private int maxWait;
	//
	// @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
	// private int timeBetweenEvictionRunsMillis;
	//
	// @Value("${spring.datasource.minEvictableIdleTimeMillis}")
	// private int minEvictableIdleTimeMillis;
	//
	// @Value("${spring.datasource.validationQuery}")
	// private String validationQuery;
	//
	// @Value("${spring.datasource.testWhileIdle}")
	// private boolean testWhileIdle;
	//
	// @Value("${spring.datasource.testOnBorrow}")
	// private boolean testOnBorrow;
	//
	// @Value("${spring.datasource.testOnReturn}")
	// private boolean testOnReturn;
	//
	// @Value("${spring.datasource.poolPreparedStatements}")
	// private boolean poolPreparedStatements;
	//
	// @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
	// private int maxPoolPreparedStatementPerConnectionSize;
	//
	// @Value("${spring.datasource.filters}")
	// private String filters;
	//
	// @Value("{spring.datasource.connectionProperties}")
	// private String connectionProperties;

	// @Autowired
	// com.jnshu.uaaservice.pojo.DruidDataSource druidDataSource;


	// private String url;
	//
	// private String username;
	//
	// private String password;
	//
	// private String driverClassName;
	//
	// private int initialSize;
	//
	// private int minIdle;
	//
	// private int maxActive;
	//
	// private int maxWait;
	//
	// private int timeBetweenEvictionRunsMillis;
	//
	// private int minEvictableIdleTimeMillis;
	//
	// private String validationQuery;
	//
	// private boolean testWhileIdle;
	//
	// private boolean testOnBorrow;
	//
	// private boolean testOnReturn;
	//
	// private boolean poolPreparedStatements;
	//
	// private int maxPoolPreparedStatementPerConnectionSize;
	//
	// private String filters;
	//
	// private String connectionProperties;
	//
	//
	// public String getUrl() {
	// 	return url;
	// }
	//
	// public void setUrl(String url) {
	// 	this.url = url;
	// }
	//
	// public String getUsername() {
	// 	return username;
	// }
	//
	// public void setUsername(String username) {
	// 	this.username = username;
	// }
	//
	// public String getPassword() {
	// 	return password;
	// }
	//
	// public void setPassword(String password) {
	// 	this.password = password;
	// }
	//
	// public String getDriverClassName() {
	// 	return driverClassName;
	// }
	//
	// public void setDriverClassName(String driverClassName) {
	// 	this.driverClassName = driverClassName;
	// }
	//
	// public int getInitialSize() {
	// 	return initialSize;
	// }
	//
	// public void setInitialSize(int initialSize) {
	// 	this.initialSize = initialSize;
	// }
	//
	// public int getMinIdle() {
	// 	return minIdle;
	// }
	//
	// public void setMinIdle(int minIdle) {
	// 	this.minIdle = minIdle;
	// }
	//
	// public int getMaxActive() {
	// 	return maxActive;
	// }
	//
	// public void setMaxActive(int maxActive) {
	// 	this.maxActive = maxActive;
	// }
	//
	// public int getMaxWait() {
	// 	return maxWait;
	// }
	//
	// public void setMaxWait(int maxWait) {
	// 	this.maxWait = maxWait;
	// }
	//
	// public int getTimeBetweenEvictionRunsMillis() {
	// 	return timeBetweenEvictionRunsMillis;
	// }
	//
	// public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
	// 	this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	// }
	//
	// public int getMinEvictableIdleTimeMillis() {
	// 	return minEvictableIdleTimeMillis;
	// }
	//
	// public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
	// 	this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	// }
	//
	// public String getValidationQuery() {
	// 	return validationQuery;
	// }
	//
	// public void setValidationQuery(String validationQuery) {
	// 	this.validationQuery = validationQuery;
	// }
	//
	// public boolean isTestWhileIdle() {
	// 	return testWhileIdle;
	// }
	//
	// public void setTestWhileIdle(boolean testWhileIdle) {
	// 	this.testWhileIdle = testWhileIdle;
	// }
	//
	// public boolean isTestOnBorrow() {
	// 	return testOnBorrow;
	// }
	//
	// public void setTestOnBorrow(boolean testOnBorrow) {
	// 	this.testOnBorrow = testOnBorrow;
	// }
	//
	// public boolean isTestOnReturn() {
	// 	return testOnReturn;
	// }
	//
	// public void setTestOnReturn(boolean testOnReturn) {
	// 	this.testOnReturn = testOnReturn;
	// }
	//
	// public boolean isPoolPreparedStatements() {
	// 	return poolPreparedStatements;
	// }
	//
	// public void setPoolPreparedStatements(boolean poolPreparedStatements) {
	// 	this.poolPreparedStatements = poolPreparedStatements;
	// }
	//
	// public int getMaxPoolPreparedStatementPerConnectionSize() {
	// 	return maxPoolPreparedStatementPerConnectionSize;
	// }
	//
	// public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
	// 	this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
	// }
	//
	// public String getFilters() {
	// 	return filters;
	// }
	//
	// public void setFilters(String filters) {
	// 	this.filters = filters;
	// }
	//
	// public String getConnectionProperties() {
	// 	return connectionProperties;
	// }
	//
	// public void setConnectionProperties(String connectionProperties) {
	// 	this.connectionProperties = connectionProperties;
	// }

	// @Bean
	// public DataSource getDataSource() {
	// 	System.out.println("0-------------------------------------");
	// 	DruidDataSource datasource = new DruidDataSource();
	// 	System.out.println("1-------------------------------------");
	// 	datasource.setUrl(url);
	// 	datasource.setUsername(username);
	// 	datasource.setPassword(password);
	// 	datasource.setDriverClassName(driverClassName);
	//
	// 	System.out.println("-------------------------------------");
	// 	System.out.println(initialSize);
	// 	System.out.println(minIdle);
	// 	//configuration
	// 	datasource.setInitialSize(initialSize);
	// 	datasource.setMinIdle(minIdle);
	// 	datasource.setMaxActive(maxActive);
	// 	datasource.setMaxWait(maxWait);
	// 	datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
	// 	datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
	// 	datasource.setValidationQuery(validationQuery);
	// 	datasource.setTestWhileIdle(testWhileIdle);
	// 	datasource.setTestOnBorrow(testOnBorrow);
	// 	datasource.setTestOnReturn(testOnReturn);
	// 	datasource.setPoolPreparedStatements(poolPreparedStatements);
	// 	datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
	// 	try {
	// 		datasource.setFilters(filters);
	// 	} catch (SQLException e) {
	// 		logger.error("druid configuration initialization filter", e);
	// 	}
	// 	datasource.setConnectionProperties(connectionProperties);
	//
	// 	return datasource;
	// }
	//
	// @Bean
	// public DataSource getDataSource() {
	// 	System.out.println("0-------------------------------------");
	// 	DruidDataSource datasource = new DruidDataSource();
	// 	System.out.println("1-------------------------------------");
	// 	datasource.setUrl(druidDataSource.getUrl());
	// 	datasource.setUsername(druidDataSource.getUsername());
	// 	datasource.setPassword(druidDataSource.getPassword());
	// 	datasource.setDriverClassName(druidDataSource.getDriverClassName());
	//
	// 	System.out.println("-------------------------------------");
	// 	System.out.println(druidDataSource.getInitialSize());
	// 	System.out.println(druidDataSource.getMinIdle());
	// 	//configuration
	// 	datasource.setInitialSize(druidDataSource.getInitialSize());
	// 	datasource.setMinIdle(druidDataSource.getMinIdle());
	// 	datasource.setMaxActive(druidDataSource.getMaxActive());
	// 	datasource.setMaxWait(druidDataSource.getMaxWait());
	// 	datasource.setTimeBetweenEvictionRunsMillis(druidDataSource.getTimeBetweenEvictionRunsMillis());
	// 	datasource.setMinEvictableIdleTimeMillis(druidDataSource.getMinEvictableIdleTimeMillis());
	// 	datasource.setValidationQuery(druidDataSource.getValidationQuery());
	// 	datasource.setTestWhileIdle(druidDataSource.isTestWhileIdle());
	// 	datasource.setTestOnBorrow(druidDataSource.isTestOnBorrow());
	// 	datasource.setTestOnReturn(druidDataSource.isTestOnReturn());
	// 	datasource.setPoolPreparedStatements(druidDataSource.isPoolPreparedStatements());
	// 	datasource.setMaxPoolPreparedStatementPerConnectionSize(datasource.getMaxPoolPreparedStatementPerConnectionSize());
	// 	try {
	// 		datasource.setFilters(druidDataSource.getFilters());
	// 	} catch (SQLException e) {
	// 		logger.error("druid configuration initialization filter", e);
	// 	}
	// 	datasource.setConnectionProperties(druidDataSource.getConnectionProperties());
	//
	// 	return datasource;
	// }
}
