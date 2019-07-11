package com.xiayu.module.course.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class CourseVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = -8491028728831497735L;
    private ProjectClassVO projectClass;
    private String courseName;
    private String courseNumber;
    private int chapterNumber;
    private List<ChapterVO> chapters;
}
