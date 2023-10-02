package creacional.factoryMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Empresa2 {
	
	private final Map<MedioTransporte, Supplier<Logistica>> logisticas = new HashMap<>();

	{
		logisticas.put(MedioTransporte.AEREO, LogisticaAerea::new);
		logisticas.put(MedioTransporte.MARITIMO, LogisticaMaritima::new);
		logisticas.put(MedioTransporte.TERRESTRE, LogisticaTerrestre::new);
	}
	
	public void dispatch(Pedido p) {
		logisticas.get(p.getMedioTransporte()).get().ejecutarPlanDelivery();
	}
	
	public static void main(String[] args) {
		Empresa2 e = new Empresa2();
		
		e.dispatch(new Pedido(MedioTransporte.MARITIMO));
		e.dispatch(new Pedido(MedioTransporte.AEREO));

	}

}
