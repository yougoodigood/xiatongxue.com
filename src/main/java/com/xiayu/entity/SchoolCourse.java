package com.xiayu.entity;

import com.xiayu.common.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "t_school_course")
public class SchoolCourse extends BaseEntity implements Serializable {

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "school_id")
    private School school;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

}
