package com.xiayu.module.course.repository;

import com.xiayu.common.repository.BaseRepository;
import com.xiayu.module.course.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends BaseRepository<School> {

}
