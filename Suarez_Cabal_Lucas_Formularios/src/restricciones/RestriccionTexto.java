package restricciones;
/**
 * RestriccionNumeros
 */
public class RestriccionTexto implements Restriccion {

    @Override
    public boolean validar(String cadena) {
        for (char ch : cadena.toCharArray()) {
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return true;
    }

    
}