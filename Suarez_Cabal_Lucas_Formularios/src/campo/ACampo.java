package campo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import restricciones.Restriccion;

public abstract class ACampo implements Campo {
    Restriccion r;
    String etiqueta;

    public ACampo( String etiqueta){
        this.etiqueta=etiqueta;
    }

    public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = true;
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();
				//Reimplementacion
				valido = r.validar(texto);
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}

	public String getDato() {
		return texto;
	}

	private String texto;

	public Restriccion getRestriccion(){
		return r;
	}
    



}
