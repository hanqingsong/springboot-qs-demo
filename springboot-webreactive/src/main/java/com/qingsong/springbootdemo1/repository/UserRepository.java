package com.qingsong.springbootdemo1.repository;

import com.qingsong.springbootdemo1.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hanqingsong on 18/11/11.
 *
 * @author hanqingsong
 * @date 18/11/11
 * {@link User} {@link Repository}
 */
@Repository
public class UserRepository {
    /**
     * 采用内存存储方式->Map
     */
    private final ConcurrentHashMap<Integer, User> reposity = new ConcurrentHashMap<>();
    private static final AtomicInteger idGenerator = new AtomicInteger();

    /**
     * 保存用户对象
     *
     * @param user {@link User} 对象
     * @return 如果保存成功返回true，否则返回false
     */
    public boolean save(User user) {
        int id = idGenerator.incrementAndGet();
        user.setId(id);

        return reposity.put(id, user) == null;
    }

    public Collection<User> findAll() {
        return reposity.values();
    }
}
