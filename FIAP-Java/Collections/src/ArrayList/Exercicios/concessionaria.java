package ArrayList.Exercicios;

import java.util.*;

public class Concessionaria {

	List<Automovel> automoveis;
	
	public Concessionaria() {
		this.automoveis = new ArrayList<>();
	}

	public List<Automovel> getAutomoveis() {
		return automoveis;
	}

	public void adicionaVeiculo(Automovel automovel) {
		this.automoveis.add(automovel);
	}

	public void vendaVeiculo(Automovel automovel) {
		this.automoveis.remove(automovel);
	}

	public List<Automovel> consultaEstoqueVeiculo() {
		automoveis.sort(
				Comparator.comparing(Automovel::getPreco)
				
				);
		return this.automoveis;
	}

	public double somaEstoque() {
		return automoveis.stream().mapToDouble(veiculo -> veiculo.getPreco()).sum();
		
//		int somaTotal = 0;
//		for (Automovel automovel : this.getAutomoveis()) {
//			somaTotal += automovel.getPreco();
//		}
//		return somaTotal;
	}

	public boolean consultaVeiculo(Automovel automovel) {
		return automoveis.stream().filter(automovel::equals).count() == 1;
//		if (automoveis.contains(automovel)) {
//			return true;
//		}
//		return false;
	}

	public String controleEstoque(Automovel automovel) {
		int ocorrencias = 0;
		for(Automovel carro : this.getAutomoveis()) {
			if (carro.equals(automovel)) {
				ocorrencias++;
			}
		}
		
		if(ocorrencias == 1) {
			return String.format("Temos %d ocorrência do carro %s %s no valor de %.2f", ocorrencias, automovel.getMarca(), automovel.getModelo(), automovel.getPreco());
		}
		
		return String.format("Temos %d ocorrências do carro %s %s no valor de %.2f", ocorrencias, automovel.getMarca(), automovel.getModelo(), automovel.getPreco());
	}
}
