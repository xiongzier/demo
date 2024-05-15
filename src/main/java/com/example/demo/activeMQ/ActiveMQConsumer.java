package com.example.demo.activeMQ;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQConsumer {

    @JmsListener(destination = "notification.queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
