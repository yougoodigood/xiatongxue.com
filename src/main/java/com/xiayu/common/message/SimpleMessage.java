package com.xiayu.common.message;

import lombok.Getter;
import lombok.Setter;

/**
 * @Classname SimpleMessage
 * @Description
 * @Author hello
 * @Date 2019/7/4 15:49
 * @Version 1.0
 **/
@Getter
@Setter
public class SimpleMessage extends Message{

    private Object result;

    public SimpleMessage(Object result){
        this.result = result;
    }

    public SimpleMessage(Object result,String token){
        super.setToken(token);
        this.result = result;
    }

    public SimpleMessage(Object result,int code,String message,boolean success){
        super(code,message,success);
        this.result = result;
    }

    public SimpleMessage(Object result,int code,String message,boolean success,String token){
        super(code,message,success);
        super.setToken(token);
        this.result = result;
    }
}
