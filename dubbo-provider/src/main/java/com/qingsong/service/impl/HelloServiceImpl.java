package com.qingsong.service.impl;

// import com.alibaba.dubbo.config.annotation.Service;
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
        String value = "dubbo-consumer sayHello: " + name;
        System.out.println(value);
        return value;
    }
}
