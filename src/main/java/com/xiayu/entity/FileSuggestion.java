package com.xiayu.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.xiayu.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Table(name = "t_file_suggestion")
public class FileSuggestion extends BaseEntity implements Serializable {

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "file_id")
    private ResourceFile resourceFile;

    @Column
    private String suggestion;

    @JsonBackReference
    public User getUser() {
        return user;
    }

    @JsonBackReference
    public void setUser(User user) {
        this.user = user;
    }

}
