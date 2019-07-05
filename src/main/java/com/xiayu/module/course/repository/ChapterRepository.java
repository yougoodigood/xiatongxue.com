package com.xiayu.module.course.repository;

import com.xiayu.common.repository.BaseRepository;
import com.xiayu.module.course.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChapterRepository extends BaseRepository<Chapter> {
    @Override
    Optional<Chapter> findById(String id);
}
