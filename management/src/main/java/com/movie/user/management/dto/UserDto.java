package com.movie.user.management.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class UserDto {
    private String loginId;

    private String loginPw;

    private String name;

    private String birth;

    UserDto() {
    }
}
