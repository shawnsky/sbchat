package com.xt.mapper;

import com.xt.entity.User;

import java.util.List;

/**
 * Created by admin on 2017/8/1.
 */
public interface UserMapper {
    User findById(Long id);

    List<User> findByNickname(String nickname);

    void insert(User user);

    void delete(Long id);
}
