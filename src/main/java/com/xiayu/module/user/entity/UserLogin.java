package com.xiayu.module.user.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.xiayu.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Table(name = "t_user_login")
public class UserLogin extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -8926676479970243622L;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "user_id")
    private User user;
    @Column
    private String loginIp;
    @Column
    private String loginBrowser;
    @Column
    private String loginPlace;
    @Column
    private String identifyCode;//验证码
    @Column
    private String loginDomain;

    @JsonBackReference
    public User getUser() {
        return user;
    }

    @JsonBackReference
    public void setUser(User user) {
        this.user = user;
    }
}
