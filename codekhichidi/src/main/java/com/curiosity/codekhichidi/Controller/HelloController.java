package com.curiosity.codekhichidi.Controller;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import org.springframework.web.reactive.function.client.WebClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.curiosity.codekhichidi.model;

@RestController
public class HelloController {

    // https://jsonplaceholder.typicode.com/todos/1

    @GetMapping("/fetch/{id}")
    public String getFetch(@PathVariable String id) {

        String url = "https://jsonplaceholder.typicode.com";

        WebClient webClient = WebClient.create(url);

        Mono<model> res = webClient.get().uri("/todos/" + id).retrieve().bodyToMono(model.class);

        return res.block().toString();
    }
}
