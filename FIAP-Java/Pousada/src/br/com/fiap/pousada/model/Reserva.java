package br.com.fiap.pousada.model;

import java.time.LocalDate;

public class Reserva {
	private Integer id;
	private String cliente;
	private Quarto quarto;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private Integer qtdePessoas;
	
	public Reserva(Integer id, String cliente, Quarto quarto, LocalDate dataEntrada, LocalDate dataSaida, int qtdePessoas) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.quarto = quarto;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.qtdePessoas = qtdePessoas;
	}

	public String getCliente() {
		return cliente;
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

