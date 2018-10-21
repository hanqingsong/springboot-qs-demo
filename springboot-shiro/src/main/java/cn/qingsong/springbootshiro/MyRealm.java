package cn.qingsong.springbootshiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.springframework.stereotype.Component;

/**
 * 自定义Realm
 */
@Component
public class MyRealm extends AuthenticatingRealm {
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 1. 获取token中用户输入的数据
        String username = authenticationToken.getPrincipal().toString();
        // 2. 根据用户输入的账号，去数据库匹配查询  在这里写死了
        if("qingsong".equals(username)){
            // 3. 将 密码数据交于shiro 的认证器，方便之后的密码校验
            return  new SimpleAuthenticationInfo(username,"123",this.getName());
        }
        return null;
    }
}