package com.jarsoft.user.tapearte.Dominio.Cliente;

import com.jarsoft.user.tapearte.Comunicacion.SocketMovil;

public class GestorAnadirTapa {
    private static int STATIC_TAPA_ADDER = 2;
    /**
     *
     * @param t
     */
    public boolean anadirTapa(Tapa t) {
        // TODO - implement GestorAnadirTapa.anadirTapa
        return (boolean)SocketMovil.realizarPeticion(t,STATIC_TAPA_ADDER);
    }

}