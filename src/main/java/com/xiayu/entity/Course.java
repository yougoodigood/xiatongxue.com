package com.xiayu.entity;

import com.xiayu.common.BaseEntity;
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
    @Id
    private String id;

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
