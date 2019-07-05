package com.xiayu.controller;

import com.xiayu.common.BaseController;
import com.xiayu.service.RoleService;
import com.xiayu.vo.RoleVO;
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
