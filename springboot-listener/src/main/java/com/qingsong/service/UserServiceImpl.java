package com.qingsong.service;

import com.qingsong.event.UserRegisterEvent;
import com.qingsong.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service("userService")
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void registerUser(User user) {
        // 若用户不为null，发布用户注册事件
        if (null!=user) {
            applicationContext.publishEvent(new UserRegisterEvent(this, user));
            log.info("aaaaaaa 开始");
            registerUser2();
            log.info("aaaaaaa 结束");

        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 同一个方法中 @Async 无效
     * @return void
     * @author hanqingsong
     * @date 2019-06-20
     */
    @Async
    public void registerUser2() {
        log.info("registerUser2 开始");
        registerUser2Async();
        log.info("registerUser2 结束");

    }

    void registerUser2Async(){
        log.info("registerUser2Async 开始");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("registerUser2Async 结束");
    }
}