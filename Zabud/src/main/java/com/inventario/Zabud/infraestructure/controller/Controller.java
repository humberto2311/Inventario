package com.inventario.Zabud.infraestructure.controller;

import com.inventario.Zabud.aplication.InventarioDelete;
import com.inventario.Zabud.aplication.InventarioGet;
import com.inventario.Zabud.aplication.InventarioSave;
import com.inventario.Zabud.aplication.InventarioUpdate;
import com.inventario.Zabud.domain.entity.Inventario;
import com.inventario.Zabud.infraestructure.mapping.InventarioMap;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/inventario")
public class Controller {
    private  final InventarioSave inventarioSave;
    private  final InventarioDelete inventarioDelete;
    private final InventarioGet inventarioGet;
    private  final InventarioUpdate inventarioUpdate;
    @GetMapping
    public ResponseEntity<Inventario> getInventario  (@RequestParam String id){
        return  new ResponseEntity<>(inventarioGet.GetInventario(id), HttpStatus.OK);
    }
    @PostMapping
    public  ResponseEntity<Inventario> addInventario(@RequestBody Inventario inv){
        return  new ResponseEntity<>(inventarioSave.SaveInv(inv),HttpStatus.CREATED);

    }
    @PutMapping
    public void updateInventario(@RequestBody Inventario inv){
        inventarioUpdate.updateInventario(inv);
    }

    @DeleteMapping
    public void inventarioDelete(@RequestParam String id) {
        inventarioDelete.deleteInventario(id);
    }

}
