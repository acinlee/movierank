package com.movie.user.management.service;

import com.movie.user.management.dto.UserDto;
import com.movie.user.management.entity.User;
import com.movie.user.management.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ManagementServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("사용자 정보 저장 테스트")
    void saveUserInfo() {
        // given
        UserDto userDto = UserDto.builder()
                .loginId("test@naver.com")
                .loginPw("aabbcc")
                .birth("19961210")
                .name("이동준")
                .build();
        User user = User.builder()
                .loginId(userDto.getLoginId())
                .loginPw(userDto.getLoginPw())
                .name(userDto.getName())
                .birth(userDto.getBirth())
                .build();

        // when
        User saveUser = userRepository.save(user);

        // then
        Assertions.assertThat(user).isSameAs(saveUser);
    }
}