package campo;

import restricciones.Restriccion;
import restricciones.RestriccionAnd;
import restricciones.RestriccionIntMayor;
import restricciones.RestriccionNumeros;

public class CampoEdad extends ACampo {

    public CampoEdad(String etiqueta) {
        super(etiqueta);
        RestriccionNumeros r1 = new RestriccionNumeros();
        RestriccionIntMayor r2 = new RestriccionIntMayor(17);
        RestriccionAnd r3 = new RestriccionAnd(r1, r2);
        this.r=r3;
    }
    
}
