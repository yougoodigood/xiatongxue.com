package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_user_group")
public class UserGroup extends BaseEntity {
    @Id
    @Column
    private String id;
    @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;
    @Column
    private int groupNumbers;

    @OneToMany(mappedBy = "userGroup",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    List<User> users;

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
