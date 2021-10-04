package figuras;


public class Cuadrado extends AFigura {
    private Point esquina;
    private int alto;
    private int ancho;


    public void setEsquina(Point esquina) {
        this.esquina = new Point(esquina.x, esquina.y);
        if (this.x != -1 && this.y != -1) {
            this.ancho = Math.abs(this.x - esquina.x);
            this.alto = Math.abs(this.y - esquina.y);
        }
    }

    @Override
    public boolean pinchado(Point posicion) {
        return (esquina.x <= posicion.x && posicion.x <= esquina.x + ancho)
                && (esquina.y <= posicion.y && posicion.y <= esquina.y + alto);
    }



    public void recolocar(){
        this.esquina.y = this.y+alto;
        this.esquina.x = this.x+alto;
    }

    @Override
    public void pincha(Point pos) {
        posPinchazo=pos;
        if(!hasPos()){
            this.x=pos.x;
            this.y=pos.y;
        }else{
            System.err.println("SOLTAR PARA CREAR CUADRADO");
        }
        
    }

    @Override
    public void soltar(Point pos) {
       setEsquina(pos);  
    }


    @Override
    public String toString(){
        return ("Cuadrado de ancho: " + ancho + " alto " + alto + " posicionado en " + "(" + x + "," + y + ")");
    }

   


}
