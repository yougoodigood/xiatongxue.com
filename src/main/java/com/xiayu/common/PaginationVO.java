package com.xiayu.common;

import lombok.Data;

import java.util.Map;

/**
 * @Classname PaginationVO
 * @Description
 * @Author hello
 * @Date 2019/7/4 14:13
 * @Version 1.0
 **/
@Data
public class PaginationVO {
    int perPageNum =  10;
    int currentPageNum = 1;
    int totalCount;
    int totalPage;
    Map<String,String> queryConditions;
    Object pageData;
}
