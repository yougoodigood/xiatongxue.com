package com.xiayu.module.file.vo;


import com.xiayu.common.vo.BaseVO;
import com.xiayu.module.user.vo.UserVO;
import lombok.Data;

import java.io.Serializable;

@Data
public class FileCommentVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = 4573558360943527403L;
    private ResourceFileVO resourceFile;
    private UserVO user;
    private String comments;
    private int likeTimes;
    private int notLikeTimes;
}
