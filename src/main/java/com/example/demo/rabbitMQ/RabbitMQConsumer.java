package com.example.demo.rabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = "notification.queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
