package estructural.composite;

import java.awt.Color;

public class Demo {

	public static void main(String[] args) {

		Editor editor = new Editor();

	    editor.cargarFiguras(
	                new Circulo(10, 10, 10, Color.BLUE),

	                new FiguraCompuesta(
	                    new Circulo(110, 110, 50, Color.RED),
	                    new Punto(160, 160, Color.RED)
	                ),

	                new FiguraCompuesta(
	                        new Rectangulo(250, 250, 100, 100, Color.GREEN),
	                        new Punto(240, 240, Color.GREEN),
	                        new Punto(240, 360, Color.GREEN),
	                        new Punto(360, 360, Color.GREEN),
	                        new Punto(360, 240, Color.GREEN)
	                )
	        );
}

}
