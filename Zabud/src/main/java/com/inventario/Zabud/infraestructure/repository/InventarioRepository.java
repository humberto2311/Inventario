package com.inventario.Zabud.infraestructure.repository;

import com.inventario.Zabud.infraestructure.dto.InventarioDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface InventarioRepository extends JpaRepository<InventarioDto,String> {
    @Query(nativeQuery = true, value = "update inventario_dto set nombre=:nombre " +
            ", cantidad=:cantidad, precio=:precio" +
            "where id=:id" )
    @Modifying
    void updateInventario(@Param(value = "id") String id,
                      @Param(value = "nombre") String nombre,
                      @Param(value = "cantidad") Integer cantidad,
                      @Param(value = "precio") Double precio);



}
