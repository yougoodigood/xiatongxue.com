package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserClassVO extends BaseVO implements Serializable {
    private static final long serialVersionUID = -246863239520460602L;

    private String className;
    private String classNumber;
    private int userAmount;
    private List<UserVO> userVOS;

}
