package editor;

import figuras.*;
import lienzo.Lienzo;

public class Editor {

	private Lienzo lienzo;
	private IFigura figuraActual;


	public Editor(Lienzo lienzo) {
		setLienzo(lienzo);
		figuraActual=null;
	}

	private void setLienzo(Lienzo lienzo) {
		this.lienzo=lienzo;
	}

	public void dibujar() {
		lienzo.dibujar();
	}

	public void cuadrado(){
		lienzo.getFiguras().add(new Cuadrado());
		figuraActual = lienzo.getFiguras().get(lienzo.getFiguras().size()-1);
	}

	public void circulo(){
		lienzo.getFiguras().add(new Circulo());
		figuraActual = lienzo.getFiguras().get(lienzo.getFiguras().size()-1);
	}

	public void triangulo(){
		lienzo.getFiguras().add(new Triangulo());
		figuraActual = lienzo.getFiguras().get(lienzo.getFiguras().size()-1);
	}

	public void pinchar(Point pos){
		if(figuraActual!=null){
			if(!figuraActual.hasPos()){
				figuraActual.pincha(pos);
			}
		}
		else{
			figuraActual=lienzo.pincha(pos);
		}
	}

    public void mover(Point point) {
		if(figuraActual!=null){
			figuraActual.mover(point);
		}
    }

    public void soltar(Point point) {
		figuraActual.soltar(point);
    }



}
