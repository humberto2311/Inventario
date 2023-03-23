package com.inventario.Zabud.infraestructure.adapter;

import com.inventario.Zabud.domain.entity.Inventario;
import com.inventario.Zabud.domain.service.InventarioSaveService;
import com.inventario.Zabud.infraestructure.dto.InventarioDto;
import com.inventario.Zabud.infraestructure.mapping.InventarioMap;
import com.inventario.Zabud.infraestructure.repository.InventarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class InventarioSaveAdapter implements InventarioSaveService {

    private final InventarioRepository inventarioRepository;

    private final InventarioMap inventarioMap;

    public Inventario save (Inventario inventario ){
        return  inventarioMap.toEntity((inventarioRepository.save(inventarioMap.toDto(inventario))));
    }
}
