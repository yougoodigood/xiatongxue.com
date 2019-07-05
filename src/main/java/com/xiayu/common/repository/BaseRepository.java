package com.xiayu.common.repository;

import com.xiayu.common.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public  interface BaseRepository<T extends BaseEntity> extends JpaRepository<T,String>, CrudRepository<T,String>, JpaSpecificationExecutor<T> {

}
