package com.xiayu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_user_download")
public class UserDownload extends BaseEntity implements Serializable {
    @Id
    private String id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    private String fileId;

    @Column
    private int downloadTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonBackReference
    public User getUser() {
        return user;
    }

    @JsonBackReference
    public void setUser(User user) {
        this.user = user;
    }

    public int getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(int downloadTime) {
        this.downloadTime = downloadTime;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
