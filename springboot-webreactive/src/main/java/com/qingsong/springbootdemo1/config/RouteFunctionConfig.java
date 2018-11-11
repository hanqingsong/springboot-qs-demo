package com.qingsong.springbootdemo1.config;

import com.qingsong.springbootdemo1.domain.User;
import com.qingsong.springbootdemo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collection;

/**
 * Created by hanqingsong on 18/11/11.
 * 路由器函数配置
 *
 * @author hanqingsong
 * @date 18/11/11
 */
@Configuration
public class RouteFunctionConfig {
    /**
     * 异步非阻塞方式，提高吞吐量
     * <p>
     * Flux 0-N 个对象集合
     * Mono 0-1 个对象集合
     * Reactive 中的Flux或者Mono是异步处理
     *
     * @param userRepository
     * @return
     */
    @Bean
    @Autowired
    public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository) {

       return RouterFunctions.route(RequestPredicates.GET("/person/find/all"),
                request -> {
                    // 返回集合对象
                    Collection<User> users = userRepository.findAll();
                    Mono<ServerResponse> responseMono = null;
                    Flux<User> userFlux = Flux.fromIterable(users);

                    return ServerResponse.ok().body(userFlux, User.class);
                });
    }
}
