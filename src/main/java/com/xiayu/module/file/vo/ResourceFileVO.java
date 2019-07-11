package com.xiayu.module.file.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResourceFileVO extends BaseVO implements Serializable {

    private static final long serialVersionUID = -2776696054089199166L;
    private String parentId;
    private String fileNumber;
    private String name;
    private int fileSize;
    private String fileMd5;
    private String fileUrl;
    private int downloadTimes;
    private String fileSuffix;
    private int likeTimes;
    private int notLikeTimes;
    List<FileCommentVO> fileComments;

}
