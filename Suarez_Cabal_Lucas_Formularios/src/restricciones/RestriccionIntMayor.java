package restricciones;

public class RestriccionIntMayor implements Restriccion {

    public int numero;

    public RestriccionIntMayor(int numero){
        this.numero=numero;
    }

    @Override
    public boolean validar(String cadena) {
        int edad = Integer.parseInt(cadena);
        return edad>numero;
    }
    
}
