package ArrayList.CollectionAPI;

import java.util.*;

public class TesteDestino {

	public static void main(String[] args) {
		
		ArrayList<Destino> destinos = new ArrayList<>();
		destinos.add(new Destino("Dubai", 12209));
		destinos.add(new Destino("Angkor", 17501));
		
		destinos.forEach(System.out::println);
		// The same ^^
		destinos.forEach(destino -> System.out.println("\n" + destino));
		
		System.out.println("--------------------");
		
		Collections.sort(destinos); // Sort by alphabet - compareTo in class "Destino"
		System.out.println(destinos);

		System.out.println("--------------------");
		
		destinos.sort(
				Comparator.comparing(Destino::getDistancia)
				);
		
		System.out.println(destinos); // Sort by distance
	}
}
