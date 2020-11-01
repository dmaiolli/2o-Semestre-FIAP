package br.com.fiap.skilltest.domain;

import java.util.List;

public class Questionario {
	private long id;
	private List <Questoes> questao;
	
	public Questionario() {
	}

	public Questionario(long id, List<Questoes> questao) {
		this.id = id;
		this.questao = questao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Questoes> getQuestao() {
		return questao;
	}
	
	public void setQuestao(List<Questoes> questao) {
		this.questao = questao;
	}

	@Override
	public String toString() {
		return String.format("\tQuestionario #%s\n%s",
				id, questao);
	}
}