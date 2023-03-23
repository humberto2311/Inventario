package com.cliente.clienteZabud.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class ClienteDto {
    @Id
    private String id;
    private String typeId;
    private String name;
    private  String lastName;
    private Boolean state;
}
