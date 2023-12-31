package com.movie.user.management.controller;

import com.movie.user.management.dto.UserDto;
import com.movie.user.management.service.ManagementService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/management")
@RequiredArgsConstructor
public class ManagementController {

    private final ManagementService managementService;

    @GetMapping()
    public ResponseEntity getUserInfo() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/join")
    public ResponseEntity join(@RequestBody UserDto userDto) {
        managementService.saveUserInfo(userDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("password/temporary")
    public ResponseEntity issuedTemporaryPassword() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
