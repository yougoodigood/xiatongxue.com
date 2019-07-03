package com.xiayu.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @Classname BaseResponse
 * @Description
 * @Author hello
 * @Date 2019/7/3 11:55
 * @Version 1.0
 **/
@Getter
@Setter
public class BaseResponse {
    String id;
    String createId;
    Date createTime;
    String updateId;
    Date updateTime;
    boolean delflag;
}
