package com.xiayu.common.response;

import com.xiayu.common.BaseResponse;
import com.xiayu.entity.Permission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Classname RoleResponse
 * @Description
 * @Author hello
 * @Date 2019/7/3 11:54
 * @Version 1.0
 **/
@Setter
@Getter
public class RoleResponse extends BaseResponse {
    private String roleName;
    private List<Permission> permissions;
}
