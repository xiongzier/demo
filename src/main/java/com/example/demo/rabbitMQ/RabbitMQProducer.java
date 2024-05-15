package com.example.demo.rabbitMQ;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Bean
    public Queue queue() {
        return new Queue("notification.queue", false);
    }

    @GetMapping("/sendRabbitMQ")
    public String sendMessage() {
        rabbitTemplate.convertAndSend("notification.queue", "This is a test message for RabbitMQ");
        return "Message sent to RabbitMQ";
    }
}
