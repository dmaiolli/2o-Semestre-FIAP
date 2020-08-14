package ArrayList.Exercicios;

import java.util.*;

public class Concessionaria {

	List<Automovel> automoveis = new ArrayList<Automovel>();

	public List<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void adicionaVeiculo(Automovel automovel) {
		this.automoveis.add(automovel);
	}

	public void vendaVeiculo(Automovel automovel) {
		automoveis.remove(automovel);
	}

	public List<Automovel> consultaEstoqueVeiculo() {
		automoveis.sort(
				Comparator.comparing(Automovel::getPreco)
				);
		return getAutomoveis();
	}

	public double somaEstoque() {
		int somaTotal = 0;
		for (Automovel automovel : this.getAutomoveis()) {
			somaTotal += automovel.getPreco();
		}
		return somaTotal;
	}

	public boolean consultaVeiculo(Automovel automovel) {
		if (automoveis.contains(automovel)) {
			return true;
		}
		return false;
	}

	public String controleEstoque(Automovel automovel) {
		int ocorrencias = 0;
		for(Automovel carro : this.getAutomoveis()) {
			if (carro.equals(automovel)) {
				ocorrencias++;
			}
		}
		
		if(ocorrencias == 1) {
			return "Temos " + ocorrencias + " carro do modelo " + automovel.getModelo() + " " + automovel.getMarca() + " no valor de " + automovel.getPreco();
		}
		
		return "Temos " + ocorrencias + " carros do modelo " + automovel.getModelo() + " " + automovel.getMarca() + " no valor de " + automovel.getPreco();
	}
}
