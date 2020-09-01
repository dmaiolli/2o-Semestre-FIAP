package br.com.fiap.pousada;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.pousada.bd.PousadaBD;
import br.com.fiap.pousada.model.Reserva;

public class Principal {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

			int opcao = 0;
			do {
				menu();

				System.out.print("> ");
				opcao = scan.nextInt();
				scan.nextLine();

				switch (opcao) {
				case 1:
					cadastrarReserva(scan);
					break;
				case 2:
					consultaReserva();
					break;
				}

				System.out.println("\n\n");
			} while (opcao != 0);

			System.out.println("Sistema finalizado com sucesso");
		}
	}

	public static void menu() {
		System.out.println("|---------------------------|");
		System.out.println("|     Pousada QuarenT.I     |");
		System.out.println("|                           |");
		System.out.println("| Digite a opção desejada:  |");
		System.out.println("| 1 - Cadastrar reserva     |");
		System.out.println("| 2 - Consultar reserva     |");
		System.out.println("|---------------------------|");
	}

	public static void cadastrarReserva(Scanner scan) {
//		System.out.println("|----- Cadastro da Reserva -----|");
//		
//		LocalDate dt = LocalDate.now();		
//		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String dataEntrada = dt.format(format);
//		LocalDate dtEntrada = LocalDate.parse(dataEntrada); 
//
//		System.out.print("Digite a data de saída: ");
//		String date= scan.nextLine();
//		LocalDate dtSaida=LocalDate.parse(date); 
//		
//		System.out.print("Digite a quantidade de pessoas: ");
//		Integer qtdePessoas = scan.nextInt();
//		scan.nextLine();
//		
//		Reserva reserva = new Reserva(dtEntrada, dtSaida, qtdePessoas);
//		
//		System.out.println("|------ Fim do Cadastro ------|");
		new PousadaBD().SalvaReserva();

	}

	public static void consultaReserva() {
		System.out.println("|----- Consulta Reserva -----|");
		List<Reserva> reservas = new PousadaBD().consultaReserva();
		System.out.println("Listando as reservas...");
		reservas.forEach(System.out::println);
		System.out.println("|------ Fim do Consulta ------|");


	}

}