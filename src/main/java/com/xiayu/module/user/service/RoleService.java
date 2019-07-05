package com.xiayu.module.user.service;

import com.xiayu.module.user.vo.RoleVO;

import java.util.List;

public interface RoleService {
    List<RoleVO> getRoleList();

    RoleVO getRole();

    boolean addRole();

    boolean deleteRole();
}
