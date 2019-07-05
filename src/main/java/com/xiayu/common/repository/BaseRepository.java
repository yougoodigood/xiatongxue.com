package com.xiayu.common.repository;

import com.xiayu.common.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public  interface BaseRepository<T extends BaseEntity,S> extends JpaRepository<T,S>, CrudRepository<T,S>, JpaSpecificationExecutor<T> {

}
