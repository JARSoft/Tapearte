package com.jarsoft.user.tapearte.Dominio.Cliente;

import com.jarsoft.user.tapearte.Comunicacion.SocketMovil;

public class GestorEliminarTapa {
    private static int STATIC_TAPA_REMOVER=5;

    /**
     *
     * @param t
     */
    public boolean eliminarTapa(Tapa t) {
        // TODO - implement GestorAnadirTapa.anadirTapa
        return (boolean) SocketMovil.realizarPeticion(t, STATIC_TAPA_REMOVER);
    }

}