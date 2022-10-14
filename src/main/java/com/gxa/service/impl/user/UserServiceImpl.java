package com.gxa.service.impl.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
}
