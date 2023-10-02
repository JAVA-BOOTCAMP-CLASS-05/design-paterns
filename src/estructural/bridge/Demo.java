package estructural.bridge;

public class Demo {

	private static void test(Dispositivo d) {
		System.out.println("Testeo con Control Remoto Basico");
		ControlRemotoBasico crb = new ControlRemotoBasico(d);
		crb.power();
		d.printStatus();

		ControlRemotoAvanzado cra = new ControlRemotoAvanzado(d);
		cra.power();
		cra.mute();
		d.printStatus();
	
	}
	
	public static void main(String[] args) {
		test(new Televisor());
		test(new Radio());		
	}

}
