package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_video_segment_info")
public class VideoSegmentInfo extends BaseEntity implements Serializable {

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "video_id")
    private Video video;

    @Column
    private int level;

    @Column
    private int start;

    @Column
    private int end;

}
