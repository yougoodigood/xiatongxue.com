package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLogin,String> {

}
