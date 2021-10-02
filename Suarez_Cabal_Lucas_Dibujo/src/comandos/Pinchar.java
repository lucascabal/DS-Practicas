package comandos;

import figuras.*;
import lienzo.Lienzo;

public class Pinchar {
    int x,y;

    public Pinchar(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    /**
     * Dado un Lienzo, devuelve una Figura en caso de que se haya pinchado y null en caso de que
     * se haya pinchado en un espacio libre
     * @return
     */
    public AFigura pincha(Lienzo lienzo){
        for(int i =0; i<lienzo.getFiguras().size();i++){
            if(lienzo.getFiguras().get(i).pinchado(new Point(x,y))){
                return lienzo.getFiguras().get(i);
            }
        }
        return null;

    }
    
}
