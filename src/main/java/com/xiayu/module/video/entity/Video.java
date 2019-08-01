package com.xiayu.module.video.entity;

import com.xiayu.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "t_video")
public class Video extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 8052733673642398489L;
    @Column
    private String videoNumber;

    @Column
    private int length;

    @Column
    private int watchTimes;

    @Column
    private int onlineUsers;

    @OneToMany(mappedBy = "video", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<VideoSegmentInfo> videoSegmentInfos;

}
