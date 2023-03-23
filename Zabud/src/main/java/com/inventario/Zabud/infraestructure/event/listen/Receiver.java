package com.inventario.Zabud.infraestructure.event.listen;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inventario.Zabud.aplication.InventarioSave;
import com.inventario.Zabud.domain.entity.Inventario;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
@Component
@AllArgsConstructor
@Slf4j

public class Receiver {


    private final InventarioSave inventarioSaveSave;
    private final ObjectMapper objectMapper;
    public static String RECEIVE_METHOD_NAME= "receiveMessage";

    public void receiveMessage(byte[] message) throws JsonProcessingException {

        String messageRecived = new String(message, StandardCharsets.UTF_8);
        Inventario inventario = objectMapper.readValue(messageRecived,Inventario.class);
        inventarioSaveSave.SaveInv(inventario);


        log.info("Received Message[ {} ]",new String(message, StandardCharsets.UTF_8));
    }
}
