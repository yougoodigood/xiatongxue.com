package com.xiayu.module.user.repository;

import com.xiayu.common.repository.BaseRepository;
import com.xiayu.module.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends BaseRepository<User> {
    List<User> findByNicknameLike(String userName);

    List<User> findByDelflagIsFalseAndLoginName(String loginName);

    List<User> getUsersByDelflagIsFalse();

    @Override
    User save(User user);
}
