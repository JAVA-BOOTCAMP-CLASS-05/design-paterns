package creacional.factoryMethod;

public abstract class Logistica {
	
	public void ejecutarPlanDelivery() {
		System.out.println("Ejecutando Logistica");
		Transporte t = this.createTransporte();
		t.deliver();
		
	}
	
	public abstract Transporte createTransporte();

}
