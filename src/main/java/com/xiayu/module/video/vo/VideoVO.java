package com.xiayu.module.video.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class VideoVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = 8052733673642398489L;
    private String videoNumber;
    private int length;
    private int watchTimes;
    private int onlineUsers;
    private List<VideoSegmentInfoVO> videoSegmentInfos;
}
