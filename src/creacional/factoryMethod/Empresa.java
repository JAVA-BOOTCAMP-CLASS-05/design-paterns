package creacional.factoryMethod;

public class Empresa {
	

	public void dispatch(Pedido p) {
		Logistica l = switch (p.getMedioTransporte()) {
            case TERRESTRE -> new LogisticaTerrestre();
            case AEREO -> new LogisticaAerea();
            case MARITIMO -> new LogisticaMaritima();
        };

        l.ejecutarPlanDelivery();
	}
	
	public static void main(String[] args) {
		Empresa e = new Empresa();
		
		e.dispatch(new Pedido(MedioTransporte.MARITIMO));
		e.dispatch(new Pedido(MedioTransporte.AEREO));
	}

}
