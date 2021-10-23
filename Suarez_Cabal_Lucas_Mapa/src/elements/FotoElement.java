package elements;

import google.maps.Coordenadas;
import model.Foto;

/**
 * MonumentoElement
 */
public class FotoElement implements MapElement {

    private Foto foto;

    public FotoElement(Foto foto)
	{
		this.foto = foto;
	}


    @Override
    public String getTitle() {
        return "Monumento: " + foto.getDescripcion();
    }

    @Override
    public Coordenadas getCoordinates() {
        return foto.getCoordenadas();
    }

    @Override
    public String getTooltipInfo() {
        return foto.getDescripcion() + " (foto de " + foto.getUsuario() + ")";
    }

    @Override
    public void abrir() {
        foto.descargar();
    }

    
}