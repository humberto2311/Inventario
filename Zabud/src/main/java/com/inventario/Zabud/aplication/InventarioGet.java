package com.inventario.Zabud.aplication;

import com.inventario.Zabud.domain.entity.Inventario;
import com.inventario.Zabud.domain.service.InventarioGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class InventarioGet {
    private final InventarioGetService inventarioGetService;
 public Inventario GetInventario(String id){
     return  inventarioGetService.getInventario((id));
 }
}
