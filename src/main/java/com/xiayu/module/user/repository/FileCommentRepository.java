package com.xiayu.module.user.repository;

import com.xiayu.module.file.entity.FileComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileCommentRepository extends JpaRepository<FileComment,String> {

}
