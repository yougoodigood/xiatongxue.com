package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.VideoSegmentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoSegmentInfoRepository extends JpaRepository<VideoSegmentInfo,String> {

}
