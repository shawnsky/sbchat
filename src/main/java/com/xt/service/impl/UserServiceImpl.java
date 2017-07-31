package com.xt.service.impl;

import com.xt.entity.User;
import com.xt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/7/31.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public String login(String username, String password) {
        String pwd = redisTemplate.opsForValue().get("user:"+username);
        if (pwd==null){
            return "1";//user not exists
        }
        if (!pwd.equals(password)){
            return "2";//password wrong
        }
        return "0";//success
    }


    @Override
    public void create(User user) {
        redisTemplate.opsForValue().set("user:"+user.getUsername(), user.getPassword());

    }

    @Override
    public void delete(String username) {
        redisTemplate.delete("user:"+username);
    }
}
