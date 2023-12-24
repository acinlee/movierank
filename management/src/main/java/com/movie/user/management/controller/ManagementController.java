package com.movie.user.management.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("management")
public class ManagementController {

    @GetMapping()
    public ResponseEntity getUserInfo() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("join")
    public ResponseEntity join() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("password/temporary")
    public ResponseEntity issuedTemporaryPassword() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
