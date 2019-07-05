package com.xiayu.service;

import com.xiayu.entity.User;
import com.xiayu.vo.UserVO;

import java.util.List;

public interface UserService {

    UserVO findById(String id);

    List<UserVO> getUserList();

    User deleteUser(User user);

    User updateUser(User user);

    User addUser(User user);
}
