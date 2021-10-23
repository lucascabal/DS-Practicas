package elements;

import google.maps.Coordenadas;
import google.maps.Navegador;
import model.Monumento;

/**
 * MonumentoElement
 */
public class MonumentoElement implements MapElement {

    private Monumento mon;
    private Navegador nav;


    public MonumentoElement(Monumento monument)
	{
		this.mon = monument;
        this.nav = new Navegador();
	}


    @Override
    public String getTitle() {
        return "Monumento: " + mon.getNombre();
    }

    @Override
    public Coordenadas getCoordinates() {
        return nav.getCoordenadas(mon.getDireccion());
    }

    @Override
    public String getTooltipInfo() {
        return mon.getNombre() + ". Creado por " + mon.getAutor() + "\n" +
				mon.getDireccion();
    }

    @Override
    public void abrir() {
        nav.navegarHasta(mon.getDireccion());
        
    }

    
}