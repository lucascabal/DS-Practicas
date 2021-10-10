package restricciones;

public class RestriccionContains implements Restriccion {

    private String[] elementos;

    public RestriccionContains(String[] elementos){
        this.elementos = elementos;
    }

    @Override
    public boolean validar(String cadena) {
        for(String elemento:elementos){
            if(elemento.equals(cadena)){
                return true;
            }
        }
        return false;
    }

   

    
}
