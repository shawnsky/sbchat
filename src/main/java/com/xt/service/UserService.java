package com.xt.service;

import com.xt.entity.User;
import com.xt.entity.UserUser;

import java.util.List;

/**
 * Created by admin on 2017/7/31.
 */
public interface UserService {
    String login(Long id, String password);

    User findById(Long id);

    List<User> findByNickname(String nickname);

    void create(User user);

    void addFriend(Long aId, Long bId);

    List<User> findAllFriends(Long id);


}
