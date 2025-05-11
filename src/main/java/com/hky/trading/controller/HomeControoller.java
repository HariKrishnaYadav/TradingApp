package com.hky.trading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControoller {

    @GetMapping
   public String  home(){
        return  "Welcome to homeController";
    }
}
