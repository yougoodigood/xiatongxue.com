package com.xiayu.module.course.service;


import com.xiayu.common.vo.PaginationVO;
import com.xiayu.module.course.vo.CourseVO;

public interface CourseService {

    CourseVO findById(String id) throws Exception;

    PaginationVO getCourseList(PaginationVO paginationVO) throws Exception;

    CourseVO deleteCourse(CourseVO courseVO) throws Exception;

    CourseVO updateCourse(CourseVO courseVO) throws Exception;

    CourseVO addCourse(CourseVO courseVO) throws Exception;
}
