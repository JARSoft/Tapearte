package com.jarsoft.user.tapearte.Dominio.Cliente;

import java.util.ArrayList;

public class GestorClienteMovil {

	/**
	 * 
	 * @param usuario
	 * @param password
	 */
	public boolean autenticar(String usuario, String password) {
		GestorAutenticarMovil gestorAutenticarMovil = new GestorAutenticarMovil();
		Usuario user = new Usuario(usuario,password);
		System.out.println("GestorClienteMovil: "+gestorAutenticarMovil.autenticar(user));
		return true;
	}

	/**
	 * 
	 * @param usuario
	 * @param password
	 * @param email
	 */
	public boolean registrarse(String usuario, String password, String email) {
		// TODO - implement GestorClienteMovil.registrarse
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idBar
	 */
	public ArrayList<Tapa> consultarTapas(int idBar) {
		// TODO - implement GestorClienteMovil.consultarTapas
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idBar
	 * @param idTapa
	 * @param puntuacion
	 */
	public boolean votar(int idBar, int idTapa, int puntuacion) {
		// TODO - implement GestorClienteMovil.votar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idBar
	 * @param idTapa
	 * @param comentario
	 */
	public String comentar(int idBar, int idTapa, String comentario) {
		// TODO - implement GestorClienteMovil.comentar
		throw new UnsupportedOperationException();
	}

}