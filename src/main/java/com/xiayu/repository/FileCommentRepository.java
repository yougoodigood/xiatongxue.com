package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.FileComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileCommentRepository extends JpaRepository<FileComment,String> {

}
