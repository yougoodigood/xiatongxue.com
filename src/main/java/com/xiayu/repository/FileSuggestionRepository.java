package com.xiayu.repository;

import com.xiayu.entity.Chapter;
import com.xiayu.entity.FileSuggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileSuggestionRepository extends JpaRepository<FileSuggestion,String> {

}
