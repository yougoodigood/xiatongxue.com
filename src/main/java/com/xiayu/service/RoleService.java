package com.xiayu.service;

import com.xiayu.common.response.RoleResponse;

import java.util.List;

public interface RoleService {
    List<RoleResponse> getRoleList();

    RoleResponse getRole();

    boolean addRole();

    boolean deleteRole();
}
