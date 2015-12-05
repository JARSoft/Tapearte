package com.jarsoft.user.tapearte.Dominio.Cliente;

import com.jarsoft.user.tapearte.Comunicacion.SocketMovil;

import java.util.ArrayList;
import java.util.Arrays;

public class GestorConsultarTapas {

	/**
	 * 
	 * @param b
	 */
	private static int STATIC_TAPAS_POR_BAR_CHECKER = 4;

	public ArrayList<Tapa> consultarTapas(Bar b) {
		return (ArrayList<Tapa>) SocketMovil.realizarPeticion(b, STATIC_TAPAS_POR_BAR_CHECKER);
	}


}