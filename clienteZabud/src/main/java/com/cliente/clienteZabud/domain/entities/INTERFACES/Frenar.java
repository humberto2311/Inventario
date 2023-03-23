package com.cliente.clienteZabud.domain.entities.INTERFACES;

public interface Frenar
{
    default public void frenar(){
        System.out.println("Frenando el Vehículo.");
    }

}
