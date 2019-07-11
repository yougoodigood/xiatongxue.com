package com.xiayu.module.permission.vo;

import com.xiayu.common.vo.BaseVO;
import com.xiayu.enumeration.ResourceTypeEnum;
import lombok.Data;

import java.io.Serializable;


@Data
public class PermissionVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = 5543788854321691866L;

    private String permissionName;
    private String url;
    private ResourceTypeEnum resourceType;
    private SystemMenuVO systemMenus;
}
