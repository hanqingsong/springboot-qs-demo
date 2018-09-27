package cn.qingsong.springbootswagger2.controller;

import cn.qingsong.springbootswagger2.model.Book;
import cn.qingsong.springbootswagger2.model.User;
import cn.qingsong.springbootswagger2.result.WebResponse;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by hanqingsong on 18/9/27.
 *
 * @author hanqingsong
 * @date 18/9/27
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @GetMapping("/info")
    public WebResponse getInfo(String lid) {
        Map<String, Object> map = Maps.newHashMap();
        return new WebResponse();
    }

    @ResponseBody
    @PostMapping("/save")
    public WebResponse saveInfo(@RequestBody User user) {
        Map<String, Object> map = Maps.newHashMap();
        return new WebResponse();
    }

}
