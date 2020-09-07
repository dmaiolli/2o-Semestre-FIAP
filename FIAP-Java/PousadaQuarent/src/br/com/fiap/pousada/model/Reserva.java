package br.com.fiap.pousada.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
	private Integer id;
	private Integer quarto;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private Integer qtdePessoas;
	
	public Reserva(Integer quarto, LocalDate dataEntrada, LocalDate dataSaida, int qtdePessoas) {
		this.quarto = quarto;
		this.dataEntrada = dataEntrada;
		
		if(dataEntrada == dataSaida) {
			System.err.println("Data inválida");			
		} else if (dataEntrada.plusDays(1) == dataSaida) {
			System.err.println("Data inválida");
		} else {
			this.dataSaida = dataSaida;
		}
		
		this.qtdePessoas = qtdePessoas;
	}
	
	public Reserva(Integer quarto, Integer id, LocalDate dataEntrada, LocalDate dataSaida, int qtdePessoas) {
		this(quarto, dataEntrada, dataSaida, qtdePessoas);
		this.id = id;
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
	
	public Integer getQuarto() {
		return quarto;
	}
	
	public double calculaRecibo(LocalDate dataEntrada, LocalDate dataSaida, double vlDiaria) {
		long dias = ChronoUnit.DAYS.between(dataEntrada, dataSaida);
		return dias * vlDiaria;
	}
	
	@Override
	public String toString() {
		return String.format("Reserva: {id: %s, Número quarto: %s, Data entrada: %s, Data saída: %s, Qtde pessoas %s}", 
				id, quarto, dataEntrada, dataSaida, qtdePessoas);
	}

}

