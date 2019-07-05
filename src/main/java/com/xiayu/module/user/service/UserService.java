package com.xiayu.module.user.service;

import com.xiayu.module.user.entity.User;
import com.xiayu.module.user.vo.UserVO;

import java.util.List;

public interface UserService {

    UserVO findById(String id);

    List<UserVO> getUserList();

    User deleteUser(User user);

    User updateUser(User user);

    User addUser(User user);
}
