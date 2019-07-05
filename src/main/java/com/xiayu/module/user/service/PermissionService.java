package com.xiayu.module.user.service;

import com.xiayu.common.vo.PaginationVO;
import com.xiayu.module.user.vo.PermissionVO;

public interface PermissionService {

    PaginationVO getPermissionList(PaginationVO paginationVO) throws Exception;

    PermissionVO getPermissionById(PermissionVO permissionVO) throws Exception;

    boolean addPermission(PermissionVO permissionVO) throws Exception;

    boolean deletePermission(PermissionVO permissionVO) throws Exception;

    boolean updatePermission(PermissionVO permissionVO) throws Exception;
}
