package com.xiayu.module.permission.entity;

import com.xiayu.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_role")
@Setter
@Getter
public class Role extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1049186231793257493L;
    @Column
    private String roleName;

    @ManyToMany
    @JoinTable(name = "t_role_menu",joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<SystemMenu> systemMenu;
}
