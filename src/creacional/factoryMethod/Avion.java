package creacional.factoryMethod;

public class Avion implements Transporte {

	@Override
	public void deliver() {
		System.out.println("AVION -> Transportando carga aerea");
	}

}
