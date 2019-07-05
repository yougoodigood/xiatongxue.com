package com.xiayu.module.user.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.xiayu.common.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_realtime_comments")
public class RealtimeComments extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1799950508575771644L;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "user_id")
    private User user;
    @Column
    private String videoId;
    @Column
    private String comment;
    @Column
    private int videosTime;
    @Column
    private int fontSize;
    @Column
    private String color;

    @JsonBackReference
    public User getUser() {
        return user;
    }
    @JsonBackReference
    public void setUser(User user) {
        this.user = user;
    }
}
