package br.com.fiap.pousada.model;

import java.time.LocalDate;

public class Reserva {
	private Integer id;
	private Quarto quarto;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private Integer qtdePessoas;
	
	public Reserva(LocalDate dataEntrada, LocalDate dataSaida, int qtdePessoas) {
		this.dataEntrada = dataEntrada;
		
		if(dataEntrada == dataSaida) {
			System.err.println("Data inválida");			
		} else if (dataEntrada.plusDays(1) == dataSaida) {
			System.err.println("Data inválida");
		} else {
			this.dataSaida = dataSaida;
		}
		
		if (qtdePessoas > Quarto.getMaxPessoas()) {
			System.err.println("Acima da capacidade do quarto");
		} else {
			this.qtdePessoas = qtdePessoas;
		}
	}
	
	public Reserva(Integer id, Quarto quarto, LocalDate dataEntrada, LocalDate dataSaida, int qtdePessoas) {
		this(dataEntrada, dataSaida, qtdePessoas);
		this.id = id;
		this.quarto = quarto;
	}


	public int getId() {
		return id;
	}
	
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	
	public int getQtdePessoas() {
		return qtdePessoas;
	}
	
	public Quarto getQuarto() {
		return quarto;
	}
	

}

