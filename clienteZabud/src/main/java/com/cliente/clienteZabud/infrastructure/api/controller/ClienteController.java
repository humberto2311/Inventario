package com.cliente.clienteZabud.infrastructure.api.controller;


import com.cliente.clienteZabud.application.ClienteDelete;
import com.cliente.clienteZabud.application.ClienteGet;
import com.cliente.clienteZabud.application.ClienteSave;

import com.cliente.clienteZabud.application.ClienteUpdate;
import com.cliente.clienteZabud.domain.entities.Cliente;
import com.cliente.clienteZabud.infrastructure.Mapping.ClienteMap;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@RestController
@RequestMapping(path="/cliente")
public class ClienteController {
    private final ClienteMap clienteMap;
    private final ClienteGet clienteGet;
    private final ClienteSave clienteSave;
    private final ClienteDelete clienteDelete;

    private final ClienteUpdate clienteUpdate;



    @GetMapping

    public ResponseEntity<Cliente> getCaninos(@RequestParam String id) {

        return new ResponseEntity(clienteMap.toDto(clienteGet.GetCliente(id)), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cl) {
        return new ResponseEntity<>(clienteSave.SaveCliente(cl), HttpStatus.CREATED);
    }
   @DeleteMapping
  public void clienteDelete(@RequestParam String id) {
      clienteDelete.deleteCliente(id);
    }

  @PutMapping
    public void updateCliente(@RequestBody Cliente cl){
     clienteUpdate.updateCliente(cl);
   }

}


