package com.xiayu.module.course.entity;

import com.xiayu.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "t_project_class")
public class ProjectClass extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -6866262652510826278L;
    @Column
    private String projectName;
    @Column
    private String projectClassNo;
    @Column
    private String shortComment;
    @OneToMany(mappedBy = "projectClass", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courses;
}
