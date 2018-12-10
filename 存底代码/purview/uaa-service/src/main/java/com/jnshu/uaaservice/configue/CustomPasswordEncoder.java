package com.jnshu.uaaservice.configue;

import org.springframework.security.crypto.password.*;

/**
 * @program: purview
 * @description:
 * @author: Mr.huang
 * @create: 2018-11-17 23:07
 **/
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
