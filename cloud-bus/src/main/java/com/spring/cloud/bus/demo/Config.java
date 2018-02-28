package com.spring.cloud.bus.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Queue mqQueue(){
        return new Queue("mq");
    }
}
