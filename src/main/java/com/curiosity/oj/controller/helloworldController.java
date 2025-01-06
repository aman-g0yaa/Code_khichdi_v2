package com.curiosity.oj.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class helloworldController {

    @GetMapping("/")
    public String get() {
        System.out.println("Hello World!");
        return "Hello World!";
    }

}
