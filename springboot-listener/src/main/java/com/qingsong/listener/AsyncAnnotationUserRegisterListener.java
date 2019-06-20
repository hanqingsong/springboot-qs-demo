package com.qingsong.listener;

import com.qingsong.event.UserRegisterEvent;
import com.qingsong.event.UserRegisterEvent2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AsyncAnnotationUserRegisterListener {
    //  异步监听的方法上面   添加 async注解
    @Async
    @EventListener
   public void  sendMailToUser(UserRegisterEvent userRegisterEvent){
        log.info("通过异步监听start "+ userRegisterEvent.getUser().getUsername());
        // 线程
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("通过异步监听end "+ userRegisterEvent.getUser().getUsername());
   }


    @EventListener
    public void  sendMailToUser2(UserRegisterEvent2 userRegisterEvent){
        log.info("sendMailToUser2 通过异步监听start "+ userRegisterEvent.getUser().getUsername());
        // 线程
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("sendMailToUser2 通过异步监听end "+ userRegisterEvent.getUser().getUsername());
    }
}