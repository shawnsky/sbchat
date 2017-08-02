package com.xt.service.impl;

import com.xt.entity.User;
import com.xt.entity.UserUser;
import com.xt.mapper.UserUserMapper;
import com.xt.service.UserUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/8/2.
 */
@Service("userUserService")
public class UserUserServiceImpl implements UserUserService{

    @Autowired
    private UserUserMapper userUserMapper;

    @Override
    public void add(UserUser userUser) {
        userUserMapper.add(userUser);
    }

    @Override
    public void remove(UserUser userUser) {
        userUserMapper.remove(userUser);
    }

    @Override
    public List<User> findAllFriends(Long id) {
        return userUserMapper.findAllFriends(id);
    }
}
