package com.cliente.clienteZabud.infrastructure.Adapter;

import com.cliente.clienteZabud.domain.Services.ClienteUpdateService;


//import com.cliente.clienteZabud.domain.Services.ClienteUpdateService;
import com.cliente.clienteZabud.domain.entities.Cliente;
import com.cliente.clienteZabud.infrastructure.Repository.ClienteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@AllArgsConstructor
@Service
public class ClienteUpdateAdapter implements ClienteUpdateService {
  private final ClienteRepo clienteRepo;
   @Transactional
  public void updateCliente(Cliente cliente){
       clienteRepo.updateCliente(cliente.getId(),cliente.getTypeId(),cliente.getName(),cliente.getLastName(), cliente.getState());
  }
}
