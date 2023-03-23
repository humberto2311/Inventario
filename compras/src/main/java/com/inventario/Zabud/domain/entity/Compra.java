package com.inventario.Zabud.domain.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Compra {
    @Id
    private String id;
    private  String id_persona;
    private String id_producto;
    private Integer cantidad;


}
