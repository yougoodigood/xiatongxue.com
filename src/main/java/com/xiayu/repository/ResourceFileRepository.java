package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.ResourceFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceFileRepository extends JpaRepository<ResourceFile,String> {

}
