package restricciones;
public class RestriccionOR implements Restriccion{

    public Restriccion r1;
    public Restriccion r2;

    public RestriccionOR(Restriccion r1, Restriccion r2){
        this.r1=r1;
        this.r2=r2;
    }

    @Override
    public boolean validar(String cadena) {
        return (r1.validar(cadena)||r2.validar(cadena));
    }
    
}
