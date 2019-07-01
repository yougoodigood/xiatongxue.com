package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_video")
public class Video extends BaseEntity {
    @Id
    private String id;

    @Column
    private String videoNumber;

    @Column
    private int length;

    @Column
    private int watchTimes;

    @Column
    private int onlineUsers;

    @OneToMany(mappedBy = "video",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<VideoSegmentInfo> videoSegmentInfos;
}