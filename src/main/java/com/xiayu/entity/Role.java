package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_role")
public class Role extends BaseEntity {
    @Id
    @Column
    private String id;
    @Column
    private String roleName;

    @ManyToMany
    @JoinTable(name = "roles_permission",joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private List<Permission> permissions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
