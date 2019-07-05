package com.xiayu.module.user.repository;

import com.xiayu.module.course.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolCourseRepository extends JpaRepository<Chapter,String> {

}
