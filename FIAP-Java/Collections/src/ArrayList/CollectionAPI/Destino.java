package ArrayList.CollectionAPI;

public class Destino implements Comparable<Destino>{
	
	protected String lugar;
	protected int distancia;
	
	public Destino(String lugar, int distancia) {
		this.lugar = lugar;
		this.distancia = distancia;
	}

	public String getLugar() {
		return lugar;
	}

	public int getDistancia() {
		return distancia;
	}

	@Override
	public String toString() {
		return "Destino: " + this.lugar + ", distancia de " + this.distancia + "km";
	}
	
	@Override
	public int compareTo(Destino outroDestino) {
		return this.lugar.compareTo(outroDestino.lugar);
	}
}
