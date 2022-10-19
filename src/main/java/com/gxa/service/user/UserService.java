package com.gxa.service.user;

import com.gxa.entity.login.User;

import java.util.Set;

public interface UserService {
    User loginByUserNameAndPwd(String username,String pwd);
    User queryByUserName(String username);
    String queryMenuByUserName(String userName);
    Set<String> queryPermsByUserName(String userName);
    String querySaltByUserName(String userName);
    void updatePwd(String userName,String pwd);
    void updateUserByUser(User user);
}
