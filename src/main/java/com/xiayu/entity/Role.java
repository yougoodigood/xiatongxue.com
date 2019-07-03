package com.xiayu.entity;

import com.xiayu.common.BaseEntity;
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
    @Id
    private String id;
    @Column
    private String roleName;

    @ManyToMany
    @JoinTable(name = "t_roles_permission", joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private List<Permission> permissions;
}
