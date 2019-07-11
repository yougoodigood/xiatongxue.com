package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import com.xiayu.module.permission.entity.Role;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserGroupVO extends BaseVO implements Serializable {
    private static final long serialVersionUID = -5603792053474838504L;
    private Role role;
    private int groupNumbers;
    List<UserVO> userVOS;
}
