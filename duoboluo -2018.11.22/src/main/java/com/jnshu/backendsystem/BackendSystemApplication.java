package com.jnshu.backendsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
