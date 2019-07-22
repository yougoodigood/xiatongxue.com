package com.xiayu.module.user.entity;

import com.xiayu.common.entity.BaseEntity;
import com.xiayu.module.course.entity.Course;
import com.xiayu.module.file.entity.FileComment;
import com.xiayu.module.file.entity.FileSuggestion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Entity
@Setter
@Getter
@Table(name = "t_user")
@Cacheable
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -7368603872637421179L;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_class_id")
    private UserClass userClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_group_id")
    private UserGroup userGroup;
    Map<String,String> map = new HashMap<>();

    public void getIT(){
        List<String> list = new LinkedList<>();
        List<String> list1 = new Vector<>();
        Map<String,String> map = new HashMap<>();
        Map<String,String> treeMap = new TreeMap<>();
        Set<String> set = new HashSet<>();
        Set<String> set1 = new TreeSet<>();
        Map<String,String> map1 = new Hashtable<>();
        Map<String,String> map2 = new LinkedHashMap<>();
        Set<String> set2 = new LinkedHashSet<>();
        set1.add("string");
        Object object = new Object();
    }

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
    private String birthday;
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
    @Column
    private String phone;


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

    @OneToMany(mappedBy = "representativeUser", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> representativeCourses;
}
