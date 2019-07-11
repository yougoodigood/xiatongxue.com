package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;

@Data
public class RealtimeCommentsVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = 1799950508575771644L;
    private UserVO user;
    private String videoId;
    private String comment;
    private int videosTime;
    private int fontSize;
    private String color;
}
