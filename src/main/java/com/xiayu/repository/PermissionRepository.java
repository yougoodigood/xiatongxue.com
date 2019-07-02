package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission,String> {

}
