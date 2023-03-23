package com.inventario.Zabud.infraestructure.repository;

import com.inventario.Zabud.infraestructure.dto.CompraDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepo  extends JpaRepository<CompraDto,String> {

}
