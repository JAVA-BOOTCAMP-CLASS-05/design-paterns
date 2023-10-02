package creacional.prototype;

import java.util.List;

public class Demo {
	
	public static List<Figura> clone(List<Figura> figuras) {
		return figuras.stream()
				.map(Figura::clone)
				.toList();
	}
	
	public static void compareOriginalAndClone(List<Figura> original, List<Figura> copia) {
		for (int i = 0; i < original.size(); i++) {
			Figura fOriginal = original.get(i);
			for (int j = 0; j < copia.size(); j++) {
				Figura fCopia = copia.get(j);
				System.out.println("-------------------------------------------------------");
				System.out.println("Comparando -> " + fOriginal + " - " + fCopia);
				if (fOriginal != fCopia) {
					System.out.println(i + " - Son objetos distintos");

					if (fOriginal.equals(fCopia)) {
						System.out.println(i + " - Su contenido es identico");
					} else {
						System.out.println(i + " - Su contenido es diferente");
					}
				} else {
					System.out.println(i + " - Son objetos iguales");
				}
				System.out.println("-------------------------------------------------------");
			}
		}
	}

	public static void main(String[] args) {

		List<Figura> figuras = List.of(new Circulo(10, 20, 15, "rojo"),
										new Rectangulo(30, 40, 100, 50, "azul"),
										new Circulo(30, 40, 20, "azul"),
										new Rectangulo(10, 20, 100, 50, "rojo")
		);

		List<Figura> copias = clone(figuras);
		
		compareOriginalAndClone(figuras, copias);
		
	}

}
