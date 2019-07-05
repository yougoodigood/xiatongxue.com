package com.xiayu.repository;

import com.xiayu.common.BaseRepository;
import com.xiayu.entity.Permission;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

@Repository
public interface PermissionRepository extends BaseRepository<Permission,String> {

    @Override
    Page<Permission> findAll(Specification<Permission> specificationec, Pageable pageable);

    @Override
    Optional<Permission> findById(String id);

    @Override
    Permission save(Permission permission);

}
