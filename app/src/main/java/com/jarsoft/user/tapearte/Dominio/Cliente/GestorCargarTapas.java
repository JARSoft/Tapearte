package com.jarsoft.user.tapearte.Dominio.Cliente;

import com.jarsoft.user.tapearte.Comunicacion.SocketMovil;

import java.util.ArrayList;

/**
 * Created by user on 04/12/2015.
 */
public class GestorCargarTapas {
    private static int STATIC_TAPA_CHECKER = 51;

    public ArrayList<Tapa> consultarTapas() {
        // TODO - implement GestorConsultarTapas.consultarTapas
        return (ArrayList<Tapa>)SocketMovil.realizarPeticion(STATIC_TAPA_CHECKER);
    }
}
