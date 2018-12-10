package com.jnshu.resourceservice.config;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.method.configuration.*;

/**
 * @description
 * @author Mr.HUANG
 * @date 2018/12/6
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class GlobalMethodSecurityConfig {

}
