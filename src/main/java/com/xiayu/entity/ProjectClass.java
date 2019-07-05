package com.xiayu.entity;

import com.xiayu.common.BaseEntity;
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
    @Column
    private String projectName;
    @Column
    private String projectClassNo;
    @Column
    private String shortComment;
    @OneToMany(mappedBy = "projectClass", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courses;
}
