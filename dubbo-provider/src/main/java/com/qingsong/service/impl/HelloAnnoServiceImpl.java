package com.qingsong.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qingsong.service.HelloAnnoService;

/**
 * Created by hanqingsong on 18/8/30.
 *
 * @author hanqingsong
 * @date 18/8/30
 */
// dubbo 的service
@Service(timeout = 500,version = "0.0.1")
public class HelloAnnoServiceImpl implements HelloAnnoService {
    @Override
    public String sayHello(String name) {
        String value = "dubbo-provider anno sayHello: " + name;
        System.out.println(value);
        return value;
    }
}
