package com.xiayu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_user_like_comment")
public class UserLikeComment extends BaseEntity implements Serializable {
    @Id
    private String id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "comment_id")
    private FileComment fileComment;

    @Column
    private boolean isLike;

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

    public FileComment getFileComment() {
        return fileComment;
    }

    public void setFileComment(FileComment fileComment) {
        this.fileComment = fileComment;
    }

    public boolean isLike() {
        return isLike;
    }

    public void setLike(boolean like) {
        isLike = like;
    }
}
