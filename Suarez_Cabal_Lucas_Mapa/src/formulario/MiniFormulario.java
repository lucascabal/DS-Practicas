package formulario;

import java.io.*;

import model.Monumento;

/* Formulario b�sico para usar cuando se quieran pedir solo dos valores sobre algo */
public class MiniFormulario {

	public void editar(Monumento monumento) {

		System.out.println("Editando Monumento.");

		System.out.println("Valores actuales:");
		imprimeMonumento(monumento);

		System.out.println("Escriba nuevos valores (dejar en blanco para dejar el valor actual):");
		System.out.print("- Autor: ");
		String texto = getLinea();
		if (texto.length() > 0)
			monumento.setAutor(texto);

		System.out.print("- Direcci�n: ");
		texto = getLinea();
		if (texto.length() > 0)
			monumento.setDireccion(texto);

		System.out.println("Valores finales:");
		imprimeMonumento(monumento);
	}

	private void imprimeMonumento(Monumento monumento) {
		System.out.println("- Autor = " + monumento.getAutor());
		System.out.println("- Direcci�n = " + monumento.getDireccion());
	}

	private String getLinea() {
		do {
			try {
				return consola.readLine();
			} catch (IOException ex) {
				System.out.println("Error de lectura. Int�ntelo de nuevo.");
			}
		} while (true);
	}

	BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
}
