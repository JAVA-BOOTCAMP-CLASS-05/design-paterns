package estructural.adapter;

public class PiezaRedonda {
	
	private double radio;
	
	public PiezaRedonda() {}
	
	public PiezaRedonda(double r) {
		this.setRadio(r);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}
