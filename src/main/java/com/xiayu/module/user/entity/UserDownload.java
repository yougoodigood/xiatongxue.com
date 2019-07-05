package com.xiayu.module.user.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.xiayu.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "t_user_download")
public class UserDownload extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -192788668293739770L;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    private String fileId;

    @Column
    private int downloadTime;


    @JsonBackReference
    public User getUser() {
        return user;
    }

    @JsonBackReference
    public void setUser(User user) {
        this.user = user;
    }

}
