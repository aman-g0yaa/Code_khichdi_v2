package com.curiosity.codekhichidi.Controller;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import org.springframework.web.reactive.function.client.WebClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curiosity.codekhichidi.model;

@RestController
public class HelloController {

    //https://jsonplaceholder.typicode.com/todos/1

    @GetMapping("/fetch")
    public String getFetch() {
                
        String url = "https://jsonplaceholder.typicode.com";

        WebClient webClient = WebClient.create(url);

        Mono<model> res = webClient.get().uri("/todos/1").retrieve().bodyToMono(model.class);
        
        return res.block().toString();
        }
}
