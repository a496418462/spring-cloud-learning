package com.spring.cloud.sleuth.feign.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("CLOUD-SLEUTH-CLIENT")
public interface MappingInterface {


    @RequestMapping("/canyin7/canyin/kitchen/kitchenrest/init")
    Object test();
}
