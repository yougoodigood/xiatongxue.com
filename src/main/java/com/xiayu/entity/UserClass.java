package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_user_class")
public class UserClass extends BaseEntity {
    @Id
    private String id;
    @Column
    private String className;
    @Column
    private String classNumber;
    @Column
    private int userAmount;

    @OneToMany(mappedBy = "userClass",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<User> users;//文章列表

    public int getUserAmount() {
        return userAmount;
    }

    public void setUserAmount(int userAmount) {
        this.userAmount = userAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
