package com.spring.cloud.sleuth.feign.controller;

import com.spring.cloud.sleuth.feign.interfaces.MappingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    MappingInterface mappingInterface;
    @RequestMapping("/**")
    public Object canyin(){
        return mappingInterface.test();
    }
}
