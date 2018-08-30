package com.qingsong.service.impl;

import com.qingsong.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by hanqingsong on 18/8/30.
 *
 * @author hanqingsong
 * @date 18/8/30
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        String value = "dubbo-provider sayHello: " + name;
        System.out.println(value);
        return value;
    }
}
