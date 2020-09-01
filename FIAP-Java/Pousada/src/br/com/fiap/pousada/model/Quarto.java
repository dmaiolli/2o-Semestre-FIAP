package br.com.fiap.pousada.model;

public class Quarto {
	private Integer numero;
	private Categoria categoria;
	private static Integer maxPessoas;
	private Double valorDiaria;
	
	public Quarto(Integer numero, Integer maxPessoas, Double valorDiaria) {
		
		if (numero % 2 == 1 || numero > 30) {
			System.err.println("Apartamento inexistente");
		} else {
			this.numero = numero;
		};
		
		Quarto.maxPessoas = maxPessoas;
		this.valorDiaria = valorDiaria;
	}
	

	public Quarto(Categoria categoria, Integer numero,  Integer maxPessoas, Double valorDiaria) {
		this(numero, maxPessoas, valorDiaria);
		
		if (numero <= 20) {
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

	public Categoria getCategoria() {
		return categoria;
	}

	public static Integer getMaxPessoas() {
		return maxPessoas;
	}

}
