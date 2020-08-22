package br.com.fiap.escola;

import java.util.List;
import java.util.Scanner;

import br.com.fiap.escola.db.AlunoDB;
import br.com.fiap.escola.model.Aluno;

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
						cadastrarAluno(scan);
						break;
					case 2:
						consultarTurma(scan);
						break;
					case 3:
						consultaAtivos();
						break;
					case 4:
						ativaDesativaAluno();
						break;
					case 5:
						excluiAluno();
						break;
				}

				System.out.println("\n\n");
			} while (opcao != 0);
			
			System.out.println("Sistema finalizado com sucesso");
		}
	}

	private static void excluiAluno() {
		// TODO Auto-generated method stub
		
	}

	private static void ativaDesativaAluno() {
		// TODO Auto-generated method stub
		
	}

	private static void consultaAtivos() {
		// TODO Auto-generated method stub
		
	}

	private static void menu() {
		System.out.println("|---------------------------|");
		System.out.println("|        ESCOLA D.O.S       |");
		System.out.println("|                           |");
		System.out.println("| Digite a opção desejada:  |");
		System.out.println("| 1 - Cadastrar aluno       |");
		System.out.println("| 2 - Consultar turma       |");
		System.out.println("| 3 - Consultar ativos      |");
		System.out.println("| 4 - Ativar/desativar aluno|");
		System.out.println("| 5 - Excluir aluno         |");
		System.out.println("| 0 - Sair do sistema       |");
		System.out.println("|---------------------------|");
	}

	private static void cadastrarAluno(Scanner scan) {
		System.out.println("|-----Cadastro do aluno------|");
		
		System.out.print("| Digite o RM do aluno:      |");
		int rm = scan.nextInt();
		scan.nextLine();
		
		System.out.print("| Digite o nome do aluno:    |");
		String nome = scan.nextLine();
		
		System.out.print("| Digite a nota 1 do aluno:  |");
		double nota1 = scan.nextDouble();
		scan.nextLine();
		
		System.out.print("| Digite a nota 2 do aluno:  |");
		double nota2 = scan.nextDouble();
		scan.nextLine();
		
		Aluno aluno = new Aluno(rm, nome);
		aluno.setAtivo(true);
		aluno.setNota1(nota1);
		aluno.setNota2(nota2);
		System.out.println(aluno);
		
		new AlunoDB().salva(aluno);
		System.out.println("|------Fim do Cadastro------|");
	}
	
	private static void consultarTurma(Scanner scan) {
		System.out.println("|-----Consulta da Turma-----|");
		List<Aluno> alunos = new AlunoDB().consultaTodos();
		System.out.println("| Listando os alunos...     |");
		alunos.forEach(System.out::println);
		System.out.println("|---------------------------|");
	}

}
