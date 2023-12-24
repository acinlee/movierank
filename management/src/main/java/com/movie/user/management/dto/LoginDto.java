package com.movie.user.management.dto;

import lombok.Getter;
@Getter
public class LoginDto {
    private String loginId;
    private String loginPw;

    LoginDto(String loginId, String loginPw) {
        this.loginId = loginId;
        this.loginPw = loginPw;
    }
}
