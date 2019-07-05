package com.xiayu.module.user.entity;

import com.xiayu.common.entity.BaseEntity;
import com.xiayu.module.permission.entity.Role;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "t_user_group")
public class UserGroup extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -5603792053474838504L;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;
    @Column
    private int groupNumbers;

    @OneToMany(mappedBy = "userGroup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<User> users;

}
