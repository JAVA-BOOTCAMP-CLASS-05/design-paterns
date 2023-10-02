package creacional.builder;

public class Casa {
	
	private boolean piso = Boolean.FALSE;
	private boolean pared = Boolean.FALSE;
	private boolean techo = Boolean.FALSE;
	private boolean picina = Boolean.FALSE;
	
	public boolean isPiso() {
		return piso;
	}
	
	public void setPiso(boolean piso) {
		this.piso = piso;
		
		if (this.isPiso()) {
			System.out.println("Piso construido!");
		}
	}
	
	public boolean isPared() {
		return pared;
	}
	
	public void setPared(boolean pared) {
		this.pared = pared;

		if (this.isPared()) {
			System.out.println("Pared construida!");
		}
	}
	
	public boolean isTecho() {
		return techo;
	}
	
	public void setTecho(boolean techo) {
		this.techo = techo;
	
		if (this.isTecho()) {
			System.out.println("Techo construido!");
		}
	}
	
	public boolean isPicina() {
		return picina;
	}

	public void setPicina(boolean picina) {
		this.picina = picina;

		if (this.isPicina()) {
			System.out.println("Picina construida!");
		}
	}

	public String toString() {
		return "[CASA {piso: " +
				this.isPiso() +
				", pared: " +
				this.isPared() +
				", techo: " +
				this.isTecho() +
				", picina: " +
				this.isPicina() +
				"}]";
	}
	
	

}
