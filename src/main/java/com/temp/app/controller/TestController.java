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
    @GetMapping("/abc")
    public String sayAbc() {
        return "abc";
    }
    @GetMapping("/welcome")
    public String welcome() {
        return "Hello";
    }

    @GetMapping("/test")
    public String test() {
        return "Hello";
    }
    @GetMapping("/add")
    public String add() {
        return "Hello";
    }
}
