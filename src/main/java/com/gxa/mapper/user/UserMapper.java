package com.gxa.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.login.User;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

public interface UserMapper extends BaseMapper<User> {

    String queryMenuByUserName(String userName);

    Set<String> queryPermsByUserName(String userName);


    String querySaltByUserName(String userName);
}
