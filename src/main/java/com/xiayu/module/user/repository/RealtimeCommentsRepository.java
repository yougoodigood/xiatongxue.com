package com.xiayu.module.user.repository;

import com.xiayu.common.repository.BaseRepository;
import com.xiayu.module.user.entity.RealtimeComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeCommentsRepository extends BaseRepository<RealtimeComments> {

}
