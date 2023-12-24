package com.movie.user.management.service;

import com.movie.user.management.entity.User;
import com.movie.user.management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManagementService {

    private final UserRepository userRepository;

    public void saveUserInfo(User user) {
        userRepository.save(user);
    }
}
