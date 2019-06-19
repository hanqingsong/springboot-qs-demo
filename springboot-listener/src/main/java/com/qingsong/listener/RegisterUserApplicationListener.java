package com.qingsong.listener;

import com.qingsong.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

// @Component
public class RegisterUserApplicationListener  implements ApplicationListener<UserRegisterEvent> {
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        System.out.println("---------------------------");
        System.out.println("实现ApplicationListener接口监听userRegisterEvent 并向用户发邮箱");
        System.out.println("注册的用户名字"+userRegisterEvent.getUser().getUsername());
    }
}