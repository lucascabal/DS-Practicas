package elements;

import google.maps.Coordenadas;
import google.maps.Navegador;
import model.Restaurante;

/**
 * MonumentoElement
 */
public class RestauranteElement implements MapElement {

    private Restaurante restaurante;
    private Navegador nav;


    public RestauranteElement(Restaurante restaurante)
	{
		this.restaurante = restaurante;
        this.nav = new Navegador();
	}


    @Override
    public String getTitle() {
        return "Monumento: " + restaurante.getNombre();
    }

    @Override
    public Coordenadas getCoordinates() {
        return nav.getCoordenadas(restaurante.getDireccion());
    }

    @Override
    public String getTooltipInfo() {
        return restaurante.getNombre() + "\t" + restaurante.getDireccion() + "\t" + restaurante.getTelefono() +"\n" +
				restaurante.getDireccion();
    }

    @Override
    public void abrir() {
        nav.navegarHasta(restaurante.getDireccion());
        
    }

    
}