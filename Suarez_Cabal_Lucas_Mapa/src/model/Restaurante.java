package model;

public class Restaurante {

	private String nombre;
	private String direccion;
	private String telefono;

	public Restaurante(String nombre, String direccion, String telefono) {
		setNombre(nombre);
		setDireccion(direccion);
		setTelefono(telefono);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	// Marca el n�mero de tel�fono del restaurante para hacer una reserva
	public void llamar() {
		System.out.println("Llamando al " + telefono);
	}
}
