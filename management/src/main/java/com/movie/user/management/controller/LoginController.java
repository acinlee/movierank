package com.movie.user.management.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {


    @PostMapping("login")
    public String login() {
        return null;
    }

    @PostMapping("logout")
    public void logout() {
    }

}
