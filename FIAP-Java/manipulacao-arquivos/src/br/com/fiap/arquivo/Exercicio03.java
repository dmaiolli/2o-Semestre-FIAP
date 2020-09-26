package br.com.fiap.arquivo;

import java.io.*;
import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		
		try {
			FileWriter filewriter = new FileWriter("numeros.txt");
			PrintWriter writer = new PrintWriter(filewriter);
			
			for(int i = 0; i < 100; i++) {
				writer.println(new Random().nextDouble() * 10);
			}
			
			FileReader fileReader = new FileReader("numeros.txt");
			BufferedReader reader = new BufferedReader(fileReader);
			
			
			double maximo =  0.0;
			String linha;
			while ((linha = reader.readLine()) != null) {
				double numero = Double.parseDouble(linha);
				if(numero > maximo) {
					maximo = numero;
				}
			}
			
			System.out.println(maximo);
			
			writer.close();
			filewriter.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
