package br.com.fiap.pousada;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {

			int opcao = 0;
			do {
				menu();

				System.out.print("> ");
				opcao = scan.nextInt();
				scan.nextLine();
				
				switch(opcao) {
					case 1:
						cadastraReserva(scan);
						break;
					case 2:
						ConsultaReserva(scan);
						break;
				}

				System.out.println("\n\n");
			} while (opcao != 0);
			
			System.out.println("Sistema finalizado com sucesso");
		}
	}
	
	public void menu() {
		System.out.println("|---------------------------|");
		System.out.println("|     Pousada QuarenT.I     |");
		System.out.println("|                           |");
		System.out.println("| Digite a opção desejada:  |");
		System.out.println("| 1 - Cadastrar reserva     |");
		System.out.println("| 2 - Consultar reserva     |");
		System.out.println("|---------------------------|");
	}
	
	public void criaQuarto() {
	}
	
	public void cadastraReserva(Scanner scan) {
	}
	
	public void consultaReserva(Scanner scan) {
		
	}

}
