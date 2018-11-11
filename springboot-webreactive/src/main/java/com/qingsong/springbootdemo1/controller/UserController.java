package com.qingsong.springbootdemo1.controller;

import com.qingsong.springbootdemo1.domain.User;
import com.qingsong.springbootdemo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanqingsong on 18/11/11.
 *
 * @author hanqingsong
 * @date 18/11/11
 */
@RestController
public class UserController {
    private final UserRepository userRepository;

    /**
     * Autowired 可写可不写
     *
     * @param userRepository
     */
    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/person/save")
    public User save(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        boolean save = userRepository.save(user);
        if (save) {
            System.out.printf("用户是：%s 保存成功！ ", user);
        }
        return user;
    }
}
