package model;

import google.maps.Coordenadas;

public class Foto {

	private String usuario; // Usuario que ha subido la foto
	private String descripcion;
	private Coordenadas coordenadas; // Coordenadas GPS de la foto

	public Foto(String usuario, String descripcion, Coordenadas coordenadas) {
		setUsuario(usuario);
		setDescripcion(descripcion);
		setCoordenadas(coordenadas);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Coordenadas getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	// Baja la foto
	public void descargar() {
		System.out.println("Bajando foto: " + descripcion);
	}

}
