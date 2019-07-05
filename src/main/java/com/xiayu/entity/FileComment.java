package com.xiayu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.xiayu.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_file_comment")
@Setter
@Getter
public class FileComment extends BaseEntity implements Serializable {

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "file_id")
    private ResourceFile resourceFile;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private String comments;
    @Column
    private int likeTimes;
    @Column
    private int notLikeTimes;

    @JsonBackReference
    public User getUser() {
        return user;
    }

    @JsonBackReference
    public void setUser(User user) {
        this.user = user;
    }
}
