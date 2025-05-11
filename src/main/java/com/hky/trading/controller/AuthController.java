package com.hky.trading.controller;

import com.hky.trading.model.UserDto;
import com.hky.trading.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RequestMapping("/v1/auth")
@RestController
public class AuthController {

    @Autowired
    private  final AuthService authService;

    @PostMapping("/signUp")
    public ResponseEntity<UserDto> register(UserDto userDto){
        UserDto  user=authService.save(userDto);
     return   new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
