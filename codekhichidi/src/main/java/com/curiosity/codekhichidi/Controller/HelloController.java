package com.curiosity.codekhichidi.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "<b> Hello World </b>";
    }
    


}