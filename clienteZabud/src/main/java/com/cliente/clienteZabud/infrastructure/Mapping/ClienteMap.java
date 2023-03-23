package com.cliente.clienteZabud.infrastructure.Mapping;


import com.cliente.clienteZabud.domain.entities.Cliente;
import com.cliente.clienteZabud.infrastructure.dto.ClienteDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper (componentModel = "spring")


public interface ClienteMap {

    @Mapping(target="id", source="id")
    @Mapping(target="typeId", source="typeId")
    @Mapping(target="name", source="name")
    @Mapping(target="lastName", source="lastName")
    @Mapping(target="state", source="state")
    ClienteDto toDto(Cliente cliente);
    Cliente toEntity(ClienteDto clienteDto);
}
