package br.com.fiap.pousada.model;

public class Quarto {
	private Integer numero;
	private Categoria categoria;
	private Integer maxPessoas;
	private Double valorDiaria;
	
	public Quarto(Integer numero, Categoria categoria, Integer maxPessoas, Double valorDiaria) {
		super();
		this.numero = numero;
		this.categoria = categoria;
		this.maxPessoas = maxPessoas;
		this.valorDiaria = valorDiaria;
	}

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Integer getNumero() {
		return numero;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public Integer getMaxPessoas() {
		return maxPessoas;
	}
	
	
	
}
