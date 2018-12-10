package com.jnshu.resourceservice.config;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.core.io.*;
import org.springframework.security.oauth2.provider.token.*;
import org.springframework.security.oauth2.provider.token.store.*;
import org.springframework.util.*;

import java.io.*;

/**
 * @program: purview
 * @description: JWT配置类
 * @author: Mr.huang
 * @create: 2018-12-06 20:38
 **/
@Configuration
public class JwtConfig {

	@Autowired
	JwtAccessTokenConverter jwtAccessTokenConverter;

	@Bean
	@Qualifier("tokenStore")
	// @Autowired
	public TokenStore tokenStore() {
		return new JwtTokenStore(jwtAccessTokenConverter);
	}

	@Bean
	protected JwtAccessTokenConverter jwtTokenEnhancer() {
		JwtAccessTokenConverter converter =  new JwtAccessTokenConverter();
		Resource resource = new ClassPathResource("public.cert");
		String publicKey ;
		try {
			publicKey = new String(FileCopyUtils.copyToByteArray(resource.getInputStream()));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		converter.setVerifierKey(publicKey);
		return converter;
	}
}
