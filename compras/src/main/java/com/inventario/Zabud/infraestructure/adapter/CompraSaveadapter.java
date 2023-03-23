package com.inventario.Zabud.infraestructure.adapter;

import com.inventario.Zabud.domain.entity.Compra;
import com.inventario.Zabud.domain.service.CompraSaveService;
import com.inventario.Zabud.infraestructure.mapping.CompraMapp;
import com.inventario.Zabud.infraestructure.repository.CompraRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CompraSaveadapter implements CompraSaveService {

    private  final CompraRepo compraRepo;

    private final CompraMapp compraMapp;

    @Override
    public Compra save (Compra compra){
        return  compraMapp.toEntity(compraRepo.save(compraMapp.toDto(compra)));
    }
}
