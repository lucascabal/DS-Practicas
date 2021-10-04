package figuras;

public class Triangulo extends AFigura {
    Point v1, v2, v3;

    @Override
    public boolean pinchado(Point posicion) {
        return (posicion.equals(v1) || posicion.equals(v2) || posicion.equals(v3));
    }


    public void setV1(Point v1){
        this.v1=v1;
    }

    public void setV2(Point v2){
        this.v2=v2;
    }

    public void setV3(Point v3){
        this.v3=v3;
    }

    

    @Override
    public void recolocar() {
        int v12x = v1.x-v2.x;
        int v12y = v1.y-v2.y;
        int v13x = v1.x-v3.x;
        int v13y = v1.y-v3.y;
        this.v1=new Point(x,y);
        this.v2=new Point(x+v12x,y+v12y);
        this.v3=new Point(x+v13x,y+v13y);
    }


    @Override
    public void pincha(Point pos) {
        posPinchazo=pos;
        if(hasPos()){
            this.x=pos.x;
            this.y=pos.y;
            v1=pos;
        }
        if(v1!=null){
            if(v2!=null){
                v3=pos;
            }
            else{
                v2=pos;
            }
        }
    }

    @Override
    public void soltar(Point pos) {
        mover(pos);    
    }

    @Override
    public String toString(){
        return("Triangulo con vertices en los siguientes puntos: (" + v1.x + "," + v1.y+ "), (" + v2.x + "," + v2.y+ "), ("+ v3.x + "," + v3.y+ ")");
    }


    
}
