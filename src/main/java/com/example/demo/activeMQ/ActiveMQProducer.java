package com.example.demo.activeMQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActiveMQProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("/sendActiveMQ")
    public String sendMessage() {
        jmsTemplate.convertAndSend("notification.queue", "This is a test message for ActiveMQ");
        return "Message sent to ActiveMQ";
    }
}
