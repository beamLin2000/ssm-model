package com.gxa.realm.login;

import com.gxa.entity.login.User;
import com.gxa.service.impl.user.UserServiceImpl;
import com.gxa.service.user.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;


public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserServiceImpl userService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("-------------------认证方法---------------------");

        UsernamePasswordToken utoken = (UsernamePasswordToken) authenticationToken;
        String userName = utoken.getUsername();

        System.out.println(userName);

        User user = this.userService.queryByUserName(userName);

        ByteSource salt = ByteSource.Util.bytes(user.getSalt());
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user,user.getPwd(),salt,this.getName());

        return authenticationInfo;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("-------------------授权方法------------------------");

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        User user = (User) principalCollection.getPrimaryPrincipal();

        String userName = user.getUserName();

        Set<String> perms = this.userService.queryPermsByUserName(userName);

        System.out.println(perms);

        authorizationInfo.addStringPermissions(perms);

        return authorizationInfo;
    }

}
