package com.xiayu.module.course.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SchoolVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = 6767431358608023794L;
    private String schoolName;
    private String shoolNumber;
    private int studentNumbers;
    private int courseNumbers;
    private List<SchoolCourseVO> schoolCourses;

}
