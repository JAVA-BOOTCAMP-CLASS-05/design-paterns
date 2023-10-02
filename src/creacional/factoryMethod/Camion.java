package creacional.factoryMethod;

public class Camion implements Transporte {

	@Override
	public void deliver() {
		System.out.println("CAMION -> Transportando carga terrestre");
	}

}
