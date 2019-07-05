package com.xiayu.module.user.repository;

import com.xiayu.module.course.entity.ProjectClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectClassRepository extends JpaRepository<ProjectClass,String> {

}
