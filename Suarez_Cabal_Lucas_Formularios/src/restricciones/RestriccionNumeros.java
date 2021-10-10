package restricciones;
/**
 * RestriccionNumeros
 */
public class RestriccionNumeros implements Restriccion {

    @Override
    public boolean validar(String cadena) {
        try{
            Integer.parseInt(cadena);
        }catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }

    
}