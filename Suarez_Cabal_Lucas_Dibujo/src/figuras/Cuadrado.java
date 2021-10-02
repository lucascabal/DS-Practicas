package figuras;

public class Cuadrado extends AFigura {
    private Point esquina;
    private int alto;
    private int ancho;

    

    @Override
    public boolean pinchado(Point posicion) {
        return (esquina.x <= posicion.x && posicion.x <= esquina.x + ancho) && (esquina.y <= posicion.y && posicion.y <= esquina.y + alto);
    }
    
}
