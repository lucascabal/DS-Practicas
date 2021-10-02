package figuras;

public class Triangulo extends AFigura {
    Point v1, v2, v3;

    @Override
    public boolean pinchado(Point posicion) {
        return (posicion.equals(v1) || posicion.equals(v2) || posicion.equals(v3));
    }
    
}
