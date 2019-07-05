package com.xiayu.module.permission.controller;

import com.xiayu.common.controller.BaseController;
import com.xiayu.common.message.PaginationMessage;
import com.xiayu.common.vo.PaginationVO;
import com.xiayu.common.message.SimpleMessage;
import com.xiayu.enumeration.MessageErrorEnum;
import com.xiayu.module.user.service.PermissionService;
import com.xiayu.module.user.vo.PermissionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/permission")
public class PermissionController extends BaseController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PermissionService permissionService;

    @GetMapping(value = "/getList")
    public PaginationMessage getPermissionList(PaginationVO paginationVO){
        try {
            PaginationVO result = permissionService.getPermissionList(paginationVO);
            return new PaginationMessage(result,200, MessageErrorEnum.SUCCESS.getInfo(),true);
        }catch (Exception e){
            return super.returnPaginationMessage(e);
        }
    }

    @PutMapping(value = "/add")
    public SimpleMessage getPermission(PermissionVO permissionVO){
        try {
            permissionService.addPermission(permissionVO);
            return new SimpleMessage("success",200, MessageErrorEnum.SUCCESS.getInfo(),true);
        }catch (Exception e){
            logger.error("/permission/add:" ,e.getCause());
            return super.returnSimpleMessage(e);
        }
    }

    @DeleteMapping(value = "/delete")
    public SimpleMessage deletePermission(PermissionVO permissionVO){
        try {
            permissionService.deletePermission(permissionVO);
            return new SimpleMessage("success",200, MessageErrorEnum.SUCCESS.getInfo(),true);
        }catch (Exception e){
            logger.error("/permission/delete:" ,e.getCause());
            return new SimpleMessage(e.getCause().toString(),500, MessageErrorEnum.UNKNOWN.getInfo(),false);
        }
    }

    @PutMapping(value = "/update")
    public SimpleMessage updatePermission(PermissionVO permissionVO){
        try {
            permissionService.updatePermission(permissionVO);
            return new SimpleMessage("success",200, MessageErrorEnum.SUCCESS.getInfo(),true);
        }catch (Exception e){
            logger.error("/permission/update:",e);
            return super.returnSimpleMessage(e);
        }
    }

    @GetMapping(value = "/getById")
    public SimpleMessage getPermissionById(PermissionVO permissionVO){
        try {
            permissionService.getPermissionById(permissionVO);
            return new SimpleMessage(permissionVO,200, MessageErrorEnum.SUCCESS.getInfo(),true);
        }catch (Exception e){
            logger.error("/permission/getById:" ,e.getMessage());
            return super.returnSimpleMessage(e);
        }
    }
}