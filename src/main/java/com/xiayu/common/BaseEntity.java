package com.xiayu.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Column
    String createId;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    Date createTime;
    @Column
    String updateId;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    Date updateTime;
    @Column
    boolean delflag;
}
