package com.inventario.Zabud.applicarion;

import com.inventario.Zabud.domain.entity.Compra;
import com.inventario.Zabud.domain.service.CompraGetService;
import com.inventario.Zabud.domain.service.CompraSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompraSave {
    private  final CompraGetService compraGetService;
    private final CompraSaveService compraSaveService;


   public  Compra SaveCompra(Compra compra){
       compraGetService.getCompra(compra.getId());
       return  compraSaveService.save(compra);
   }



    public void saveCompra(Compra compra) {
    }
}
