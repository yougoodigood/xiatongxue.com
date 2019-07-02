package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,String> {

}
