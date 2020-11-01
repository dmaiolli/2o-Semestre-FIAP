package br.com.fiap.skilltest.domain;

import java.time.LocalDate;

public class Funcionario {
	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private String email;
	private Long cpf;
	private String tipo;
	
	public Funcionario() {
	}

	public Funcionario(String nome, LocalDate dataNascimento, String email, Long cpf, String tipo) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.cpf = cpf;
		this.tipo = tipo;
	}

	public Funcionario(Long id, String nome, LocalDate dataNascimento, String email, Long cpf, String tipo) {
		this(nome, dataNascimento, email, cpf, tipo);
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public Long getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return String.format("\tFuncionario #%s -> {\n\tNome: %s, \n\tCPF: %s, \n\tE-mail: %s",
				id, nome, cpf, email);
	}
}