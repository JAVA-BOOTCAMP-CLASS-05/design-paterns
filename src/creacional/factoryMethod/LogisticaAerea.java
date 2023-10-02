package creacional.factoryMethod;

public class LogisticaAerea extends Logistica {

	@Override
	public Transporte createTransporte() {
		return new Avion();
	}

}
