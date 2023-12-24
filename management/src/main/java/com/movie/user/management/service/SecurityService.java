package com.movie.user.management.service;

import com.movie.user.management.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SecurityService implements UserDetailsService {

    private final LoginService loginService;
    private final PasswordEncoder passwordEncoder;

    /**
     * 로그인 데이터
     * @param userId
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        Optional<User> findOne = loginService.findOne(userId);
        User user = findOne.orElseThrow(() -> new UsernameNotFoundException("등록되지 않은 사용자입니다."));

        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getLoginId())
                .password(passwordEncoder.encode(user.getLoginPw()))
                .build();
    }
}
