package com.cliente.clienteZabud.infrastructure.Adapter;


import com.cliente.clienteZabud.domain.Services.ClienteGetService;
import com.cliente.clienteZabud.domain.Services.ClienteSaveService;
import com.cliente.clienteZabud.domain.entities.Cliente;
import com.cliente.clienteZabud.infrastructure.Mapping.ClienteMap;
import com.cliente.clienteZabud.infrastructure.Repository.ClienteRepo;
import com.cliente.clienteZabud.infrastructure.dto.ClienteDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class ClienteSaveAdapter implements ClienteSaveService {
    private  final ClienteRepo clienteRepo;
    private  final ClienteMap clienteMap;

    public Cliente save (Cliente cliente){
        return clienteMap.toEntity(clienteRepo.save(clienteMap.toDto((cliente))));

    }}