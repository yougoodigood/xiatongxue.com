package com.xiayu.module.course.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@Setter
@Getter
public class ProjectClassVO extends BaseVO implements Serializable {
    private static final long serialVersionUID = -6866262652510826278L;
    private String projectName;
    private String projectClassNo;
    private String shortComment;
    private List<CourseVO> courses;
}
