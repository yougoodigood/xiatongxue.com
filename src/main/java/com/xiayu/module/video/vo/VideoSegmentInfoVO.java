package com.xiayu.module.video.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;

@Data
public class VideoSegmentInfoVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = -4451132022275546948L;
    private VideoVO videoVO;
    private int level;
    private int start;
    private int end;

}
