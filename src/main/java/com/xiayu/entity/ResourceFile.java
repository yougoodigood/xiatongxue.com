package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_file")
public class ResourceFile extends BaseEntity {
    @Id
    private String id;

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

    @OneToMany(mappedBy = "resourceFile",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    List<FileComment> fileComments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public int getDownloadTimes() {
        return downloadTimes;
    }

    public void setDownloadTimes(int downloadTimes) {
        this.downloadTimes = downloadTimes;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public int getLikeTimes() {
        return likeTimes;
    }

    public void setLikeTimes(int likeTimes) {
        this.likeTimes = likeTimes;
    }

    public int getNotLikeTimes() {
        return notLikeTimes;
    }

    public List<FileComment> getFileComments() {
        return fileComments;
    }

    public void setFileComments(List<FileComment> fileComments) {
        this.fileComments = fileComments;
    }

    public void setNotLikeTimes(int notLikeTimes) {
        this.notLikeTimes = notLikeTimes;
    }
}
