package com.xiayu.service;

import com.xiayu.vo.RoleVO;

import java.util.List;

public interface RoleService {
    List<RoleVO> getRoleList();

    RoleVO getRole();

    boolean addRole();

    boolean deleteRole();
}
