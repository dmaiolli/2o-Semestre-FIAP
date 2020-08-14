package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ListTest {

	public static void main(String[] args) {
		// int[] numeros = new int[10];
		// numeros[0] = 1;

		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);

		System.out.println(numeros);

		numeros.remove(1);
		System.out.println("--------------------");
		System.out.println(numeros);

		// at� o Java 10
		numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// a partir do Java 11
		numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("--------------------");

		// Imperativa
		// for tradicional 
		for (int i = 0; i < numeros.size(); i++) {
			System.out.printf("%d ", numeros.get(i));
		}
		System.out.println();
		System.out.println("--------------------");

		// for each --> for numero in numeros (PYTHON)
		for (Integer numero : numeros) {
			System.out.printf("%d ", numero);
		}
		System.out.println();
		System.out.println("--------------------");

		// A PARTIR DO JAVA 8 - Declarativa
		ShowNumbers exibe = new ShowNumbers();
		numeros.forEach(exibe);
		System.out.println();
		System.out.println("--------------------");

		// Classe Anonima
		Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer numero) {
				System.out.printf("%d ", numero);
			}
		};
		numeros.forEach(consumer);
		System.out.println();
		System.out.println("--------------------");

		numeros.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer numero) {
				System.out.printf("%d ", numero);
			}
		});
		System.out.println();
		System.out.println("--------------------");

		// Express�o Lambda
		numeros.forEach((Integer numero) -> {
			System.out.printf("%d ", numero);
		});
		System.out.println();
		System.out.println("--------------------");

		numeros.forEach((numero) -> {
			System.out.printf("%d ", numero);
		});
		System.out.println();
		System.out.println("--------------------");
		
		numeros.forEach(numero -> {
			System.out.printf("%d ", numero);
		});
		System.out.println();
		System.out.println("--------------------");
		
		numeros.forEach(numero -> System.out.printf("%d ", numero));
		System.out.println();
		System.out.println("--------------------");
		
		// Method Reference
		numeros.forEach(System.out::println);
		System.out.println("--------------------");

		// Method sort
		List<String> nomes = Arrays.asList("Denys", "Domingas", "Dilson");
		nomes.forEach(name -> System.out.println(name));
		
		Collections.sort(nomes);
		System.out.println(nomes);
		
		ArrayList<Integer> sort = new ArrayList<Integer>();
		sort.add(1);
		sort.add(3);
		sort.add(5);
		sort.add(2);
		sort.add(1);
		
		Collections.sort(sort);
		System.out.println(sort);
	}

}