package com.example.demo.tp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-worlds")
    public String helloWorld() {
        return "Hello World!";
    }
}
