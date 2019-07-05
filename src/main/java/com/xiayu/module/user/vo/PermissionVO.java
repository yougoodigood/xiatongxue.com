package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import com.xiayu.module.permission.entity.Role;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Classname PermissionResponse
 * @Description
 * @Author hello
 * @Date 2019/7/4 13:15
 * @Version 1.0
 **/
@Setter
@Getter
public class PermissionVO extends BaseVO {

    @NotNull
    private String permissionName;

    @NotNull
    private String url;

    @NotNull
    private String resourceType;

    private List<Role> roles;
}
