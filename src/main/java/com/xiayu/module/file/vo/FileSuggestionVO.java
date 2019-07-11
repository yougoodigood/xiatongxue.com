package com.xiayu.module.file.vo;

import com.xiayu.common.entity.BaseEntity;
import com.xiayu.module.user.vo.UserVO;
import lombok.Data;

import java.io.Serializable;

@Data
public class FileSuggestionVO extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 5680182332414504024L;

    private UserVO user;
    private ResourceFileVO resourceFile;
    private String suggestion;

}
