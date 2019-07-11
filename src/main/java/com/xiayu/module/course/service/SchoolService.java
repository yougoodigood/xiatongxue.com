package com.xiayu.module.course.service;

import com.xiayu.common.vo.PaginationVO;
import com.xiayu.module.course.vo.SchoolVO;

public interface SchoolService {

    SchoolVO findById(String id) throws Exception;

    PaginationVO getSchoolList(PaginationVO paginationVO) throws Exception;

    SchoolVO deleteSchool(SchoolVO schoolVO) throws Exception;

    SchoolVO updateSchool(SchoolVO schoolVO) throws Exception;

    SchoolVO addSchool(SchoolVO schoolVO) throws Exception;
}
