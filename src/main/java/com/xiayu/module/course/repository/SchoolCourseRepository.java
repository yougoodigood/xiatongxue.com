package com.xiayu.module.course.repository;

import com.xiayu.common.repository.BaseRepository;
import com.xiayu.module.course.entity.Chapter;
import com.xiayu.module.course.entity.SchoolCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolCourseRepository extends BaseRepository<SchoolCourse> {

}
