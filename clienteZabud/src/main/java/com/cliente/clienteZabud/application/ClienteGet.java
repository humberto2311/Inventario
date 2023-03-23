package com.cliente.clienteZabud.application;

import com.cliente.clienteZabud.domain.Services.ClienteGetService;
import com.cliente.clienteZabud.domain.entities.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteGet {
    private  final ClienteGetService clienteGetService;

    public Cliente GetCliente(String id){
        return clienteGetService.getCliente(id);
    }

}
