package com.inventario.Zabud.infraestructure.dto;

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
public class InventarioDto {
    @Id
    private String id;
    private String nombre;
    private  Integer cantidad;
    private Double precio;
}
