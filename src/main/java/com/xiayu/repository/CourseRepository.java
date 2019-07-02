package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,String> {

}
