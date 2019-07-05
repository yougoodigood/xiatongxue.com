package com.xiayu.entity;

import com.xiayu.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Setter
@Getter
@Table(name = "t_user")
@Cacheable
//@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class User extends BaseEntity implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_class_id")
    private UserClass userClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_group_id")
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


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserLogin> userLogins;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FileComment> fileComments;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserLikeComment> userLikeComments;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FileSuggestion> fileSuggestions;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserVideoNote> userVideoNotes;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RealtimeComments> realtimeComments;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserDownload> userDownloads;
}
