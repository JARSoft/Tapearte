package com.jarsoft.user.tapearte.Dominio.Cliente;

import com.jarsoft.user.tapearte.Comunicacion.SocketMovil;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 02/12/2015.
 */
public class GestorConsultarBares {
    private static int STATIC_BAR_CHECKER = 4;

    public Bar[] consultarBares() {
        // TODO - implement GestorConsultarTapas.consultarTapas
        return (Bar[])SocketMovil.realizarPeticion(STATIC_BAR_CHECKER);
    }
}
