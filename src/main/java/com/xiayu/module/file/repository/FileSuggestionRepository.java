package com.xiayu.module.file.repository;

import com.xiayu.module.file.entity.FileSuggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileSuggestionRepository extends JpaRepository<FileSuggestion,String> {

}
