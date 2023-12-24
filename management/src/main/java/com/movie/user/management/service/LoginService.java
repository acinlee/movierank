package com.movie.user.management.service;

import com.movie.user.management.entity.User;
import com.movie.user.management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public Optional<User> findOne(String userId) {
        return userRepository.findByLoginId(userId);
    }
}
