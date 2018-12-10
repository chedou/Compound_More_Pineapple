package com.jnshu.uaaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.cloud.netflix.eureka.*;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
// @EnableAutoConfiguration
public class UaaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UaaServiceApplication.class, args);
	}
}
