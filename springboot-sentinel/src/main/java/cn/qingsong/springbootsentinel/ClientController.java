package cn.qingsong.springbootsentinel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author hanqingsong
 * @version 1.0
 * @date 2019-06-13 19:36
 */
@Controller
@RequestMapping("client")
public class ClientController {
    @RequestMapping(value = "/hello", method = GET)
    @ResponseBody
    public Object get() {
        return "hello1";
    }
}
