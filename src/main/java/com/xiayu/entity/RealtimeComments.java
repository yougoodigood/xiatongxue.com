package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "t_realtime_comments")
public class RealtimeComments extends BaseEntity {
    @Id
    private String id;
    @OneToMany
    @JoinColumn(name = "user_id")
    private User user;

//    @OneToMany
//    @JoinColumn(name = "video_id")
//    private Video video;

    @Column
    private String comment;

    @Column
    private int videosTime;

    @Column
    private int fontSize;

    @Column
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getVideosTime() {
        return videosTime;
    }

    public void setVideosTime(int videosTime) {
        this.videosTime = videosTime;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
