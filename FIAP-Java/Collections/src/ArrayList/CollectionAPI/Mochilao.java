package ArrayList.CollectionAPI;

import java.util.*;

public class Mochilao {

	protected String nome;
	protected String viajante;
	protected List<Destino> destinos = new LinkedList<Destino>();
	
	public Mochilao(String nome, String viajante) {
		this.nome = nome;
		this.viajante = viajante;
	}

	public String getNome() {
		return nome;
	}

	public String getViajante() {
		return viajante;
	}

	public List<Destino> getDestinos() {
		return Collections.unmodifiableList(destinos);
	}

	public void adiciona(Destino destino) {
		this.destinos.add(destino);
	}
	
//	public int getDistanciaTotal() {
//		int distanciaTotal = 0;
//		for(Destino d : this.getDestinos()) {
//			distanciaTotal += d.getDistancia();
//		}
//		return distanciaTotal;
//	}^
	
	// Are the same ^^
	
	public int getDistanciaTotal() {
		return this.getDestinos().stream()
			.mapToInt(Destino::getDistancia)
			.sum();
	}
	
	@Override
	public String toString() {
		return "Viagem para: " + this.getNome() + ", feita por: " + this.getViajante() + ", com destinos em: " + this.getDestinos();
	}
}


