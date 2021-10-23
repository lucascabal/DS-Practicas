package model;

public class Monumento {

	private String nombre;
	private String autor;
	private String direccion;

	public Monumento(String nombre, String autor, String direccion) {
		setNombre(nombre);
		setAutor(autor);
		setDireccion(direccion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
