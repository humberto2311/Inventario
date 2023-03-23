package com.inventario.Zabud.aplication;

import com.inventario.Zabud.domain.service.InventarioDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service


public class InventarioDelete {
    private  final InventarioDeleteService inventarioDeleteService;

    public  void deleteInventario(String id){
        inventarioDeleteService.deleteInventario(id);
    }
}
