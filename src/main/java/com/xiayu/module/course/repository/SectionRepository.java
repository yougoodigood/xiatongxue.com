package com.xiayu.module.course.repository;

import com.xiayu.common.repository.BaseRepository;
import com.xiayu.module.course.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends BaseRepository<Section,String> {

}
