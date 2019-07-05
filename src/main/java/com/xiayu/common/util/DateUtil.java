package com.xiayu.common.util;

import com.xiayu.enumeration.ResourceTypeEnum;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname DateUtil
 * @Description
 * @Author hello
 * @Date 2019/7/4 17:59
 * @Version 1.0
 **/
public class DateUtil {
    public static String getCurrentDateString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(new Date());
        return date;
    }
}
