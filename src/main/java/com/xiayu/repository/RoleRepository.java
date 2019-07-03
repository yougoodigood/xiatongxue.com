package com.xiayu.repository;

import com.xiayu.common.BaseRepository;
import com.xiayu.entity.Chapter;
import com.xiayu.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends BaseRepository<Role,String> {

    List<Role> findByDelflagIsFalse();

    @Override
    Role save(Role role);
}
