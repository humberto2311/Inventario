package com.cliente.clienteZabud.infrastructure.Repository;

import com.cliente.clienteZabud.infrastructure.dto.ClienteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteRepo  extends JpaRepository<ClienteDto,String> {

  @Query(nativeQuery = true, value = "update cliente_dto set type_id=:typeId" +
         ", name=:name, last_name=:lastName" + ",state=:state where id=:id" )
  @Modifying
   void updateCliente(@Param(value = "id") String id,
                     @Param(value = "typeId") String typeId,
                     @Param(value = "name") String name,
                      @Param(value = "lastName") String lastName,
                     @Param(value = "state") Boolean state);
}
