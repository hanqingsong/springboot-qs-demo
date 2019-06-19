package com.qingsong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootListenerApplication.class, args);
	}

}
