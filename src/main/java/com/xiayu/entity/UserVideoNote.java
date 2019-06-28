package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "t_user_video_note")
public class UserVideoNote extends BaseEntity {
    @Id
    private String id;

    @OneToMany
    @JoinColumn(name = "user_id")
    private User user;

//    @OneToMany
//    @JoinColumn(name = "video_id")
//    private Video video;

    @Column
    private String noteContent;

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

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
}
