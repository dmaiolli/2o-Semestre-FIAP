package br.com.fiap.bean;

public class Locacao {
	private String nomeCliente;
	private String dataLocacao;
	private String tipoVeiculo;
	private Integer quantidadeDiarias;
	private Double totalPagar;
	
	public Locacao() {
	}

	public Locacao(String nomeCliente, String dataLocacao, String tipoVeiculo, Integer quantidadeDiarias,
			Double totalPagar) {
		super();
		this.nomeCliente = nomeCliente;
		this.dataLocacao = dataLocacao;
		this.tipoVeiculo = tipoVeiculo;
		this.quantidadeDiarias = quantidadeDiarias;
		this.totalPagar = totalPagar;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public Integer getQuantidadeDiarias() {
		return quantidadeDiarias;
	}

	public void setQuantidadeDiarias(Integer quantidadeDiarias) {
		this.quantidadeDiarias = quantidadeDiarias;
	}

	public Double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(Double totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	public static double calculaPagar(Integer quantidadeDiarias, String tipo) {
		int vlDiaria;
		if(tipo.equals("1")) {
			vlDiaria = 100;
		} else if (tipo.equals("2")) {
			vlDiaria = 200;
		}else {
			vlDiaria = 300;
		}
		double totalPagar = quantidadeDiarias * vlDiaria;
		
		return totalPagar;
	}
	
}
