package com.xiayu.module.permission.repository;

import com.xiayu.common.repository.BaseRepository;
import com.xiayu.module.permission.entity.Permission;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

@Repository
public interface PermissionRepository extends BaseRepository<Permission> {

    @Override
    Page<Permission> findAll(Specification<Permission> specificationec, Pageable pageable);

    @Override
    Optional<Permission> findById(String id);

    @Override
    Permission save(Permission permission);

}
