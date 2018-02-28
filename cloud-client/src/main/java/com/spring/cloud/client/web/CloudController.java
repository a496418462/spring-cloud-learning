package com.spring.cloud.client.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CloudController {
    @Autowired
    private DiscoveryClient client;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/canyin7/canyin/kitchen/kitchenrest/init")
    public Map<String, Object> canyin() {
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("cloud","client-test");
        result.put("port",port);
        return result;
    }
}
