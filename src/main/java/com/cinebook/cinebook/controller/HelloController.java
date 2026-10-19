package com.cinebook.cinebook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to CineBook!";
    }
    
    @GetMapping("/api/info")
    public String getInfo() {
        return "CineBook - Movie Ticket Booking Platform";
    }
}
