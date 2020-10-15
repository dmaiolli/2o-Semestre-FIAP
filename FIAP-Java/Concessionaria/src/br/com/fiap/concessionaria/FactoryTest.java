package br.com.fiap.concessionaria;

import java.util.Scanner;

import br.com.fiap.concessionaria.factory.ConcessionariaFactory;

public class FactoryTest {
	public static void main(String[] args) {
		
		ConcessionariaFactory concessionariaFactory = new ConcessionariaFactory();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Qual tipo de carro você tem interesse?");
	    String tipo = scan.next().toUpperCase();
	    
		concessionariaFactory.create(tipo);
	    scan.close(); 
	}
}
