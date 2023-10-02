package creacional.factoryMethod;

public class LogisticaMaritima extends Logistica {

	@Override
	public Transporte createTransporte() {
		return new Barco();
	}

}
