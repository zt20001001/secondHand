package com.sit.secondhand.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zt")
public class HelloController {
    @RequestMapping("/hello")
    public String startSpringBoot() {
        return "Hello, Welcome to the world of Spring Boot!";
    }

    @RequestMapping("/spring")
    public String getHtml() {
        return "<h1>Hello, Welcome to the world of Spring Boot!</h1>";
    }

}
