package com.inventario.Zabud.aplication;

import com.inventario.Zabud.domain.entity.Inventario;
import com.inventario.Zabud.domain.service.InventarioGetService;
import com.inventario.Zabud.domain.service.InventarioSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@AllArgsConstructor
@Service
@Slf4j
public class InventarioSave {
    private final InventarioSaveService inventarioSaveService;
    private final InventarioGetService inventarioGetService;
    public Inventario SaveInv (Inventario inv){

        Inventario findInve=inventarioGetService.getInventario(inv.getId());
        if (Objects.nonNull(findInve)){
            log.info("Ya hay un carro con la placa {}.",inv.getId());
            throw new RuntimeException();
        }

        return  inventarioSaveService.save(inv);
    }
}
