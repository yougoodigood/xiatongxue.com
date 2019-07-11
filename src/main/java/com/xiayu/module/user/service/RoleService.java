package com.xiayu.module.user.service;

import com.xiayu.common.vo.PaginationVO;
import com.xiayu.module.permission.vo.RoleVO;

public interface RoleService {
    PaginationVO getRoleList(PaginationVO paginationVO);

    RoleVO getRole(RoleVO roleVO);

    boolean addRole(RoleVO roleVO);

    boolean deleteRole(RoleVO roleVO);

    boolean updateRole(RoleVO roleVO);
}
