package com.cliente.clienteZabud.application;

import com.cliente.clienteZabud.domain.Services.ClienteDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteDelete {
    private final ClienteDeleteService clienteDeleteService;
   public void  deleteCliente (String id){
       clienteDeleteService.deleteCliente(id);
   }

}
