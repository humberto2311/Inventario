package com.inventario.Zabud.infraestructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class CompraDto {
    @Id
   private String id;
    private  String id_persona;
    private  String id_producto;
    private  Integer cantidad;


}
