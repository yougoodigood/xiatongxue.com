package com.xiayu.module.permission.controller;

import com.xiayu.common.controller.BaseController;
import com.xiayu.common.message.SimpleMessage;
import com.xiayu.common.vo.PaginationVO;
import com.xiayu.enumeration.MessageErrorEnum;
import com.xiayu.module.permission.vo.RoleVO;
import com.xiayu.module.user.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/role")
public class RoleController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RoleService roleService;

    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public ModelAndView getRoleList(@RequestBody PaginationVO paginationVO){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("permission/role");
        PaginationVO result = roleService.getRoleList(paginationVO);
        modelAndView.setViewName("permission/role");
        modelAndView.addObject("result",result);
        return modelAndView;
    }

    @PostMapping(value = "/add")
    public SimpleMessage getRole(@RequestBody RoleVO roleVO){
        try {
            roleService.addRole(roleVO);
            return new SimpleMessage("success",200, MessageErrorEnum.SUCCESS.getInfo(),true);
        }catch (Exception e){
            logger.error("/permission/add:" ,e.getCause());
            return super.returnSimpleMessage(e);
        }
    }

    @DeleteMapping(value = "/delete")
    public SimpleMessage deleteRole(@RequestBody RoleVO roleVO){
        try {
            roleService.deleteRole(roleVO);
            return new SimpleMessage("success",200, MessageErrorEnum.SUCCESS.getInfo(),true);
        }catch (Exception e){
            logger.error("/role/delete:" ,e.getCause());
            return new SimpleMessage(e.getCause().toString(),500, MessageErrorEnum.UNKNOWN.getInfo(),false);
        }
    }

    @PutMapping(value = "/update")
    public SimpleMessage updatePermission(@RequestBody RoleVO roleVO){
        try {
            roleService.updateRole(roleVO);
            return new SimpleMessage("success",200, MessageErrorEnum.SUCCESS.getInfo(),true);
        }catch (Exception e){
            logger.error("/role/update:",e);
            return super.returnSimpleMessage(e);
        }
    }

    @GetMapping(value = "/getById")
    public SimpleMessage getPermissionById(@RequestBody RoleVO roleVO){
        try {
            roleService.getRole(roleVO);
            return new SimpleMessage(roleVO,200, MessageErrorEnum.SUCCESS.getInfo(),true);
        }catch (Exception e){
            logger.error("/role/getById:" ,e.getMessage());
            return super.returnSimpleMessage(e);
        }
    }
}
