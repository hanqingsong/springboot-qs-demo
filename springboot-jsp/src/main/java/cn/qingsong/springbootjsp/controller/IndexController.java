package cn.qingsong.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hanqingsong on 18/9/29.
 *
 * @author hanqingsong
 * @date 18/9/29
 */
@Controller
public class IndexController {
    /**
     * 第一种方式
     * jsp 文件放在 /src/main/webapp/WEB-INF/jsp下
     * 但是需要指定为resources
     * <resources>
     *     <resource>
     *          <directory>src/main/webapp</directory>
     *          <targetPath>META-INF/resources</targetPath>
     *          <includes>
     *          <include>**\/**</include>
	 *          </includes>
	 * 		</resource>
	 * 	</resources>
     */
    @RequestMapping("/index")
    public ModelAndView index(){
        System.out.println("indexxxxx");
        return new ModelAndView("index");
    }

    /**
     * 第二种方式
     * jsp 文件放在 /src/main/resources/META-INF/resources/WEB-INF/jsp/下
     *
     * 两种方式最中都会编译到 /META-INF/resources/WEB-INF/jsp/下
     * @return
     */
    @RequestMapping("/index2")
    public ModelAndView index2(){
        System.out.println("indexxxxx");
        return new ModelAndView("index2");
    }

    @RequestMapping("/index3")
    public String index3(){
        System.out.println("indexxxxx");
        return "index";
    }

    /**
     * 不好使
     * 不编译到 /META-INF/resources/WEB-INF/jsp/下
     * 默认资源路径 {
        "classpath:/META-INF/resources/", "classpath:/resources/",
        "classpath:/static/", "classpath:/public/" };
     * @return
     */
    @RequestMapping("/index4")
    public ModelAndView index4(){
        return new ModelAndView("index4");
    }


    @RequestMapping("/index5")
    public ModelAndView index5(){
        return new ModelAndView("index5");
    }
}
