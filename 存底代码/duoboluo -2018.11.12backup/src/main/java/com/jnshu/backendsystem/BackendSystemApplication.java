package com.jnshu.backendsystem;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
public class BackendSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendSystemApplication.class, args);
	}

	//@Bean
	//PageHelper pageHelper(){
	//	//分页插件
	//	PageHelper pageHelper = new PageHelper();
	//	Properties properties = new Properties();
	//	properties.setProperty("reasonable", "true");
	//	properties.setProperty("supportMethodsArguments", "true");
	//	properties.setProperty("returnPageInfo", "check");
	//	properties.setProperty("params", "count=countSql");
	//	pageHelper.setProperties(properties);
    //
	//	//添加插件
	//	new SqlSessionFactoryBean().setPlugins(new Interceptor[]{pageHelper});
	//	return pageHelper;
	//}
}
