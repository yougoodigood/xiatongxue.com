package com.xiayu.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_project_class")
public class ProjectClass {
    @Id
    private String id;

    @Column
    private String projectName;

    @Column
    private String projectClassNo;

    @Column
    private String shortComment;

    @OneToMany(mappedBy = "projectClass", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectClassNo() {
        return projectClassNo;
    }

    public void setProjectClassNo(String projectClassNo) {
        this.projectClassNo = projectClassNo;
    }

    public String getShortComment() {
        return shortComment;
    }

    public void setShortComment(String shortComment) {
        this.shortComment = shortComment;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
