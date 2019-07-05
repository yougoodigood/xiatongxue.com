package com.xiayu.module.user.repository;

import com.xiayu.module.video.VideoSegmentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoSegmentInfoRepository extends JpaRepository<VideoSegmentInfo,String> {

}
