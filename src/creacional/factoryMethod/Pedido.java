package creacional.factoryMethod;

public class Pedido {
	
	private MedioTransporte medioTransporte;
	
	public Pedido(MedioTransporte mt) {
		this.setMedioTransporte(mt);
	}

	public MedioTransporte getMedioTransporte() {
		return medioTransporte;
	}

	public void setMedioTransporte(MedioTransporte medioTransporte) {
		this.medioTransporte = medioTransporte;
	}

}
