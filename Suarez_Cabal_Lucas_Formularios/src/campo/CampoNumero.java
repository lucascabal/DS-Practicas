package campo;

import restricciones.RestriccionNumeros;

public class CampoNumero extends ACampo {

    public CampoNumero(String etiqueta) {
        super(etiqueta);
        this.r = new RestriccionNumeros();
    }
    
}
