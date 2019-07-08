package com.xiayu.module.user.service.serviceimpl;

import com.xiayu.common.util.AgeUtil;
import com.xiayu.common.util.MD5;
import com.xiayu.module.user.entity.User;
import com.xiayu.module.user.repository.UserRepository;
import com.xiayu.module.user.service.UserService;
import com.xiayu.module.user.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * UserServiceImpl
 *
 * @author  sunliqian
 * Date 2019/7/2
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserVO findById(String id) throws Exception {
        User user = userRepository.findById(id).get();
        UserVO userVO = new UserVO();
        userVO.setId(user.getId());
        userVO.setAge(user.getAge());
        userVO.setBirthday(user.getBirthday());
        return userVO;
    }

    @Override
    public List<UserVO> getUserList() throws Exception{
        List<User> users = userRepository.findAll();
        List<UserVO> userVOS = new ArrayList<>();
        users.forEach(user -> {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(user,userVO);
            userVOS.add(userVO);
        });
        return userVOS;
    }

    @Override
    public User deleteUser(User user) throws Exception {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) throws Exception {
        return userRepository.save(user);
    }

    @Override
    public User addUser(UserVO userVO) throws Exception{
        User user = new User();
        user.setNickname(userVO.getNickname());
        user.setPassword(MD5.md5(userVO.getPassword()));
        user.setEmail(userVO.getEmail());
        user.setPicture(userVO.getPicture());
        user.setBirthday(userVO.getBirthday());
        user.setAge(AgeUtil.getAge(userVO.getBirthday()));
        user.setLoginName(userVO.getLoginName());
        user.setPhone(userVO.getPhone());
        return userRepository.save(user);
    }
}
