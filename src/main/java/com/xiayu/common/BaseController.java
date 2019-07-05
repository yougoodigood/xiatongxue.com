package com.xiayu.common;

import com.xiayu.enumeration.MessageErrorEnum;

public class BaseController {
    protected SimpleMessage returnSimpleMessage(Exception e){
        if (e == null) {
            return new SimpleMessage("未知错误",500, MessageErrorEnum.UNKNOWN.getInfo(),false);
        } else if (e instanceof Exception) {
            return new SimpleMessage("未知错误,请联系管理员",500, MessageErrorEnum.UNKNOWN.getInfo(),false);
        } else {
            return new SimpleMessage(e.getMessage(),500, MessageErrorEnum.UNKNOWN.getInfo(),false);
        }
    }

    protected PaginationMessage returnPaginationMessage(Exception e){
        if (e == null) {
            return new PaginationMessage("未知错误,请联系管理员",500, MessageErrorEnum.UNKNOWN.getInfo(),false);
        } else if (e instanceof Exception) {
            return new PaginationMessage("未知错误,请联系管理员",500, MessageErrorEnum.UNKNOWN.getInfo(),false);
        } else {
            return new PaginationMessage(e.getMessage(),500, MessageErrorEnum.UNKNOWN.getInfo(),false);
        }
    }
}
