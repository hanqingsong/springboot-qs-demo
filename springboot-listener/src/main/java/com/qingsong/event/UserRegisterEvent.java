package com.qingsong.event;

import com.qingsong.pojo.User;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

@Data
public class UserRegisterEvent extends ApplicationEvent {
    //  user注册用户、source 事件源
    private User user;
    public UserRegisterEvent(Object source,User user ) {
        super(source);
        this.user=user;
    }
}