package campo;

import restricciones.Restriccion;
import restricciones.RestriccionContains;
import restricciones.RestriccionNumeros;
import restricciones.RestriccionOR;
import restricciones.RestriccionTexto;

public class CampoUbicacion extends ACampo {

    public CampoUbicacion(String etiqueta) {
        super(etiqueta);
        String[] ciudadesString = {"Oviedo", "Cadiz", "Santander"};

        RestriccionContains restriccionCiudades= new RestriccionContains(ciudadesString);
        
        CampoPostal cp = new CampoPostal(etiqueta);
        Restriccion restriccionPostal = cp.getRestriccion();

        RestriccionOR r1 = new RestriccionOR(restriccionCiudades, restriccionPostal);
        this.r=r1;
    }
    
}
