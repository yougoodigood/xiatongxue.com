package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import com.xiayu.module.file.entity.FileComment;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserLikeCommentVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = -3169674533156113469L;

    private UserVO user;

    private FileComment fileComment;

    private boolean isLike;

}
