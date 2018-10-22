package com.jnshu.backendSystem.configurer;

import org.springframework.context.annotation.*;
import springfox.documentation.builders.*;
import springfox.documentation.service.*;
import springfox.documentation.spi.*;
import springfox.documentation.spring.web.plugins.*;
import springfox.documentation.swagger2.annotations.*;

/**
 * @program: morepineapple
 * @description: Swagger2 配置文件
 * @author: Mr.huang
 * @create: 2018-10-14 22:08
 **/

@Configuration
@EnableSwagger2
public class SwaggerConfigurer {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.jnshu.backendSystem.web"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("萝卜多-多菠萝 APIs")
				.description(" ")
				.termsOfServiceUrl("https://")
				.contact(new Contact("Mr_黄", "https://", null))
				.version("1.0")
				.build();
	}




}
