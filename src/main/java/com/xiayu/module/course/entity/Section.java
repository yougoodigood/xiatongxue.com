package com.xiayu.module.course.entity;

import com.xiayu.common.entity.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "t_section")
public class Section extends BaseEntity implements Serializable {

    @Column
    private String sectionNumber;

    @Column
    private String sectionName;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

}
