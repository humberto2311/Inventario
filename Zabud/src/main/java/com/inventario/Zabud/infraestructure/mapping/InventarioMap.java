package com.inventario.Zabud.infraestructure.mapping;

import com.inventario.Zabud.domain.entity.Inventario;
import com.inventario.Zabud.infraestructure.dto.InventarioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InventarioMap {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "nombre", source = "nombre")
    @Mapping(target = "cantidad", source = "cantidad")
    @Mapping(target = "precio", source = "precio")

    InventarioDto toDto(Inventario inventario);

   Inventario toEntity(InventarioDto inventario);


}
