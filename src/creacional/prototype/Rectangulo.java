package creacional.prototype;

public class Rectangulo extends Figura {

	public int ancho;
	public int alto;

    public Rectangulo(int x, int y, int ancho, int alto, String color) {
        super(x, y, color);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(Rectangulo target) {
        super(target);
        if (target != null) {
            this.ancho = target.ancho;
            this.alto = target.alto;
        }
    }	
    
	@Override
	public Figura clone() {
		return new Rectangulo(this);
	}

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangulo)
            return this.equals((Rectangulo) obj);

        return super.equals(obj);
    }

    public boolean equals(Rectangulo rec) {
        return rec.ancho == ancho && rec.alto == alto;
    }

    @Override
    public String toString() {
        return "Rectangulo [" + x + ", " + y +  ", " + ancho + ", " + alto  + ", " + color + "]";
    }
}
