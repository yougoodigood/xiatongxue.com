package com.xiayu.vo;

import com.xiayu.common.BaseVO;
import com.xiayu.entity.Role;
import com.xiayu.enumeration.ResourceTypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
