package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDownloadVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = -192788668293739770L;
    private UserVO userVO;
    private String fileId;
    private int downloadTime;
}
