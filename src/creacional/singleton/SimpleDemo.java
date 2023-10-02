package creacional.singleton;

public class SimpleDemo {

	public static void main(String[] args) {
		SimpleSingleton s1 = SimpleSingleton.getInstance();
		
		s1.setValue("Hola");
		
		SimpleSingleton s2 = SimpleSingleton.getInstance();
		
		System.out.println(s2.getValue());
		
		System.out.println(s1.equals(s2));
	}

}
