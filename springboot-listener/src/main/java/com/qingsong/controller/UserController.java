package com.qingsong.controller;

import com.qingsong.pojo.User;
import com.qingsong.service.UserService;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("register")
    public String registerUser(@NotNull String username, @NotNull Integer age){
        // 返回注册  success or fail
        String msg="success";
        try {
            userService.registerUser(new User(username,age));
        } catch (Exception e) {
            msg="fail";
            e.printStackTrace();
        }
        return msg;
    }

}