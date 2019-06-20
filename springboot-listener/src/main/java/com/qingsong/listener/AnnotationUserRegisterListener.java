package com.qingsong.listener;

import com.qingsong.event.UserRegisterEvent;
import org.springframework.stereotype.Component;

@Component
public class AnnotationUserRegisterListener {
    //  监听用户注册事件
    // @EventListener
    public  void sendMailToUser(UserRegisterEvent userRegisterEvent){
        System.out.println("---------------------------");
        System.out.println("利用@EventListener注解监听用户注册事件并向用户发送邮件");
        System.out.println("注册用户名：" + userRegisterEvent.getUser().getUsername());
    }
}