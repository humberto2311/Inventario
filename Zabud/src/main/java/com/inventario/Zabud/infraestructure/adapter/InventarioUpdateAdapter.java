package com.inventario.Zabud.infraestructure.adapter;

import com.inventario.Zabud.domain.entity.Inventario;
import com.inventario.Zabud.domain.service.InventarioUpdateService;
import com.inventario.Zabud.infraestructure.repository.InventarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class InventarioUpdateAdapter  implements InventarioUpdateService {
    private  final InventarioRepository inventarioRepository;
    @Transactional
    public void updateInventario(Inventario inventario){
       inventarioRepository.updateInventario(inventario.getId(),inventario.getNombre(),inventario.getCantidad(),inventario.getPrecio());
    }
}
