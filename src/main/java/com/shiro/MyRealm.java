package com.shiro;

import com.pojo.User;
import com.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("myRealm")
public class MyRealm extends AuthorizingRealm {
    @Resource
    private IUserService iUserService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        AuthenticationInfo info = null;
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        char[] pwd = token.getPassword();
        String password = new String(pwd);
        User user = iUserService.login(username, password);
        if(user != null){
            info = new SimpleAuthenticationInfo(username,password,getName());
        }
        return info;
    }
}
