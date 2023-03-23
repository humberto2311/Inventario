package com.inventario.Zabud.infraestructure.adapter;

import com.inventario.Zabud.domain.entity.Compra;
import com.inventario.Zabud.domain.service.CompraGetService;
import com.inventario.Zabud.infraestructure.dto.CompraDto;
import com.inventario.Zabud.infraestructure.mapping.CompraMapp;
import com.inventario.Zabud.infraestructure.repository.CompraRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class CompraGetadapter implements CompraGetService {

    private  final CompraMapp compraMapp;
    private  final CompraRepo compraRepo;

    @Override
    public Compra getCompra(String id){
        Optional<CompraDto> compraDto= compraRepo.findById(id);

 return compraDto.map(compraMapp::toEntity).orElse(null);
    }

}
