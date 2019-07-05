package com.xiayu.common.message;

import lombok.Getter;
import lombok.Setter;

/**
 * @Classname PaginationMessage
 * @Description
 * @Author hello
 * @Date 2019/7/4 15:48
 * @Version 1.0
 **/
@Getter
@Setter
public class PaginationMessage extends Message {

    private Object result;

    public PaginationMessage(Object result){
        this.result = result;
    }

    public PaginationMessage(Object result,int code,String message,boolean success){
        super(code,message,success);
        this.result = result;
    }

}
