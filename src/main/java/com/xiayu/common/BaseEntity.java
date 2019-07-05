package com.xiayu.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xiayu.common.util.DateUtil;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Setter
@Getter
@MappedSuperclass
@EnableJpaAuditing
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -3750062956993409940L;
    @Id
    @GeneratedValue(generator = "hibernate.uuid")
    @GenericGenerator(name = "hibernate.uuid", strategy = "uuid")
    private String id;

    @Column
    String createId;

    @Column
    String createTime;

    @Column
    String updateId;

    @Column
    String updateTime;

    @Column
    boolean delflag;

    @PrePersist
    public void prePersist() {
        if (this.createTime == null){
            this.createTime = DateUtil.getCurrentDateString();
        }
        this.updateTime = DateUtil.getCurrentDateString();
    }

    @PreUpdate
    public void preUpdate() {
        this.updateTime = DateUtil.getCurrentDateString();
    }
}
