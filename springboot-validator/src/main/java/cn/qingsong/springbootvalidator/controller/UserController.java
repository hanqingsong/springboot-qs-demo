package cn.qingsong.springbootvalidator.controller;

import cn.qingsong.springbootvalidator.controller.validator.BookValidator;
import cn.qingsong.springbootvalidator.controller.validator.UserValidator;
import cn.qingsong.springbootvalidator.model.Book;
import cn.qingsong.springbootvalidator.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Created by hanqingsong on 18/9/25.
 *
 * @author hanqingsong
 * @date 18/9/25
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserValidator userValidator;
    @Autowired
    private BookValidator bookValidator;

    /**
     * 由 @InitBinder 标识的方法,可以对 WebDataBinder 对象进行初始化。设置一些初始化操作。
     * WebDataBinder 是 DataBinder 的子类,用于完成由表单字段到 JavaBean 属性的绑定。
     * 只对当前的Controller有效。
     * value 可以指定对哪个参数进行一些初始化操作，默认是对所有的参数进行初始化操作。
     *
     * 如果指定book会在映射参数到book对象时，调用bookValidator进行参数校验
     * @param binder
     */
    @InitBinder(value = {"book"})
    protected void initBinder(final ServletRequestDataBinder binder) {
        // binder.setValidator(userValidator);
        binder.setValidator(bookValidator);
        System.out.println("book");
    }

    @InitBinder(value = {"user"})
    protected void initBinderUser(final ServletRequestDataBinder binder) {
        // binder.setValidator(userValidator);
        // binder.setValidator(userValidator);
        System.out.println("user");

    }


    @ResponseBody
    @RequestMapping("/info")
    public Object getInfo(HttpServletRequest request, HttpServletResponse response,
                          User user, @Valid Book book) {
        System.out.println("user:"+user);
        System.out.println("book:"+book);
        return user;
    }
}
