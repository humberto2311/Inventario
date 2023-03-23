package com.inventario.Zabud.infraestructure.adapter;

import com.inventario.Zabud.domain.service.InventarioDeleteService;
import com.inventario.Zabud.infraestructure.repository.InventarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class InventarioDeleteAdapter implements InventarioDeleteService {
    private final InventarioRepository inventarioRepository;

    public void deleteInventario(String id){

        inventarioRepository.deleteById(id);
    }
}
