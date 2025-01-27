package com.example.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaHttpController {

    @GetMapping("/java")
    public String javaCode() {
        return "Java 코드";
    }

}
