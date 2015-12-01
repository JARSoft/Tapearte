package com.jarsoft.user.tapearte.Dominio.Cliente;

import com.jarsoft.user.tapearte.Comunicacion.SocketMovil;

public class GestorAutenticarMovil {

	/**
	 * 
	 * @param u
	 */
	public boolean autenticar(Usuario u) {
		System.out.println("GestorAutenticarMovil: " + SocketMovil.realizarPeticion(u, 0));
		return true;
	}

}