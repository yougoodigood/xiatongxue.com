package com.xiayu.service;

import com.xiayu.common.PaginationVO;
import com.xiayu.entity.Permission;
import com.xiayu.vo.PermissionVO;
import javafx.scene.control.Pagination;

import java.util.List;

public interface PermissionService {

    PaginationVO getPermissionList(PaginationVO paginationVO) throws Exception;

    PermissionVO getPermissionById(PermissionVO permissionVO) throws Exception;

    boolean addPermission(PermissionVO permissionVO) throws Exception;

    boolean deletePermission(PermissionVO permissionVO) throws Exception;

    boolean updatePermission(PermissionVO permissionVO) throws Exception;
}
