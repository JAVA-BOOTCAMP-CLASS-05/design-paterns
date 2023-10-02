package creacional.factoryMethod;

public class Barco implements Transporte {

	@Override
	public void deliver() {
		System.out.println("BARCO -> Transportando carga maritima");
	}

}
