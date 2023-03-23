package com.cliente.clienteZabud.infrastructure.Adapter;

import com.cliente.clienteZabud.domain.Services.ClienteDeleteService;
import com.cliente.clienteZabud.infrastructure.Repository.ClienteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteDeleteAdapter implements ClienteDeleteService {
    private  final ClienteRepo clienteRepo;
    public void  deleteCliente (String id){

        clienteRepo.deleteById(id);
    }

}
