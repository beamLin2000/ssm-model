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
        }else if (userName.equals("zs")){
            user.setSalt("123");
            user.setUserName("zs");
            user.setPwd("e474c7fc72bb61bf146026e78aa11f85");
        }else if (userName.equals("ls")){
            user.setSalt("123");
            user.setUserName("ls");
            user.setPwd("f023a0cc13d2dc6c6f300909baa13aad");
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
