package com.inventario.Zabud.domain.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Inventario {
    @Id
    private String id;
    private String nombre;
    private  Integer cantidad;
    private Double precio;
}
