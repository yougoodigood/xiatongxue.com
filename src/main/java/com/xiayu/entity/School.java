package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_school")
public class School extends BaseEntity {
    @Id
    private String id;

    @Column
    private String schoolName;

    @Column
    private String shoolNumber;

    @Column
    private int studentNumbers;

    @Column
    private int courseNumbers;

    @OneToMany(mappedBy = "school",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<SchoolCourse> schoolCourses;
}
