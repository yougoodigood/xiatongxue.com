package com.xiayu.enumeration;

import lombok.Getter;
import lombok.Setter;

public enum MessageErrorEnum {

    UNKNOWN("未知异常"),
    SUCCESS("成功");

    private String info;
    MessageErrorEnum(String info){
        this.info = info;
    }

    public String getInfo(){
        return this.info;
    }
}
