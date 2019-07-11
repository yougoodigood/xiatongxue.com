package com.xiayu.common.repository;

import com.xiayu.common.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public  interface BaseRepository<T extends BaseEntity> extends JpaRepository<T,String>, CrudRepository<T,String>, JpaSpecificationExecutor<T> {
    @Override
    Page<T> findAll(Specification<T> specification, Pageable pageable);

    @Override
    Optional<T> findById(String id);

}
