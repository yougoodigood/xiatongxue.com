package com.xiayu.module.video.repository;

import com.xiayu.module.video.entity.VideoSegmentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoSegmentInfoRepository extends JpaRepository<VideoSegmentInfo,String> {

}
