package com.xiayu.module.course.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;

@Data
public class SchoolCourseVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = 4368208475450611977L;
    private SchoolVO school;
    private CourseVO course;

}
