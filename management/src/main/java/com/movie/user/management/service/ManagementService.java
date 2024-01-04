package com.movie.user.management.service;

import com.movie.user.management.dto.UserDto;
import com.movie.user.management.entity.UserEntity;
import com.movie.user.management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManagementService {

    private final UserRepository userRepository;

    public void saveUserInfo(UserDto userDto) {
        UserEntity userEntity = UserEntity.builder()
                .loginId(userDto.getLoginId())
                .loginPw(userDto.getLoginPw())
                .birth(userDto.getBirth())
                .name(userDto.getName())
                .build();
        userRepository.save(userEntity);
    }
}
