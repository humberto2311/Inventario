package com.inventario.Zabud.infraestructure.event.publisher;

import lombok.AllArgsConstructor;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@AllArgsConstructor
@Service
public class Publisher {
    private final RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        rabbitTemplate.send(MessageBuilder.withBody(message.getBytes(StandardCharsets.UTF_8)).build());
    }
}
