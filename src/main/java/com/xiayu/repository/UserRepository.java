package com.xiayu.repository;

import com.xiayu.common.BaseRepository;
import com.xiayu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends BaseRepository<User, String> {
    List<User> findByNicknameLike(String userName);

    List<User> getUsersByDelflagIsFalse();

    @Override
    User save(User user);
}
