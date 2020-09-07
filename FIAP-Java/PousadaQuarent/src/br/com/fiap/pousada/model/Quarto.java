package br.com.fiap.pousada.model;

public class Quarto {
	private Integer numero;
	private Categoria categoria;
	private Integer maxPessoas;
	private Double valorDiaria;
	
	public Quarto() {
		
	}
	
	public Quarto(Integer maxPessoas, Double valorDiaria) {
		this.maxPessoas = maxPessoas;
		this.valorDiaria = valorDiaria;
	}
	
	public Quarto(Integer numero, Integer maxPessoas, Double valorDiaria) {
		this(maxPessoas, valorDiaria);
		if (numero % 2 == 1 || numero > 30) {
			System.err.println("Quarto inexistente");
		} else {
			this.numero = numero;
		};
	}
	
	public Quarto(Integer numero, Integer maxPessoas, Double valorDiaria, Categoria categoria) {
		this(numero, maxPessoas, valorDiaria);
		if (numero <= 10) {
			this.categoria = Categoria.APARTAMENTO;
		} else {
			this.categoria = Categoria.VIP;
		}
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

	public void setNumero(Integer numero) {
		if (numero % 2 == 1 || numero > 30) {
			System.err.println("Quarto inexistente");
		} else {
			this.numero = numero;
		};
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public Integer getMaxPessoas() {
		return maxPessoas;
	}
	
	@Override
	public String toString() {
		return String.format("Quarto: {Número quarto: %s, Capacidade quarto: %s, Valor diária: %s}", 
				numero, maxPessoas, valorDiaria);
	}

}
