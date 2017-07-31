package com.xt.service;

import com.xt.entity.User;

/**
 * Created by admin on 2017/7/31.
 */
public interface UserService {
    String login(String username, String password);

    void create(User user);

    void delete(String username);
}
