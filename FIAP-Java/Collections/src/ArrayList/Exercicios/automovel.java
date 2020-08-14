package ArrayList.Exercicios;

public class Automovel {

	private String Marca;
	private String Modelo;
	private double Preco;
	
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
		return "O carro da marca: " + this.Marca + ", modelo: " + this.Modelo + ", avaliado no valor de: " + this.getPreco() + "\n";
	}
	
}
