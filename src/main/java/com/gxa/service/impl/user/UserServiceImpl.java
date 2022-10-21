package com.gxa.service.impl.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.gxa.entity.login.User;
import com.gxa.mapper.user.UserMapper;
import com.gxa.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User loginByUserNameAndPwd(String username, String pwd) {
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq("user_name",username);
        wrapper.eq("pwd",pwd);
        User user= (User) this.userMapper.selectOne(wrapper);
        return user;
    }

    @Override
    public User queryByUserName(String username) {
        QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.eq("user_name",username);

        User user= (User) this.userMapper.selectOne(wrapper);
        return user;
    }

    @Override
    public String queryMenuByUserName(String userName) {
        String menu = this.userMapper.queryMenuByUserName(userName);

        return menu;
    }

    @Override
    public Set<String> queryPermsByUserName(String userName) {
        Set<String> perms = this.userMapper.queryPermsByUserName(userName);
        return perms;
    }

    @Override
    public String querySaltByUserName(String userName) {

        String salt = this.userMapper.querySaltByUserName(userName);

        return salt;
    }

    @Override
    public void updatePwd(String userName,String pwd) {
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.eq("user_name",userName);
        User user = new User();
        user.setUserName(userName);
        user.setPwd(pwd);
        this.userMapper.update(user,userUpdateWrapper);
    }

    @Override
    public void updateUserByUser(User user) {
        UpdateWrapper updateWrapper = new UpdateWrapper();
        updateWrapper.eq("user_name",user.getUserName());
        this.userMapper.update(user,updateWrapper);
    }

    @Override
    public void updateTokenByUser(String token,User user) {
       this.userMapper.updateTokenByUser(token,user);
    }

    @Override
    public String queryToken(String token) {
        String token1 = this.userMapper.queryToken(token);
        return token1;
    }
}
