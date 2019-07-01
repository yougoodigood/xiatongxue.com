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

    @OneToMany(mappedBy = "video", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<VideoSegmentInfo> videoSegmentInfos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVideoNumber() {
        return videoNumber;
    }

    public void setVideoNumber(String videoNumber) {
        this.videoNumber = videoNumber;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWatchTimes() {
        return watchTimes;
    }

    public void setWatchTimes(int watchTimes) {
        this.watchTimes = watchTimes;
    }

    public int getOnlineUsers() {
        return onlineUsers;
    }

    public void setOnlineUsers(int onlineUsers) {
        this.onlineUsers = onlineUsers;
    }

    public List<VideoSegmentInfo> getVideoSegmentInfos() {
        return videoSegmentInfos;
    }

    public void setVideoSegmentInfos(List<VideoSegmentInfo> videoSegmentInfos) {
        this.videoSegmentInfos = videoSegmentInfos;
    }
}
