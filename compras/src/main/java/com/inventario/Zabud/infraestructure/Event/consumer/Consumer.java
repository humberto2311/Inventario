package com.inventario.Zabud.infraestructure.Event.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inventario.Zabud.applicarion.CompraSave;
import com.inventario.Zabud.domain.entity.Compra;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@AllArgsConstructor
@Service
@Slf4j
public class Consumer {
    private final ObjectMapper objectMapper;
    private final CompraSave compraSave;

    @RabbitListener(queues = "${Compra.queue.compra}")
    public void consume(Message message) throws JsonProcessingException {
        String jason = new String(message.getBody(), StandardCharsets.UTF_8);
        String httpMethod = message.getMessageProperties().getHeader("HTTP_METHOD");
        log.info("Received HTTP method: {}", httpMethod);
        Compra compra = objectMapper.readValue(jason, Compra.class);
        compraSave.saveCompra(compra);
    }
}
