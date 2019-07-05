package com.xiayu.vo;

import com.xiayu.common.BaseVO;
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
public class RoleVO extends BaseVO {
    private String roleName;
    private List<Permission> permissions;
}
