package com.xiayu.entity;

import com.xiayu.common.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
