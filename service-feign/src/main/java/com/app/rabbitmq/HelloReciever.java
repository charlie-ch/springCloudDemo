package com.app.rabbitmq;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")//监听的队列的名字
public class HelloReciever {

    //监听后的执行器
    @RabbitHandler
    public void process(String hello12) {
        System.out.println("Receiver  : " + hello12);
    }
}

