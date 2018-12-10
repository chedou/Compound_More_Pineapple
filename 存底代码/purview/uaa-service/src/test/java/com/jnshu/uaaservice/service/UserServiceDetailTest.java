package com.jnshu.uaaservice.service;

import com.jnshu.uaaservice.pojo.*;
import org.junit.*;
import org.junit.runner.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit.jupiter.web.*;
import org.springframework.test.context.junit4.*;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceDetailTest {
	private final org.slf4j.Logger logger =LoggerFactory.getLogger(this.getClass());

	@Autowired(required = false)
	private UserServiceDetail userServiceDetail;

	@Test
	public void loadUserByUsername() {

		System.out.println("00000000000000000000");
		User user = (User) userServiceDetail.loadUserByUsername("zhuoyue");
		System.out.println("11111111111111111111111");
		System.out.println(user);
		System.out.println("getAuthorities : " + user.getAuthorities());
		System.out.println("22222222222222222222222");
		System.out.println("getName : " + user.getName());
	}
}