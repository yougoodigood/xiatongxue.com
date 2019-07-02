package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.ProjectClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectClassRepository extends JpaRepository<ProjectClass,String> {

}
