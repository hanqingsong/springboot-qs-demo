package com.qingsong.springbootdemo1.domain;

/**
 * Created by hanqingsong on 18/11/11.
 * 用户模型
 * @author hanqingsong
 * @date 18/11/11
 */
public class User {
    private int id;
    /**
     * 用户名称
     */
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
