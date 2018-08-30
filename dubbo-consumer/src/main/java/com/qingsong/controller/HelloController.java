package com.qingsong.controller;

import com.qingsong.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanqingsong on 18/8/30.
 *
 * @author hanqingsong
 * @date 18/8/30
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name){
        return helloService.sayHello("sssss"+name);
    }
}
