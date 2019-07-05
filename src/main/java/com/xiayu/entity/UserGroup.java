package com.xiayu.entity;

import com.xiayu.common.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "t_user_group")
public class UserGroup extends BaseEntity implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;
    @Column
    private int groupNumbers;

    @OneToMany(mappedBy = "userGroup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<User> users;

}
