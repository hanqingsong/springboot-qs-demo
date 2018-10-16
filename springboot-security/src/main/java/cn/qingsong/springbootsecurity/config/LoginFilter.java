package cn.qingsong.springbootsecurity.config;

import org.springframework.core.annotation.Order;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by hanqingsong on 18/10/16.
 *
 * @author hanqingsong
 * @date 18/10/16
 */
//@Order注解表示执行过滤顺序，值越小，越先执行
@Order(1)
//需要在spring-boot的入口处加注解@ServletComponentScan, 如果不指定，默认url-pattern是/*
@WebFilter(filterName = "loginFilter", urlPatterns = {"/*"})
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 获取用户信息
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(principal);
    }


    @Override
    public void destroy() {

    }
}
