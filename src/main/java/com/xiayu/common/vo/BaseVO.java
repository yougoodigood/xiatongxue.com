package com.xiayu.common.vo;

import com.xiayu.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

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
