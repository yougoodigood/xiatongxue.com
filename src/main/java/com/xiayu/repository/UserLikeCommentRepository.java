package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.UserLikeComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLikeCommentRepository extends JpaRepository<UserLikeComment,String> {

}
