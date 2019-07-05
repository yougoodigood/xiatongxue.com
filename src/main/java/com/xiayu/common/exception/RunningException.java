package com.xiayu.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @Classname UpdateException
 * @Description
 * @Author hello
 * @Date 2019/7/5 15:47
 * @Version 1.0
 **/
@Setter
@Getter
public class RunningException extends Exception{
    private String message;

    public RunningException(String message){
        super(message);
        this.message = message;
    }

}
