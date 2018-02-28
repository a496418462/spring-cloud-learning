package com.spring.cloud.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HystrixController {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fail")
    @RequestMapping("/**")
    public Object canyin(HttpServletRequest request){
        String url = "http://CANYIN7" + request.getRequestURI();
        System.out.println(url);
        return restTemplate.getForObject(url,Object.class);
    }

    public String fail(HttpServletRequest request){
        return  "Method failed";
    }
}
