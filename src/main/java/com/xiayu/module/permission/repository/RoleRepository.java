package com.xiayu.module.permission.repository;

import com.xiayu.common.repository.BaseRepository;
import com.xiayu.module.permission.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends BaseRepository<Role,String> {

    List<Role> findByDelflagIsFalse();

    @Override
    Role save(Role role);
}
