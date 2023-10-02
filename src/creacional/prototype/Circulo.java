package creacional.prototype;

public class Circulo extends Figura {

	public int radio;

    public Circulo(int x, int y, int radio, String color) {
        super(x, y, color);
        this.radio = radio;
    }

    public Circulo(Circulo target) {
        super(target);
        if (target != null) {
            this.radio = target.radio;
        }
    }	
    
	@Override
	public Figura clone() {
		return new Circulo(this);
	}

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circulo)
        	return this.equals((Circulo) obj);

        return super.equals(obj);
    }

    public boolean equals(Circulo circulo) {
        return circulo.radio == radio;
    }

    @Override
    public String toString() {
        return "Circulo [" + x + ", " + y +  ", " + radio + ", " + color + "]";
    }
}
