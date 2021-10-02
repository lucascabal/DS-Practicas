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
    
}
