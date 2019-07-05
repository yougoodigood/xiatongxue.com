package com.xiayu.module.course.entity;

import com.xiayu.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_course")
@Setter
@Getter
public class Course extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -8491028728831497735L;
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "project_class_id")
    private ProjectClass projectClass;

    @Column
    private String courseName;

    @Column
    private String courseNumber;

    @Column
    private int chapterNumber;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Chapter> chapters;
}
