package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup,String> {

}
