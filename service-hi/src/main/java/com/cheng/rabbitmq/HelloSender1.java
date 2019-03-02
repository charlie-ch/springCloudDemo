package com.cheng.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender1 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String name) {
        String sendMsg = "hello " + new Date()+name;
        System.out.println("Sender1 : " + sendMsg);
        //发送消息，hello要和配置的queue名字一样
        this.rabbitTemplate.convertAndSend("hello", sendMsg);
    }

}