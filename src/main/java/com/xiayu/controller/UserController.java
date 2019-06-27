package com.xiayu.controller;

import com.xiayu.entity.User;
import com.xiayu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public User deleteUser(User user){
        return userService.deleteUser(user);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public User updateUser(User user){
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/add",method = RequestMethod.PUT)
    public User addUser(User user){
        return userService.addUser(user);
    }
}
