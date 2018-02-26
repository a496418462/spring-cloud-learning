package com.spring.cloud.bus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
    @Value("${a}")
    private String a;
    @Value("${b}")
    private String b;

    @RequestMapping("/test")
    public String test(){
        return a + b;
    }
}
