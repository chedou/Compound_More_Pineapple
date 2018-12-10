package com.jnshu.resourceservice.client.hystrix;

import com.jnshu.resourceservice.client.*;
import com.jnshu.resourceservice.entity.*;
import org.springframework.stereotype.*;

@Component
public class AuthServiceHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        return null;
    }
}
