package com.xiayu.module.video.entity;

import com.xiayu.common.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_video_segment_info")
public class VideoSegmentInfo extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -4451132022275546948L;
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
