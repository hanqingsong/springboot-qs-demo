package com.qingsong;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// @ImportResource({ "classpath:dubbo.xml" })
@DubboComponentScan(basePackages = "com.qingsong.service.impl")
public class DubboProviderApplication {

	public static void main(String[] args) {
		System.out.println("########### DubboProviderApplication start ###########");
		SpringApplication.run(DubboProviderApplication.class, args);
	}
}
