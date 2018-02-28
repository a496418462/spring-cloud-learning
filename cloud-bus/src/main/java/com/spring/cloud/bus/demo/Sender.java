package com.spring.cloud.bus.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String sendMessage = "test" + System.currentTimeMillis();
//        System.out.println(sendMessage);
        amqpTemplate.convertAndSend("mq",sendMessage);
    }
}
