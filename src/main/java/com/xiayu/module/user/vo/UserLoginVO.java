package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;
import java.io.Serializable;

@Data
public class UserLoginVO extends BaseVO implements Serializable {
    private static final long serialVersionUID = -8926676479970243622L;
    private UserVO user;
    private String loginIp;
    private String loginBrowser;
    private String loginPlace;
    private String identifyCode;
    private String loginDomain;
}
