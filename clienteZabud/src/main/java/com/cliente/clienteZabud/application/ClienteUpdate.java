package com.cliente.clienteZabud.application;

import com.cliente.clienteZabud.domain.Services.ClienteUpdateService;
import lombok.AllArgsConstructor;



import com.cliente.clienteZabud.domain.entities.Cliente;

import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteUpdate {
   private final ClienteUpdateService clienteUpdateService;

  public  void updateCliente(Cliente cliente){
       clienteUpdateService.updateCliente(cliente);
    }

}
