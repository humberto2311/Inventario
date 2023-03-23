package com.inventario.Zabud.applicarion;

import com.inventario.Zabud.domain.entity.Compra;
import com.inventario.Zabud.domain.service.CompraGetService;
import com.inventario.Zabud.infraestructure.mapping.CompraMapp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompraGet {
    private final CompraGetService compraGetService;


    public Compra getCompra(String id){
        return  compraGetService.getCompra(id);
    }
}
