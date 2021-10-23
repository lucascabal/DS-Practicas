package google.maps;

import java.awt.Rectangle;
import java.util.*;

import elements.MapElement;

public class Mapa {
	private List<MapElement> marcadores = new ArrayList<MapElement>();

	public void add(MapElement element) {
		marcadores.add(element);
	}

	public void dibujar() {
		// 1. Aqu� se dibujar�a el mapa
			// Ejercicio opcional para casa :)
		
		// 2. Y ahora se dibujar�an los marcadores encima
		for (MapElement marcador : marcadores)
			System.out.println("Marcador rojo en " + marcador.getCoordinates());
	}

	public void pulsacionCorta(int x, int y) {
		MapElement marcador = buscaMarcador(x, y);
		if (marcador != null)
			System.out.println("Ventana flotante: " + marcador.getTooltipInfo());
	}

	public void pulsacionLarga(int x, int y) {
		MapElement marcador = buscaMarcador(x, y);
		if (marcador != null)
			marcador.abrir();
	}
	

	// M�todo auxiliar privado ----------------------
	private MapElement buscaMarcador(int x, int y) {
		for (MapElement marcador : marcadores) {
			Coordenadas coordenadas = marcador.getCoordinates();
			Rectangle elementArea = new Rectangle((int) coordenadas.getLongitud(), (int) coordenadas.getLatitud(), 9, 9);
			if (elementArea.contains(x, y))
				return marcador;
		}
		return null;
	}

}
