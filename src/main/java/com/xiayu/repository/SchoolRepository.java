package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School,String> {

}
