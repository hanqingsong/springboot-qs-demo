package cn.qingsong.springbootswagger2.model;

/**
 * Created by hanqingsong on 18/9/25.
 *
 * @author hanqingsong
 * @date 18/9/25
 */
public class User {
    private String name;
    private String password;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
