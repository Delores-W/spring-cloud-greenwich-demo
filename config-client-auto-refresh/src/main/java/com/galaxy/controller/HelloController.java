package com.galaxy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //属性注入
    @Value("${name}")
    String name;

    @RequestMapping("/hi")
    public String hi() {
        return String.format("Hi %s", name);
    }
}
