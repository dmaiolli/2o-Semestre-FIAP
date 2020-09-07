package br.com.fiap.pousada;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.pousada.bd.QuartoBD;
import br.com.fiap.pousada.bd.ReservaBD;
import br.com.fiap.pousada.model.Quarto;
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
				case 3:
					cadastrarQuarto(scan);
					break;
				case 4:
					consultaQuarto();
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
		System.out.println("| 2 - Consulta reserva      |");
		System.out.println("| 3 - Cadastrar quarto      |");
		System.out.println("| 4 - Consulta quarto       |");	
		System.out.println("| 0 - Finalizar programa    |");
		System.out.println("|---------------------------|");
	}

	public static void cadastrarQuarto(Scanner scan) {
		System.out.println("|----- Cadastrar Quarto -----|");
		
		System.out.print("Digite a capacidade máxima de pessoas: ");
		Integer qtdeMaxPessoas = scan.nextInt();
		
		System.out.print("Digite o valor da diária: ");
		Double vlDiaria = scan.nextDouble();
		
		Quarto quarto = new Quarto(qtdeMaxPessoas, vlDiaria);
		
		new QuartoBD().SalvaQuarto(quarto);
		System.out.println("|------ Fim do Cadastro ------|");
	}
	
	public static void cadastrarReserva(Scanner scan) {
		System.out.println("|----- Cadastrar Reserva -----|");
		
		Quarto quarto = new Quarto();
		quarto.setNumero(2);
		
		LocalDate dt = LocalDate.now();		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataEntrada = dt.format(dateTimeFormatter);
		LocalDate dtEntrada = LocalDate.parse(dataEntrada, dateTimeFormatter);

		System.out.print("Digite a data de saída: ");
		String date= scan.nextLine();
		LocalDate dtSaida = LocalDate.parse(date, dateTimeFormatter);
		
		System.out.print("Digite a quantidade de pessoas: ");
		Integer qtdePessoas = scan.nextInt();
		scan.nextLine();
		
		Reserva reserva = new Reserva(quarto.getNumero(), dtEntrada, dtSaida, qtdePessoas);
		
		new ReservaBD().SalvaReserva(reserva);
		System.out.println("|------ Fim do Cadastro ------|");
	}

	public static void consultaReserva() {
		System.out.println("|----- Consulta Reserva -----|");
		List<Reserva> reservas = new ReservaBD().consultaReserva();
		System.out.println("Listando as reservas...");
		reservas.forEach(System.out::println);
		System.out.println("|------ Fim do Consulta ------|");
	}
	
	public static void consultaQuarto() {
		System.out.println("|----- Consulta Quarto -----|");
		List<Quarto> quartos = new QuartoBD().consultaQuarto();
		System.out.println("Listando os quartos...");
		quartos.forEach(System.out::println);
		System.out.println("|------ Fim do Consulta ------|");
	}
	
}