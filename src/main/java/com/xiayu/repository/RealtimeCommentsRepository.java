package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.RealtimeComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealtimeCommentsRepository extends JpaRepository<RealtimeComments,String> {

}
