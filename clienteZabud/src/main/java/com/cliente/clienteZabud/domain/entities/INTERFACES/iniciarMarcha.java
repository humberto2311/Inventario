package com.cliente.clienteZabud.domain.entities.INTERFACES;

public interface iniciarMarcha {
    default public void iniciarMarcha(){
        System.out.println("Iniciando marcha");
    }
}
