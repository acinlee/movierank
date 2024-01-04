package com.movie.user.management.repository;

import com.movie.user.management.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByLoginId(String loginId);

    UserEntity save(UserEntity userEntity);
}
