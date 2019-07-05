package com.xiayu.module.user.repository;

import com.xiayu.common.repository.BaseRepository;
import com.xiayu.module.user.entity.UserClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserClassRepository extends BaseRepository<UserClass> {

}
