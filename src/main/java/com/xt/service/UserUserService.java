package com.xt.service;

import com.xt.entity.User;
import com.xt.entity.UserUser;

import java.util.List;

/**
 * Created by admin on 2017/8/2.
 */
public interface UserUserService {
    void add(UserUser userUser);

    void remove(UserUser userUser);

    List<User> findAllFriends(Long id);
}
