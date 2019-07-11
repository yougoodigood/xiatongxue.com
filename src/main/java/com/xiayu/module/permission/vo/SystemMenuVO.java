package com.xiayu.module.permission.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Classname SystemMenu
 * @Description
 * @Author hello
 * @Date 2019/7/11 11:56
 * @Version 1.0
 **/

@Data
public class SystemMenuVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = 5543788854321691866L;

    private String menuName;

    private String parentId;

    private String navigateUrl;

    private String menuCssId;

    private int orderSeq;

    private List<PermissionVO> permissions;

    private List<RoleVO> roles;
}
