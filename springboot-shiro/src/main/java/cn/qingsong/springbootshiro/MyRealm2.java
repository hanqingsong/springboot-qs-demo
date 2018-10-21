package cn.qingsong.springbootshiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

/**
 * 自定义Realm
 * Realm是专用于安全框架的DAO.
 * Shiro的认证过程最终会交由Realm执行，
 * 这时会调用Realm的getAuthenticationInfo(token)方法。
 */
@Component
public class MyRealm2 extends AuthorizingRealm {
    /**
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
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

    /**
     * 权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }
}