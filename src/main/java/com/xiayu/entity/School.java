package com.xiayu.entity;

import com.xiayu.common.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "t_school")
public class School extends BaseEntity implements Serializable {

    @Column
    private String schoolName;

    @Column
    private String shoolNumber;

    @Column
    private int studentNumbers;

    @Column
    private int courseNumbers;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SchoolCourse> schoolCourses;

}
