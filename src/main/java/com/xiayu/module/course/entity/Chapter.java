package com.xiayu.module.course.entity;

import com.xiayu.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_chapter")
@Setter
@Getter
public class Chapter extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -3644881085905239138L;
    @Column
    private String chapterNumber;

    @Column
    private String chapterName;

    @Column
    private int importance;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Section> sections;

}
