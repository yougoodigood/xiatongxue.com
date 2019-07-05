package com.xiayu.module.user.repository;

import com.xiayu.module.user.entity.UserLikeComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLikeCommentRepository extends JpaRepository<UserLikeComment,String> {

}
