package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user_group")
public class UserGroup extends BaseEntity {
    @Id
    @Column
    private String id;
    @Column(name = "role_id")
    private Role role;
    @Column
    private int groupNumbers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getGroupNumbers() {
        return groupNumbers;
    }

    public void setGroupNumbers(int groupNumbers) {
        this.groupNumbers = groupNumbers;
    }
}
