package elements;

import google.maps.Coordenadas;

public interface MapElement {
    String getTitle();
    Coordenadas getCoordinates();
	String getTooltipInfo();
	void abrir();
}
