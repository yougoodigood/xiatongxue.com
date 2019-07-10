package com.xiayu.module.permission.repository;

import com.xiayu.common.repository.BaseRepository;
import com.xiayu.module.permission.entity.Permission;
import com.xiayu.module.permission.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleRepository extends BaseRepository<Role> {

    @Override
    Page<Role> findAll(Specification<Role> specificatione, Pageable pageable);

    @Override
    Optional<Role> findById(String id);

    @Override
    Role save(Role Role);
}
