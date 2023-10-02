package creacional.builder;

public interface CasaBuilder {

	void reset();
	
	void construirPisos();
	void construirParedes();
	void construirTecho();
	void construirPicina();
	
	Casa getResult();
}
