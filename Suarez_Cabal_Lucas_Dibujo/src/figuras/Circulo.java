package figuras;

public class Circulo extends AFigura {

    Point centro;
    int radio =0;
    // Esto es para saber en que posicion esta dirigido el circulo en funcion de
    // donde esta el angulo que
    // forman el punto x, y y el extremo.
    int cuadrante;
    public Circulo() {

    }

    public void setPuntoExtremo(Point p) {
        int distanciaCatetoX = Math.abs(p.x - x);
        int distanciaCatetoY = Math.abs(p.y - y);
        double dradio =  (Math.sqrt(Math.pow(distanciaCatetoX, 2)  + Math.pow(distanciaCatetoY, 2)) / 2);
        radio= (int) (dradio);
        calcularCuadrante(p);
        calcularCentro();
    }

    private void calcularCuadrante(Point p) {
        if (p.x < x) {
            if (p.y < y) {
                this.cuadrante = 3;
            } else {
                this.cuadrante = 2;
            }
        } else {
            if (p.y < y) {
                this.cuadrante = 4;
            } else {
                this.cuadrante = 1;
            }
        }

    }

    @Override
    public boolean pinchado(Point posicion) {
        double distancia = Math.sqrt(Math.pow(posicion.x - centro.x, 2) + Math.pow(posicion.y - centro.y, 2))/2;
        return distancia < radio;
    }

    @Override
    public void recolocar() {
        calcularCentro();

    }

    public void calcularCentro() {
        centro = new Point(0, 0);
        switch (cuadrante) {
            case 1:
                centro.x = x + radio;
                centro.y = y + radio;
                break;
            case 2:
                centro.x = x - radio;
                centro.y = y + radio;
                break;
            case 3:
                centro.x = x - radio;
                centro.y = y - radio;
                break;
            case 4:
                centro.x = x - radio;
                centro.y = y - radio;
                break;
        }
    }

    @Override
    public void pincha(Point pos) {
        posPinchazo=pos;
        if (!hasPos()) {
            x = pos.x;
            y = pos.y;
        }
    }

    @Override
    public void soltar(Point pos) {
        if(radio==0){
            setPuntoExtremo(pos);
        }
        else
            mover(pos);
    }
    
    @Override
    public String toString(){
        return ("Circulo de radio: " + radio + " y centro en " + "(" + centro.x + "," + centro.y + ")");
    }

}
