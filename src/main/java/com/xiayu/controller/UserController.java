package com.xiayu.controller;

import com.alibaba.fastjson.JSON;
import com.xiayu.entity.Province;
import com.xiayu.entity.User;
import com.xiayu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Object getUserList(){
        List<User> userList = userService.getUserList();
        logger.info(JSON.toJSON(userList).toString());
        return JSON.toJSON(userList);
//        return null;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public User deleteUser(User user){
        return userService.deleteUser(user);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public User updateUser(User user){
        return userService.updateUser(user);
//        return null;
    }

    @RequestMapping(value = "/add",method = RequestMethod.PUT)
    public User addUser(User user){
//        return userService.addUser(user);
        return null;
    }
}
