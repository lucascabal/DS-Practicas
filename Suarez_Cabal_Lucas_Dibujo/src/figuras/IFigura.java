package figuras;

public interface IFigura {
    public boolean pinchado(Point posicion);
    public void recolocar();
    public boolean hasPos();
    public void pincha(Point pos);
    public void mover(Point pos);
    public void soltar(Point pos);
}
