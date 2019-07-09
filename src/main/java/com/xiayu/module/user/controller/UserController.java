package com.xiayu.module.user.controller;

import com.xiayu.common.controller.BaseController;
import com.xiayu.common.message.PaginationMessage;
import com.xiayu.common.message.SimpleMessage;
import com.xiayu.common.util.VerificationImageUtils;
import com.xiayu.module.user.entity.User;
import com.xiayu.module.user.service.UserService;
import com.xiayu.module.user.vo.UserVO;
import javafx.scene.control.Pagination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${session.MaxInactiveInterval}")
    private int maxInactiveInterval;

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

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
        try {
            HttpSession session = request.getSession(true);
            session.setMaxInactiveInterval(this.maxInactiveInterval);
            ModelAndView modelAndView = new ModelAndView("user/login");
            return modelAndView;
        }catch (Exception e){
        }
        return  null;
    }

    @RequestMapping(value = "/changeVerification",method = RequestMethod.GET)
    public void changeVerification(HttpServletRequest request,HttpServletResponse response){
        try {
            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/jpeg");
            String verifyCode = VerificationImageUtils.generateVerifyCode(4);
            HttpSession session = request.getSession(false);
            session.setAttribute("verifiedCode", verifyCode.toLowerCase());
            int w = 200, h = 80;
            VerificationImageUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
        }catch (Exception e){
        }
    }


}
