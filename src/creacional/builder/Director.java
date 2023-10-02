package creacional.builder;

public class Director {

	public static final int CASA_SIMPLE = 1;

	public static final int CASA_CON_PICINA = 2;
	
	private CasaBuilder builder;
	
	public Director(CasaBuilder cb) {
		this.setBuilder(cb);
	}

	public void setBuilder(CasaBuilder builder) {
		this.builder = builder;
	}
	
	public Casa make(int type) {
		
		builder.reset();
		
		if (type == CASA_SIMPLE) {
			builder.construirPisos();
			builder.construirParedes();
			builder.construirTecho();
		} else if (type == CASA_CON_PICINA) {
			builder.construirPisos();
			builder.construirParedes();
			builder.construirTecho();
			builder.construirPicina();
		} 
		
		return builder.getResult();

	}
}