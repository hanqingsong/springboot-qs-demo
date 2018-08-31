package com.qingsong.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfiguration {

    @Bean
    public ApplicationConfig applicationConfig(@Value("${spring.application.name}")String name) {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(name);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(@Value("${dubbo.registry.protocol}")String protocol,
                                         @Value("${dubbo.registry.address}") String address) {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol(protocol);
        registryConfig.setAddress(address);
        // registryConfig.setClient("curator");
        return registryConfig;
    }
}