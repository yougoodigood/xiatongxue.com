package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_school")
public class School extends BaseEntity implements Serializable {
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

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SchoolCourse> schoolCourses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getShoolNumber() {
        return shoolNumber;
    }

    public void setShoolNumber(String shoolNumber) {
        this.shoolNumber = shoolNumber;
    }

    public int getStudentNumbers() {
        return studentNumbers;
    }

    public void setStudentNumbers(int studentNumbers) {
        this.studentNumbers = studentNumbers;
    }

    public int getCourseNumbers() {
        return courseNumbers;
    }

    public void setCourseNumbers(int courseNumbers) {
        this.courseNumbers = courseNumbers;
    }

    public List<SchoolCourse> getSchoolCourses() {
        return schoolCourses;
    }

    public void setSchoolCourses(List<SchoolCourse> schoolCourses) {
        this.schoolCourses = schoolCourses;
    }
}
