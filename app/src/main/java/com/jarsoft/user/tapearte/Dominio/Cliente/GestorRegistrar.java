package com.jarsoft.user.tapearte.Dominio.Cliente;

import com.jarsoft.user.tapearte.Comunicacion.SocketMovil;

public class GestorRegistrar {

	/**
	 * 
	 * @param u
	 */
	private static int STATIC_USER_REGISTER = 6;

	public boolean registrar(Usuario u) {
		return (boolean)SocketMovil.realizarPeticion(u, STATIC_USER_REGISTER);
	}

}