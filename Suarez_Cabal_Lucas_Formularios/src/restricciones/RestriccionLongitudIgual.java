package restricciones;

public class RestriccionLongitudIgual implements Restriccion {

    public int longitud;

    public RestriccionLongitudIgual(int longitud){
        this.longitud = longitud;
    }

    @Override
    public boolean validar(String cadena) {
        return cadena.length()==longitud;

    }

   

    
}
