package ArrayList.Exercicios;

import java.util.Objects;

public class Automovel {

	private String Marca;
	private String Modelo;
	private Double Preco;
	
	public Automovel(String marca, String modelo, double preco) {
		Marca = marca;
		Modelo = modelo;
		Preco = preco;
	}

	public String getMarca() {
		return Marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public double getPreco() {
		return Preco;
	}
	
	@Override
	public String toString() {
		return String.format("Automovel{marca = %s, modelo = %s, preço = %.2fR$}", Marca, Modelo, Preco);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Automovel) {
			Automovel auto = (Automovel) o;
			return this.Marca.equals(auto.getMarca()) && this.Modelo.equals(auto.getModelo()) && this.Preco.equals(auto.getPreco());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Marca, Modelo, Preco);
	}
}
