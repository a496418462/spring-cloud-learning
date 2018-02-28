package com.spring.cloud.bus.demo;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "mq")
public class Receiver {
    @RabbitHandler
    public void receive(String receiveMessage){
        System.out.println(receiveMessage);
    }
}
