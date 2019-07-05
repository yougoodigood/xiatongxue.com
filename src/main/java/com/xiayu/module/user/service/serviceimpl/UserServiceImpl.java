package com.xiayu.module.user.service.serviceimpl;

import com.xiayu.module.user.entity.User;
import com.xiayu.module.user.repository.UserRepository;
import com.xiayu.module.user.service.UserService;
import com.xiayu.module.user.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    public UserVO findById(String id) {
        User user = userRepository.findById(id).get();
        UserVO userVO = new UserVO();
        userVO.setId(user.getId());
        userVO.setAge(user.getAge());
        userVO.setBirthday(user.getBirthday());
        return userVO;
    }

    @Override
    public List<UserVO> getUserList() {
//        return userRepository.findAll();
        return null;
    }

    @Override
    public User deleteUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User addUser(User user){
        return userRepository.save(user);
    }
}
