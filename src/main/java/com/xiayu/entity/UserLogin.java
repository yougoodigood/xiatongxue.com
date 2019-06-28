package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "t_user_login")
public class UserLogin extends BaseEntity {
    @Id
    @Column
    private String id;
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
    @JoinColumn(name="user_id")
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginBrowser() {
        return loginBrowser;
    }

    public void setLoginBrowser(String loginBrowser) {
        this.loginBrowser = loginBrowser;
    }

    public String getLoginPlace() {
        return loginPlace;
    }

    public void setLoginPlace(String loginPlace) {
        this.loginPlace = loginPlace;
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode;
    }

    public String getLoginDomain() {
        return loginDomain;
    }

    public void setLoginDomain(String loginDomain) {
        this.loginDomain = loginDomain;
    }
}
