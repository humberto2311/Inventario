package com.cliente.clienteZabud.domain.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public final class Cliente {
    @Id
    private String id;
    private String typeId;
    private String name;
    private  String lastName;
    private Boolean state;


}

