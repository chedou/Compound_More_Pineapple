package com.jnshu.resourceservice.web;
import com.jnshu.resourceservice.dto.*;
import com.jnshu.resourceservice.entity.*;
import com.jnshu.resourceservice.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceDetail userServiceDetail;

    @PostMapping("/register")
    public User postUser(@RequestParam("username") String username , @RequestParam("password") String password){
        //参数判断，省略
        System.out.println("username：" + username);
        System.out.println("password：" + password);
       return userServiceDetail.insertUser(username,password);

    }

    @PostMapping("/login")
    public UserLoginDTO login(@RequestParam("username") String username ,
                              @RequestParam("password") String password){
        //参数判断，省略
        System.out.println("username：" + username);
        System.out.println("password：" + password);
        return userServiceDetail.login(username,password);
    }
}
