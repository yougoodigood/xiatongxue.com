package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_video_segment_info")
public class VideoSegmentInfo extends BaseEntity implements Serializable {
    @Id
    private String id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "video_id")
    private Video video;

    @Column
    private int level;

    @Column
    private int start;

    @Column
    private int end;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
