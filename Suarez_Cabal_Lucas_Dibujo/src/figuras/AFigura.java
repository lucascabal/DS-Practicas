package figuras;

public abstract class AFigura implements IFigura {
    int x =-1;
    int y =-1; //Posicion donde se crea el objeto por primera vez
    Point posPinchazo;
    public AFigura(){
        
    }

    public void setPosicion(Point pos){
        this.x = pos.x;
        this.y = pos.y;
    }

    public void mover (Point posPinchada, Point posMovida){
        int desplazamientoX = posPinchada.x-posMovida.x;
        int desplazamientoY = posPinchada.y-posMovida.y;
        this.x-=desplazamientoX;
        this.y=desplazamientoY;
        recolocar();
    }

    public boolean hasPos(){
        return x!=-1 && x!=-1;
    }

    
    public void mover(Point pos) {
        int movX=posPinchazo.x-pos.x;
        int movY=posPinchazo.y-pos.y;
        this.x+=movX;
        this.y+=movY;
        recolocar();
    }

}
