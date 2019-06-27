package com.xiayu.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

@Setter
@Getter
public class BaseEntity {
    @Column
    private String id;
    @Column
    private String createId;
    @Column
    private Date createTime;
    @Column
    private String updateId;
    @Column
    private Date updateTime;

}
