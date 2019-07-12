package com.xiayu.common.message;

import lombok.Getter;
import lombok.Setter;

/**
 * @Classname Message
 * @Description
 * @Author hello
 * @Date 2019/7/4 15:49
 * @Version 1.0
 **/
@Setter
@Getter
public class Message {
    private int code = 200;
    private String message = "success";
    private boolean success = true;
    private String token = null;
    public Message(){}
    public Message(int code,String message,boolean success){
        this.code = code;
        this.message = message;
        this.success = success;
    }
}
