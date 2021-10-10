package campo;

import restricciones.Restriccion;
import restricciones.RestriccionTexto;

public class CampoNombre extends ACampo {

    public CampoNombre(String etiqueta) {
        super( etiqueta);
        RestriccionTexto r1= new RestriccionTexto();
        this.r=r1;
    }
    
}
