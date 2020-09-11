package src.br.com.fiap.transferencia;

import java.util.Scanner;

import src.br.com.fiap.transferencia.bd.UsuarioBD;
import src.br.com.fiap.transferencia.model.Conta;

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
					cadastraConta(scan);
					break;
				case 2:
					break;
				}
			} while (opcao != 0);
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
	
	public static void cadastraConta(Scanner scan) {
		Integer saldo = scan.nextInt();
		
		Conta conta = new Conta(saldo);
		
		new UsuarioBD().criaConta(conta);
	}
}