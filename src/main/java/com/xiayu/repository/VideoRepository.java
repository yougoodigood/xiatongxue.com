package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video,String> {

}
