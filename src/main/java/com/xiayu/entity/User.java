package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "t_user")
public class User extends BaseEntity {
    @Id
    private String id;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
    @JoinColumn(name="user_class_id")
    private UserClass userClass;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional=false)
    @JoinColumn(name="user_group_id")
    private UserGroup userGroup;
    @Column
    private int userNumber;
    @Column
    private String nickname;
    @Column
    private String loginName;
    @Column
    private String password;
    @Column
    private int age;
    @Column
    private Date birthday;
    @Column
    private String telephone;
    @Column
    private String email;
    @Column
    private boolean isPhoneChecked;
    @Column
    private boolean isEmailChecked;
    @Column
    private String picture;

    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<UserLogin> userLogins;
    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<FileComment> fileComments;
    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<UserLikeComment> userLikeComments;
    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<FileSuggestion> fileSuggestions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPhoneChecked() {
        return isPhoneChecked;
    }

    public void setPhoneChecked(boolean phoneChecked) {
        isPhoneChecked = phoneChecked;
    }

    public boolean isEmailChecked() {
        return isEmailChecked;
    }

    public void setEmailChecked(boolean emailChecked) {
        isEmailChecked = emailChecked;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public UserClass getUserClass() {
        return userClass;
    }

    public void setUserClass(UserClass userClass) {
        this.userClass = userClass;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    public List<UserLogin> getUserLogins() {
        return userLogins;
    }

    public void setUserLogins(List<UserLogin> userLogins) {
        this.userLogins = userLogins;
    }

    public List<FileComment> getFileComments() {
        return fileComments;
    }

    public void setFileComments(List<FileComment> fileComments) {
        this.fileComments = fileComments;
    }

    public List<UserLikeComment> getUserLikeComments() {
        return userLikeComments;
    }

    public void setUserLikeComments(List<UserLikeComment> userLikeComments) {
        this.userLikeComments = userLikeComments;
    }

    public List<FileSuggestion> getFileSuggestions() {
        return fileSuggestions;
    }

    public void setFileSuggestions(List<FileSuggestion> fileSuggestions) {
        this.fileSuggestions = fileSuggestions;
    }
}
