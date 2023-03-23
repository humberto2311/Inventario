package com.inventario.Zabud.infraestructure.controller;

import com.inventario.Zabud.applicarion.CompraGet;
import com.inventario.Zabud.applicarion.CompraSave;
import com.inventario.Zabud.domain.entity.Compra;
import com.inventario.Zabud.infraestructure.mapping.CompraMapp;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/compra")
public class ControllerCompra {

    private  final CompraSave compraSave;
    private  final CompraMapp compraMapp;
    private  final CompraGet compraGet;
    @GetMapping

    public ResponseEntity<Compra> getCompra(@RequestParam String id){

        return new ResponseEntity(compraMapp.toDto(compraGet.getCompra(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Compra> addCar(@RequestBody Compra co){
        return new ResponseEntity<>(compraSave.SaveCompra(co), HttpStatus.CREATED);
    }
}
