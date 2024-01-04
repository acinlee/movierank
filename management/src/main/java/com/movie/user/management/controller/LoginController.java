package com.movie.user.management.controller;

import com.movie.user.management.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {


    @PostMapping("/login")
    public String login(@RequestBody UserDto userDto) {

        return null;
    }

    @PostMapping("logout")
    public void logout() {
    }

}
