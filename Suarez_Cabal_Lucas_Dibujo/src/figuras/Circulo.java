package figuras;

public class Circulo extends AFigura {

        
        Point centro; int radio;
    @Override
    public boolean pinchado(Point posicion) {
        double distancia = Math.sqrt(Math.pow(posicion.x - centro.x, 2) + Math.pow(posicion.y - centro.y, 2));
        return distancia < radio;
    }
    
}
