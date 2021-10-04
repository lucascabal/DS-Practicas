package lienzo;

import java.util.ArrayList;

import figuras.*

;public class Lienzo {

    private ArrayList<AFigura> figuras;

    public Lienzo(){
        this.figuras = new ArrayList<AFigura>();
    }

    public ArrayList<AFigura> getFiguras(){
        return figuras;
    }

    public void dibujar() {
        for(IFigura fig:figuras){
            System.out.println(fig.toString());
        }
    }

    /**
     * Dado un Lienzo, devuelve una Figura en caso de que se haya pinchado y null en caso de que
     * se haya pinchado en un espacio libre.
     * @return
     */
    public AFigura pincha(Point point){
        for(int i =0; i<getFiguras().size();i++){
            if(getFiguras().get(i).pinchado(new Point(point.x,point.y))){
                return getFiguras().get(i);
            }
        }
        return null;
    }
    
}
