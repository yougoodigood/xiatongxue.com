package com.xiayu.service;

import com.xiayu.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(String id);

    List<User> getUserList();

    User deleteUser(User user);

    User updateUser(User user);

    User addUser(User user);
}
