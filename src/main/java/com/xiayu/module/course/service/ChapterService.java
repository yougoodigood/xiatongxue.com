package com.xiayu.module.course.service;

import com.xiayu.common.vo.PaginationVO;
import com.xiayu.module.course.vo.ChapterVO;

public interface ChapterService {

    ChapterVO findById(String id) throws Exception;

    PaginationVO getChapterList(PaginationVO paginationVO) throws Exception;

    ChapterVO deleteChapter(ChapterVO chapterVO) throws Exception;

    ChapterVO updateChapter(ChapterVO chapterVO) throws Exception;

    ChapterVO addChapter(ChapterVO chapterVO) throws Exception;
}
