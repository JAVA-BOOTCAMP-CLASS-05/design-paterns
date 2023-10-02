package creacional.factoryMethod;

public class LogisticaTerrestre extends Logistica {

	@Override
	public Transporte createTransporte() {
		return new Camion();
	}

}
