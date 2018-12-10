package com.jnshu.uaaservice.configue;

import com.jnshu.uaaservice.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.crypto.bcrypt.*;

import javax.servlet.http.*;

/**
 * @program: purview
 * @description: 授权服务器 Spring Secuity配置文件
 * @author: Mr.huang
 * @create: 2018-11-17 16:40
 **/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	@Bean
	public AuthenticationManager authenticationManager() throws Exception{
		return super.authenticationManager();
	}

	/**
	 * @description  信息源
	 * @param
	 * @return void
	 * @author Mr.HUANG
	 * @date 2018/11/17
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
				.csrf().disable()
					.exceptionHandling()
					.authenticationEntryPoint((request, response, authException) ->
							response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
				.and()
					.authorizeRequests()
					.antMatchers("/**").authenticated()
				.and()
					.httpBasic();
	}


	@Autowired
	UserServiceDetail userServiceDetail;


	/**
	 * @description 配置验证的用户信息源以及密码加密策略
	 * @param
	 * @return
	 * @author Mr.HUANG
	 * @date 2018/11/17
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userServiceDetail)
				.passwordEncoder(new BCryptPasswordEncoder());
	}
}
