package cn.qingsong.springbootshiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.junit.Test;

/**
 * Created by hanqingsong on 18/10/20.
 *
 * @author hanqingsong
 * @date 18/10/20
 */
public class ShiroTest {
    /**
     * ini 文件配置
     */
    @Test
    public void test1() {
        //        1.加载配置文件 初始化安全管理器工厂
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        //        2.从工厂中获取安全管理器（安全管理器是shiro的核心）
        SecurityManager securityManager = factory.getInstance();
        //        3.获取认证的主体 需要将安全管理器注入工具类
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            Object principal = subject.getPrincipal();
            System.out.println("已认证" + principal);
            return;
        }
        //        4.通过主体完成认证 需要token封装用户输入的信息（我们在此使用模拟数据） 然后与数据库中保存的用户数据进行比较（在此使用的是ini中的临时数据 之后的版本会连接数据库）
        UsernamePasswordToken token = new UsernamePasswordToken("qingsong", "123");
        try {
            // 登录验证
            subject.login(token);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (subject.isAuthenticated()) {
            Object principal = subject.getPrincipal();
            System.out.println("已认证" + principal);
            // 判断是否有某个role
            boolean admin = subject.hasRole("admin");
            boolean user = subject.hasRole("user");

            // 退出登录
            subject.logout();
        }
    }

    /**
     * 自定义Realm
     */
    @Test
    public void test2() {
        // 1. 安全管理器
        DefaultSecurityManager securityManager = new DefaultSecurityManager();
        // 2. 设置自定义Realm
        MyRealm myRealm = new MyRealm();
        securityManager.setRealm(myRealm);

        // 3. 获取认证的主体 需要将安全管理器注入工具类
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            Object principal = subject.getPrincipal();
            System.out.println("已认证" + principal);
            return;
        }
        // 4.通过主体完成认证 需要token封装用户输入的信息（我们在此使用模拟数据） 然后与数据库中保存的用户数据进行比较（在此使用的是ini中的临时数据 之后的版本会连接数据库）
        UsernamePasswordToken token = new UsernamePasswordToken("qingsong", "123");
        try {
            // 登录验证
            subject.login(token);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (subject.isAuthenticated()) {
            Object principal = subject.getPrincipal();
            System.out.println("已认证" + principal);
            // 判断是否有某个role
            boolean admin = subject.hasRole("admin");
            boolean user = subject.hasRole("user");

            // 退出登录
            subject.logout();
        }
    }
}
