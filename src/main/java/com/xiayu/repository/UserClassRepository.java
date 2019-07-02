package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserClassRepository extends JpaRepository<UserClass,String> {

}