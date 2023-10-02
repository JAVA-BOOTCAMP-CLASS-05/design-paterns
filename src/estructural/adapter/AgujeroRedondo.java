package estructural.adapter;

public class AgujeroRedondo {
	
	private double radio;
	
	public AgujeroRedondo(double r) {
		this.setRadio(r);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public boolean encaja(PiezaRedonda pr) {
		return this.getRadio() >= pr.getRadio();
	}
}
