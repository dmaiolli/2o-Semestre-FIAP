package br.com.fiap.skilltest.domain;

import java.time.LocalDate;

public class FuncCargo {
	private Funcionario funcionario;
	private Cargo cargo;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	
	public FuncCargo() {
		super();
	}

	public FuncCargo(Funcionario funcionario, Cargo cargo, LocalDate dataEntrada, LocalDate dataSaida) {
		super();
		this.funcionario = funcionario;
		this.cargo = cargo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	@Override
	public String toString() {
		return String.format("#%s \n%s, \n\tData de entrada: %s, \n\tData de saida: %s}\n",
				funcionario, cargo, dataEntrada, dataSaida);
	}

}
