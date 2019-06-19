package com.qingsong.service;

import com.qingsong.event.UserRegisterEvent;
import com.qingsong.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void registerUser(User user) {
        // 若用户不为null，发布用户注册事件
        if (null!=user) {
            applicationContext.publishEvent(new UserRegisterEvent(this, user));
            System.out.println("aaaaaaa");

            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}