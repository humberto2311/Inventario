package com.cliente.clienteZabud.infrastructure.Adapter;


import com.cliente.clienteZabud.domain.Services.ClienteGetService;
import com.cliente.clienteZabud.domain.entities.Cliente;
import com.cliente.clienteZabud.infrastructure.Mapping.ClienteMap;
import com.cliente.clienteZabud.infrastructure.Repository.ClienteRepo;
import com.cliente.clienteZabud.infrastructure.dto.ClienteDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class ClienteGetAdapter implements ClienteGetService {
    private  final ClienteRepo clienteRepo;
    private final ClienteMap clienteMap;
    @Override
    public Cliente getCliente(String id){

        Optional<ClienteDto> clienteDto = clienteRepo.findById(id);
        return clienteDto.map((clienteMap::toEntity)).orElse(null);


    }
    private Cliente buildCliente(ClienteDto cliente){
        return new Cliente(cliente.getId(), cliente.getTypeId(),cliente.getName(),cliente.getLastName(),cliente.getState());
    }

}
