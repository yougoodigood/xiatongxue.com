package com.xiayu.module.user.repository;

import com.xiayu.module.user.entity.UserVideoNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserVideoNoteRepository extends JpaRepository<UserVideoNote,String> {

}
