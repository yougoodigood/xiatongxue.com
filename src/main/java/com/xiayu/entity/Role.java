package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Role extends BaseEntity {
    @Id
    @Column
    private String id;
    @Column
    private String roleName;

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
