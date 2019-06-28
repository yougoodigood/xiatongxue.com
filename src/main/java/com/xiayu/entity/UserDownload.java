package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "t_user_download")
public class UserDownload extends BaseEntity {
    @Id
    private String id;
    @OneToMany
    @JoinColumn(name = "user_id")
    private User user;
//    @OneToMany
//    @JoinColumn(name = "file_id")
//    private File file;
    @Column
    private int downloadTime;

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

    public int getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(int downloadTime) {
        this.downloadTime = downloadTime;
    }
}
