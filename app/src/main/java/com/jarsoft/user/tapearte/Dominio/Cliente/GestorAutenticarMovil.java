package com.jarsoft.user.tapearte.Dominio.Cliente;

import com.jarsoft.user.tapearte.Comunicacion.SocketMovil;

public class GestorAutenticarMovil {

	private static int STATIC_LOGIN_PARAMETER = 0;
	/**
	 * 
	 * @param u
	 */
	public int autenticar(Usuario u) {
		return (int)SocketMovil.realizarPeticion(u, STATIC_LOGIN_PARAMETER);
	}

}