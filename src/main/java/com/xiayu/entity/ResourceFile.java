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
@Table(name = "t_file")
public class ResourceFile extends BaseEntity implements Serializable {

    @Column
    private String parentId;

    @Column
    private String fileNumber;

    @Column
    private String name;

    @Column
    private int fileSize;

    @Column
    private String fileMd5;

    @Column
    private String fileUrl;

    @Column
    private int downloadTimes;

    @Column
    private String fileSuffix;

    @Column
    private int likeTimes;

    @Column
    private int notLikeTimes;

    @OneToMany(mappedBy = "resourceFile", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<FileComment> fileComments;

}
