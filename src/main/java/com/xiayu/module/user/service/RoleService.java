package com.xiayu.module.user.service;

import com.xiayu.common.vo.PaginationVO;
import com.xiayu.module.user.vo.RoleVO;

import java.util.List;

public interface RoleService {
    PaginationVO getRoleList(PaginationVO paginationVO);

    RoleVO getRole(RoleVO roleVO);

    boolean addRole(RoleVO roleVO);

    boolean deleteRole(RoleVO roleVO);

    boolean updateRole(RoleVO roleVO);
}
