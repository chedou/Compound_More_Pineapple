package com.jnshu.resourceservice.client;

import com.jnshu.resourceservice.client.hystrix.*;
import com.jnshu.resourceservice.entity.*;
import org.springframework.cloud.openfeign.*;
import org.springframework.web.bind.annotation.*;


/**
 * @description
 * @param
 * @return
 * @author Mr.HUANG
 * @date 2018/10/9
 */
@FeignClient(value = "uaa-service",fallback =AuthServiceHystrix.class )
public interface AuthServiceClient {

    @PostMapping(value = "/oauth/token")
	JWT getToken(@RequestHeader(value = "Authorization") String authorization,
				 @RequestParam("grant_type") String type,
				 @RequestParam("username") String username,
				 @RequestParam("password") String password);

}



