package com.xiayu.controller;

import com.xiayu.entity.User;
import com.xiayu.service.UserService;
import com.xiayu.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<UserVO> getUserList(){
        List<UserVO> userList = userService.getUserList();
        logger.info("call getUserList interface");
        return userList;
    }

    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public UserVO findById(@RequestParam(value = "id") String id){
        return userService.findById(id);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public User deleteUser(@RequestBody User user){
        return userService.deleteUser(user);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/add",method = RequestMethod.PUT)
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
