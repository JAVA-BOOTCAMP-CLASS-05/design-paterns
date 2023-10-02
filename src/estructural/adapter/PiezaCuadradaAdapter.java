package estructural.adapter;

public class PiezaCuadradaAdapter extends PiezaRedonda {
	private PiezaCuadrada piezaCuadrada;
	
	public PiezaCuadradaAdapter(PiezaCuadrada pc) {
		this.setPiezaCuadrada(pc);
	}

	public PiezaCuadrada getPiezaCuadrada() {
		return piezaCuadrada;
	}

	public void setPiezaCuadrada(PiezaCuadrada piezaCuadrada) {
		this.piezaCuadrada = piezaCuadrada;
	}

    @Override
    public double getRadio() {
        return (Math.sqrt(Math.pow((this.getPiezaCuadrada().getAncho() / 2), 2) * 2));
    }
	

}
