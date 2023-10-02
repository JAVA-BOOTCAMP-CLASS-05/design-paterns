package creacional.builder;

public class CasaBuilderImpl implements CasaBuilder {

	private Casa casa = null;
	
	@Override
	public void reset() {
		casa = new Casa();
	}

	@Override
	public void construirPisos() {
		casa.setPiso(Boolean.TRUE);
	}

	@Override
	public void construirParedes() {
		casa.setPared(Boolean.TRUE);
	}

	@Override
	public void construirTecho() {
		casa.setTecho(Boolean.TRUE);
	}

	@Override
	public void construirPicina() {
		casa.setPicina(Boolean.TRUE);
	}

	@Override
	public Casa getResult() {
		return casa;
	}

}
