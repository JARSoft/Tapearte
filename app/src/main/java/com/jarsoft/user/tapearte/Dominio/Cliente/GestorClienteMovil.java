package com.jarsoft.user.tapearte.Dominio.Cliente;

import com.jarsoft.user.tapearte.Comunicacion.SocketMovil;

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
		return gestorAutenticarMovil.autenticar(user);
	}

	/**
	 * 
	 * @param usuario
	 * @param password
	 * @param email
	 */
	public boolean registrarse(String usuario, String password, String email) {
		Usuario user = new Usuario(usuario, password, email);
		GestorRegistrar gestorRegistrar = new GestorRegistrar();
		return gestorRegistrar.registrar(user);
	}

	/**
	 * 
	 * @param bar
	 */
	public ArrayList<Tapa> consultarTapas(Bar bar) {
        GestorConsultarTapas gestorConsultarTapas = new GestorConsultarTapas();
        return gestorConsultarTapas.consultarTapas(bar);
	}

	/**
	 *
	 * @param idBar
	 * @param codigo
	 * @param puntuacion
	 */
	//TODO HE CABIAO COSAS
	public boolean votar(int idBar, int codigo, float puntuacion) {
		GestorConsultarTapaPorCodigo gctpc = new GestorConsultarTapaPorCodigo();
		Tapa tapa = gctpc.consultarTapa(codigo);
		if(tapa!=null){
			GestorVotar gestorVotar = new GestorVotar();
			return gestorVotar.votar(tapa, puntuacion);
		}
		else
			return false;

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