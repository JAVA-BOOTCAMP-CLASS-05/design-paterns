package estructural.adapter;

public class DemoAdapter {

	public static void main(String[] args) {
		AgujeroRedondo agujero = new AgujeroRedondo(5);
    	PiezaRedonda pred = new PiezaRedonda(5);
    	if (agujero.encaja(pred)) {
    		System.out.println("La pieza redonda de radio 5 encaja en el agujero de radio 5");
    	}

    	PiezaCuadrada small = new PiezaCuadrada(2);
    	PiezaCuadrada large = new PiezaCuadrada(20);

		// Adapter solves the problem.
		PiezaCuadradaAdapter smallAdapter = new PiezaCuadradaAdapter(small);
		PiezaCuadradaAdapter largeAdapter = new PiezaCuadradaAdapter(large);
		if (agujero.encaja(smallAdapter)) {
		    System.out.println("La pieza cuadrada de ancho 2 encaja en el agujero de radio 5.");
		}
		
		PiezaTriangular pt = new PiezaTriangular(5, 10);
		
		if (!agujero.encaja(new PiezaTriangularAdapter(pt))) {
		    System.out.println("La pieza triangular NO encaja en el agujero de radio 5.");
			
		}
		
		if (!agujero.encaja(largeAdapter)) {
		    System.out.println("La pieza cuadrada de ancho 20 NO encaja en el agujero de radio 5.");
		}
	}

}
