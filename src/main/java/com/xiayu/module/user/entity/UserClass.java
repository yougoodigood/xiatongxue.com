package com.xiayu.module.user.entity;

import com.xiayu.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "t_user_class")
public class UserClass extends BaseEntity implements Serializable {
    @Column
    private String className;
    @Column
    private String classNumber;
    @Column
    private int userAmount;

    @OneToMany(mappedBy = "userClass", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> users;//文章列表

}
