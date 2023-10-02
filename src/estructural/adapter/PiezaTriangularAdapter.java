package estructural.adapter;

public class PiezaTriangularAdapter extends PiezaRedonda {
	private PiezaTriangular piezaTriangular;
	
	public PiezaTriangular getPiezaTriangular() {
		return piezaTriangular;
	}

	public void setPiezaTriangular(PiezaTriangular piezaTriangular) {
		this.piezaTriangular = piezaTriangular;
	}

	public PiezaTriangularAdapter(PiezaTriangular pt) {
		this.setPiezaTriangular(pt);
	}

    @Override
    public double getRadio() {
        double result = (Math.sqrt(Math.pow((this.getPiezaTriangular().getAncho() / 2), 2) + Math.pow((this.getPiezaTriangular().getAlto() / 2), 2)));
        return result;
    }
	

}
