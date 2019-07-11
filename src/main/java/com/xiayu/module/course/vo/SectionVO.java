package com.xiayu.module.course.vo;

import com.xiayu.common.entity.BaseEntity;
import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
public class SectionVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = -3288237623211438541L;
    private String sectionNumber;
    private String sectionName;
    private ChapterVO chapter;

}
