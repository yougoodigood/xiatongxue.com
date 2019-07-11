package com.xiayu.module.course.service;

import com.xiayu.module.user.entity.User;
import com.xiayu.module.user.vo.UserVO;

import java.util.List;

public interface UserService {

    UserVO findById(String id) throws Exception;

    List<UserVO> getUserList() throws Exception;

    User deleteUser(User user) throws Exception;

    User updateUser(User user) throws Exception;

    User addUser(UserVO userVO) throws Exception;

    UserVO findByDelflagIsFalseAndLoginName(String loginName);
}
