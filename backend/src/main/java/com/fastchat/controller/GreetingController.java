package com.fastchat.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    int counter = 0;

    @GetMapping(value = "/greet", produces = MediaType.TEXT_PLAIN_VALUE)
    public String greet() {
        return "Hey, you called me " + (++counter) + " time(s)!";
    }

}
