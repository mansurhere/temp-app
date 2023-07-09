package com.temp.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello";
    }

    @GetMapping("/test")
    public String test() {
        return "Hello";
    }

    public String a(){
        return "A";
    }
}
