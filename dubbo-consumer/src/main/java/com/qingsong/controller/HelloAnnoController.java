package com.qingsong.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qingsong.service.HelloAnnoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanqingsong on 18/8/30.
 *
 * @author hanqingsong
 * @date 18/8/30
 */
@RestController
public class HelloAnnoController {

    @Reference(version = "0.0.1")
    private HelloAnnoService helloService;

    @RequestMapping("/hello")
    public String hello(String name){
        return helloService.sayHello("sssss"+name);
    }
}
