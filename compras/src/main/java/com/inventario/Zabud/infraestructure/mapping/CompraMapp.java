package com.inventario.Zabud.infraestructure.mapping;

import com.inventario.Zabud.domain.entity.Compra;
import com.inventario.Zabud.infraestructure.dto.CompraDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompraMapp {

    @Mapping(target="id_persona", source="id_persona")
    @Mapping(target="id_producto", source="id_producto")
    @Mapping(target="cantidad", source="cantidad")

    CompraDto toDto(Compra compra);
    Compra toEntity(CompraDto carroDto);
}
