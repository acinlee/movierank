package com.movie.user.management.service;

import com.movie.user.management.common.Message;
import com.movie.user.management.dto.UserDto;
import com.movie.user.management.entity.UserEntity;
import com.movie.user.management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public Optional<UserEntity> findOne(String loginId) {
        return userRepository.findByLoginId(loginId);
    }

    public ResponseEntity<Message> login(UserDto userDto) {
        Message message = new Message();

        // loginId로 UserEntity 정보 추출
        Optional<UserEntity> userEntityOptional = userRepository.findByLoginId(userDto.getLoginId());
        UserEntity userEntity = userEntityOptional.orElseThrow(() -> new UsernameNotFoundException("등록되지 않은 사용자입니다."));

        // loginId, loginPw 비교
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
