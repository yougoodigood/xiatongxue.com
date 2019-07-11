package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import com.xiayu.module.video.vo.VideoVO;
import lombok.Data;

import java.io.Serializable;


@Data
public class UserVideoNoteVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = 6965027504140541588L;

    private UserVO user;
    private VideoVO video;
    private String noteContent;

}
