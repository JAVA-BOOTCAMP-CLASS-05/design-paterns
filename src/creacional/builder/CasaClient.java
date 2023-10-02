package creacional.builder;

public class CasaClient {

	public static void main(String[] args) {
		Director d = new Director(new CasaBuilderImpl());
		
		Casa casaSimple = d.make(Director.CASA_SIMPLE);
		
		System.out.println(casaSimple);

		Casa casaConPicina = d.make(Director.CASA_CON_PICINA);
		
		System.out.println(casaConPicina);
		
	}

}
