package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.UserVideoNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserVideoNoteRepository extends JpaRepository<UserVideoNote,String> {

}
