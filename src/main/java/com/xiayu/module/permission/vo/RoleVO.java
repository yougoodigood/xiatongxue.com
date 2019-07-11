package com.xiayu.module.permission.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RoleVO extends BaseVO implements Serializable {
    private static final long serialVersionUID = 1049186231793257493L;
    private String roleName;
    private List<SystemMenuVO> systemMenu;
}
