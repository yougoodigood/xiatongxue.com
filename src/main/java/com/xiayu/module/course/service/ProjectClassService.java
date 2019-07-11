package com.xiayu.module.course.service;

import com.xiayu.common.vo.PaginationVO;
import com.xiayu.module.course.vo.ProjectClassVO;

import java.util.List;

public interface ProjectClassService {

    ProjectClassVO findById(String id) throws Exception;

    PaginationVO getProjectClassList(PaginationVO paginationVO) throws Exception;

    ProjectClassVO deleteProjectClass(ProjectClassVO projectClassVO) throws Exception;

    ProjectClassVO updateProjectClass(ProjectClassVO projectClassVO) throws Exception;

    ProjectClassVO addProjectClass(ProjectClassVO projectClassVO) throws Exception;
}

