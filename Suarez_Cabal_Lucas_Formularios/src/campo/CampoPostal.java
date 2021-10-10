package campo;

import restricciones.Restriccion;
import restricciones.RestriccionAnd;
import restricciones.RestriccionLongitudIgual;
import restricciones.RestriccionNumeros;

public class CampoPostal extends ACampo {

    public CampoPostal(String etiqueta) {
        super( etiqueta);
        RestriccionLongitudIgual r1 = new RestriccionLongitudIgual(5);
        RestriccionNumeros r2 = new RestriccionNumeros();
        RestriccionAnd r3 = new RestriccionAnd(r1, r2);
        this.r=r3;
    }
    
}
