package com.xt.service.impl;

import com.xt.entity.User;
import com.xt.entity.UserUser;
import com.xt.mapper.UserMapper;
import com.xt.mapper.UserUserMapper;
import com.xt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/7/31.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserUserMapper userUserMapper;

    @Override
    public String login(Long id, String password) {
        User record = userMapper.findById(id);
        if (record==null){
            return "1";//user not exists
        }
        if (!record.getPassword().equals(password)){
            return "2";//password wrong
        }
        return "0";//success
    }

    @Override
    public void create(User user) {
        userMapper.insert(user);

    }

    @Override
    public void addFriend(Long aId, Long bId) {
        UserUser uu = new UserUser();
        uu.setaId(aId);
        uu.setbId(bId);
        userUserMapper.add(uu);
    }


    @Override
    public List<User> findAllFriends(Long id) {
        return userUserMapper.findAllFriends(id);
    }


    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findByNickname(String nickname) {
        return userMapper.findByNickname(nickname);
    }




}
