package com.example.helloeureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEureka {

    @GetMapping("/hello-eureka")
    public String helloWorld() {
        return "Hello Eureka";
    }

}

