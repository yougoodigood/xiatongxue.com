package com.xiayu.module.permission.controller;

import com.xiayu.common.controller.BaseController;
import com.xiayu.module.user.service.RoleService;
import com.xiayu.module.user.vo.RoleVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/role")
public class RoleController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RoleService roleService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<RoleVO> getRoleList(){
        return roleService.getRoleList();
    }
}
