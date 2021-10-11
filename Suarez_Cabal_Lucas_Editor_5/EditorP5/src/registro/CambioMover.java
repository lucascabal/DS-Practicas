package registro;

import editor.Figura;

public class CambioMover implements ICambio {

    private int yFinal;
    private int xFinal;
    private int yInicial;
    private int xInicial;
    private Figura figura;
    
    public CambioMover(Figura figura, int xInicial, int yInicial,int xFinal,int yFinal) {
        this.figura = figura;
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.xFinal = xFinal;
        this.yFinal = yFinal;

    }

    @Override
    public void undo() {
        figura.mover(xInicial, yInicial);;
    }

    @Override
    public void redo() {
        figura.mover(xFinal, yFinal);

    }
    
}