package com.cliente.clienteZabud.domain.Services;

import com.cliente.clienteZabud.application.ClienteSave;
import com.cliente.clienteZabud.domain.entities.Cliente;

public interface ClienteGetService {
    Cliente getCliente(String id);

}
