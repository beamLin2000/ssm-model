package com.gxa.realm.login;

import com.gxa.entity.login.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;


public class UserRealm extends AuthorizingRealm {

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("-------------------认证方法---------------------");

        UsernamePasswordToken utoken = (UsernamePasswordToken) authenticationToken;
        String userName = utoken.getUsername();

        System.out.println(userName);

        User user = new User();

        if (userName.equals("admin")){
            user.setSalt("123");
            user.setUserName("admin");
            user.setPwd("3bcbb857c763d1429a24959cb8de2593");
        }else if (userName.equals("doctor")){
            user.setSalt("123");
            user.setUserName("doctor");
            user.setPwd("9c3b5c0672cd599ccf1019bddaa8089b");
        }else if (userName.equals("finance")){
            user.setSalt("123");
            user.setUserName("finance");
            user.setPwd("9c3b5c0672cd599ccf1019bddaa8089b");
        }

        ByteSource salt = ByteSource.Util.bytes(user.getSalt());
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user,user.getPwd(),salt,this.getName());

        return authenticationInfo;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }


}
