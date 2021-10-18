package registro;

import editor.Dibujo;
import editor.Figura;

public class CambioCrear implements ICambio{

    
    private Figura figura;
    private Dibujo dibujo;

    public CambioCrear(Figura figura, Dibujo dibujo){
        this.figura = figura;
        this.dibujo = dibujo;
    }


    @Override
    public void undo() {
        dibujo.figuras.remove(figura);
    }

    @Override
    public void redo() {
        dibujo.figuras.add(figura);
    }

}