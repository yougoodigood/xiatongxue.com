package com.xiayu.module.user.controller;

import com.xiayu.common.controller.BaseController;
import com.xiayu.common.message.PaginationMessage;
import com.xiayu.common.message.SimpleMessage;
import com.xiayu.module.user.entity.User;
import com.xiayu.module.user.service.UserService;
import com.xiayu.module.user.vo.UserVO;
import javafx.scene.control.Pagination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public PaginationMessage getUserList(){
        try {
            List<UserVO> userList = userService.getUserList();
            return new PaginationMessage(userList,200,"获取成功",true);
        }catch (Exception e){
            return super.returnPaginationMessage(e);
        }
    }

    @RequestMapping(value = "/findById/{id}",method = RequestMethod.GET)
    public SimpleMessage findById(@RequestParam(value = "id") String id){
        try {
            UserVO userVO = userService.findById(id);
            return new SimpleMessage(userVO);
        }catch (Exception e){
            return super.returnSimpleMessage(e);
        }
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public SimpleMessage deleteUser(@RequestBody User user){
        try {
            userService.deleteUser(user);
            logger.info("delete user ，id:" + user.getId());
            return new SimpleMessage("删除成功");
        }catch (Exception e){
            return super.returnSimpleMessage(e);
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public SimpleMessage updateUser(@RequestBody User user){
        try {
            userService.updateUser(user);
            logger.info("update user,id:" + user.getId());
            return new SimpleMessage("添加成功");
        }catch (Exception e){
            return super.returnSimpleMessage(e);
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.PUT)
    public SimpleMessage addUser(@RequestBody UserVO userVO){
        try {
            userService.addUser(userVO);
            logger.info("add user,loginName:" + userVO.getLoginName());
            return new SimpleMessage("添加成功");
        }catch (Exception e){
            return super.returnSimpleMessage(e);
        }

    }
}
