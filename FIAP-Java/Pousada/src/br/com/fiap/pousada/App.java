package br.com.fiap.pousada;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import br.com.fiap.pousada.dao.QuartoDAO;
import br.com.fiap.pousada.domain.Categoria;
import br.com.fiap.pousada.domain.Pousada;
import br.com.fiap.pousada.domain.Quarto;
import br.com.fiap.pousada.domain.Reserva;
import br.com.fiap.pousada.exception.ReservaException;
import br.com.fiap.pousada.helper.DateHelper;

public class App {

	public static void main(String[] args) {
		Pousada pousada = new Pousada();

		try (Scanner scan = new Scanner(System.in)) {
			pousada.atualiza();
			int opcao = 0;
			do {
				menu();
				System.out.print("> ");
				opcao = scan.nextInt();

				switch (opcao) {
					case 1 -> cadastraQuarto(scan);
					case 2 -> cadastraReserva(scan, pousada);
					case 3 -> consultaQuartos();
					case 4 -> consultaReservas(pousada);
				}

				System.out.println("\n\n");
			} while (opcao != 0);

			System.out.println("#--- Programa finalizado com sucesso ---#");

		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());
		}

	}

	private static void consultaReservas(Pousada pousada) {
		System.out.println("\n#---> Consulta Reservas\n");
		pousada.consultaReservas().forEach(System.out::println);
		System.out.println("\nConsulta finalizada com sucesso #---> ");
	}

	private static void cadastraReserva(Scanner scan, Pousada pousada) {
		System.out.println("\n#---> Cadastro de Reserva");

		System.out.print("\nInforme o n�mero do quarto: > ");
		Integer numero = scan.nextInt();
		scan.nextLine();
		
		System.out.print("\nInforme a data de chegada: > ");
		LocalDate dataEntrada = DateHelper.toDate(scan.nextLine());
		
		System.out.print("\nInforme a data de saida: > ");
		LocalDate dataSaida = DateHelper.toDate(scan.nextLine());
		
		System.out.print("\nInforme a quantidade de pessoas: > ");
		Integer qtdePessoas = scan.nextInt();
		
		try {
			
			Quarto quarto = new QuartoDAO().consultaPorNumero(numero);
			
			if(quarto == null) {
				System.err.println("\nO quarto informado n�o existe no cadastro.");
				return;
			}
			
			Reserva reserva = new Reserva(quarto, dataEntrada, dataSaida, qtdePessoas);
			pousada.efetuaReserva(reserva);

		} catch (ClassNotFoundException | SQLException | ReservaException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("\nReserva realizada com sucesso #---> ");

	}

	private static void consultaQuartos() {
		System.out.println("\n#---> Consulta Quartos\n");

		try {
			List<Quarto> quartos = new QuartoDAO().consultaTodos();
			quartos.forEach(System.out::println);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("\nConsulta finalizada com sucesso #---> ");
	}

	private static void cadastraQuarto(Scanner scan) {
		System.out.println("\n#---> Cadastro de Quarto");

		System.out.print("\nInforme o n�mero do quarto: > ");
		Integer numero = scan.nextInt();

		System.out.println("\nInforme a cartegoria do quarto.");
		System.out.print("Digite: 1 - VIP | 2 - Apartamento > ");
		Categoria categoria = scan.nextInt() == 1 ? Categoria.VIP : Categoria.APARTAMENTO;

		System.out.print("\nInforme a capacidade m�xima do quarto: > ");
		Integer maxPessoas = scan.nextInt();

		System.out.print("\nInforme o valor da di�ria do quarto: > ");
		Double valorDiaria = scan.nextDouble();

		Quarto quarto = new Quarto(numero, categoria, maxPessoas, valorDiaria);

		try {
			new QuartoDAO().salva(quarto);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("\nQuarto cadastrado com sucesso #---> ");
	}

	private static void menu() {
		System.out.println("|-----------------------------|");
		System.out.println("|          POUSADA            |");
		System.out.println("|                             |");
		System.out.println("| Digite a op��o desejada:    |");
		System.out.println("| 1 - Cadastrar quarto        |");
		System.out.println("| 2 - Cadastrar reserva       |");
		System.out.println("| 3 - Consultar quartos       |");
		System.out.println("| 4 - Consultar reservas      |");
		System.out.println("| 0 - Sair do sistema         |");
		System.out.println("|-----------------------------|");
	}

}
