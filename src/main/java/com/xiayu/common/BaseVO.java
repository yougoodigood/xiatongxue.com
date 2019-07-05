package com.xiayu.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.Map;

/**
 * @Classname BaseResponse
 * @Description
 * @Author hello
 * @Date 2019/7/3 11:55
 * @Version 1.0
 **/
@Getter
@Setter
public class BaseVO {
    String id;

    String createId;

    String createTime;

    String updateId;

    String updateTime;

    boolean delflag;

    public void generalElementMapper(BaseEntity baseEntity){
        this.id = baseEntity.getId();
        this.createId = baseEntity.getCreateId();
        String created = baseEntity.getCreateTime();
        if (created != null){
            this.createTime = created.substring(0,created.indexOf("."));
        }
        this.updateId = baseEntity.getUpdateId();
        String updated = baseEntity.getUpdateTime();
        if (updated != null){
            this.updateTime = updated.substring(0,created.indexOf("."));
        }
        this.delflag = baseEntity.isDelflag();
    }
}
