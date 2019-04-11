package com.galaxy.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {
    public String hi(String name) {
        return String.format(" fallback %s", name);
    }
}
