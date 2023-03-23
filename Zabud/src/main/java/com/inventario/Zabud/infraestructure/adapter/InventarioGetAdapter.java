package com.inventario.Zabud.infraestructure.adapter;

import com.inventario.Zabud.domain.entity.Inventario;
import com.inventario.Zabud.domain.service.InventarioGetService;
import com.inventario.Zabud.infraestructure.dto.InventarioDto;
import com.inventario.Zabud.infraestructure.mapping.InventarioMap;
import com.inventario.Zabud.infraestructure.repository.InventarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@AllArgsConstructor
@Service
public class InventarioGetAdapter implements InventarioGetService {
    private  final InventarioRepository inventarioRepository;
    private  final InventarioMap inventarioMap;

    @Override
    public Inventario getInventario (String id){
        Optional<InventarioDto> inventarioDto= inventarioRepository.findById(id);
        return inventarioDto.map(inventarioMap::toEntity).orElseThrow(null);
    }


}
