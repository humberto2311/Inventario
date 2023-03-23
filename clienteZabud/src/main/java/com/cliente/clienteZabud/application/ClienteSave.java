package com.cliente.clienteZabud.application;

import com.cliente.clienteZabud.domain.Services.ClienteGetService;
import com.cliente.clienteZabud.domain.Services.ClienteSaveService;
import com.cliente.clienteZabud.domain.entities.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class ClienteSave {
    private  final ClienteGetService clienteGetService;
    private ClienteSaveService clienteSaveService;
    public Cliente SaveCliente (Cliente cliente){
        Cliente findCliente = clienteGetService.getCliente(cliente.getId());

        return clienteSaveService.save(cliente);
    }

}
