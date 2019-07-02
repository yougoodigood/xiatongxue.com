package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section,String> {

}
