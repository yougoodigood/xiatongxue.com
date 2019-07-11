package com.xiayu.module.course.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class ChapterVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = -3644881085905239138L;
    String chapterNumber;
    private String chapterName;
    private int importance;
    private CourseVO course;
    private List<SectionVO> sections;
}
