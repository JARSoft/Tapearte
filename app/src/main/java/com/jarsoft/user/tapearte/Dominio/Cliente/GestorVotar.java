package com.jarsoft.user.tapearte.Dominio.Cliente;

import com.jarsoft.user.tapearte.Comunicacion.SocketMovil;

public class GestorVotar {

	private static int STATIC_PUNTUAR_TAPA = 7;
	/**
	 * 
	 * @param t
	 * @param puntuacion
	 */
	public boolean votar(Tapa t, float puntuacion) {
		// TODO - implement GestorVotar.votar
		return (boolean)SocketMovil.realizarPeticion(t, puntuacion,STATIC_PUNTUAR_TAPA);
	}

}