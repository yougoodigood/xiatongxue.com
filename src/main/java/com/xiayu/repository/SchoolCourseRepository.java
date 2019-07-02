package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolCourseRepository extends JpaRepository<Chapter,String> {

}
