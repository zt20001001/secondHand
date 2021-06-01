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
    public String getSpringHtml() {
        return "<h3>The Spring is inserted in the Web pages!</h3>";
    }

    public void sayHello(){
        System.out.println("Hello, world!");
    }
}
