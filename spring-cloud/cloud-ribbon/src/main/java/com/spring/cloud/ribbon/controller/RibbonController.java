package com.spring.cloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/**")
    public Object canyin(HttpServletRequest request){
        String url = "http://CANYIN7" + request.getRequestURI();
        System.out.println(url);
        return restTemplate.getForObject(url,Object.class);
    }
}
