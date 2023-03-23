package com.inventario.Zabud.aplication;

import com.inventario.Zabud.domain.entity.Inventario;
import com.inventario.Zabud.domain.service.InventarioUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class InventarioUpdate {

    private  final InventarioUpdateService inventarioUpdateService;

    public  void updateInventario(Inventario inventario){
        inventarioUpdateService.updateInventario(inventario);
    }
}
