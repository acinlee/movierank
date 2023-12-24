package com.movie.user.management.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class UserDto {
    private String loginId;

    private String loginPw;

    private String name;

    private String birth;

    UserDto(String loginId, String loginPw, String name, String birth) {
        this.loginId = loginId;
        this.loginPw = loginPw;
        this.name = name;
        this.birth = birth;
    }
}
