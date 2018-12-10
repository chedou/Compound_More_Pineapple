package com.jnshu.resourceservice.config;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.crypto.password.*;

/**
 * @program: springcloudf2
 * @description:
 * @author: Mr.huang
 * @create: 2018-10-10 00:43
 **/
@Configurable
public class CustomPasswordEncoder implements PasswordEncoder {
	@Override
	public String encode(CharSequence charSequence) {
		return charSequence.toString();
	}

	@Override
	public boolean matches(CharSequence charSequence, String s) {
		return s.equals(charSequence.toString());
	}

}
