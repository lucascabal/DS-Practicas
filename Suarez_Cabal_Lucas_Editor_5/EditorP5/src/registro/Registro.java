package registro;

import java.util.Stack;

public class Registro {
    public Stack<ICambio> undo;
    public Stack<ICambio> redo;

    public Registro(){
        this.undo = new Stack<>();
    }

    public void undo(){
        if(undo.empty()){
            System.out.println("Operacion no disponible");
        }
        else{
            ICambio cambio = undo.pop();
            cambio.undo();
            redo.push(undo.pop());
        }
    }

    public void redo(){
        if(undo.empty()){
            System.out.println("Operacion no disponible");
        }
        else{
            ICambio cambio = redo.pop();
            cambio.redo();
            undo.push(redo.pop());
        }
    }

    public void add(ICambio cambio){
        undo.push(cambio);  
        redo.clear();
    }

}