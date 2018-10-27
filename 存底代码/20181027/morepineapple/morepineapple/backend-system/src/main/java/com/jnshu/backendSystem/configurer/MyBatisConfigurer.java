package com.jnshu.backendSystem.configurer;

import org.apache.ibatis.session.*;
import org.mybatis.spring.*;
import org.mybatis.spring.mapper.*;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.*;

import javax.sql.*;

/**
 * @program: Mybatis 配置
 * @description: Mybatispeizhi
 * @author: Mr.huang
 * @create: 2018-10-14 15:01
 **/

@Configuration
public class MyBatisConfigurer {
	public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		factory.setDataSource(dataSource);
		// 表示项目中model的存储路径
		factory.setTypeAliasesPackage("com.jnshu.backendSystem.pojo");
		// 添加XML目录
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		// 表示mapper.xml存储路径
		factory.setMapperLocations(resolver.getResources("classpath:mappers/*.xml"));
		return factory.getObject();
	}

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
		// 表示dao层的存储路径
		mapperScannerConfigurer.setBasePackage("com.jnshu.backendSystem.dao");
		return mapperScannerConfigurer;
	}

}
