package ArrayList.Exercicios;

public class automovel extends concessionaria{

	String marca;
	String modelo;
	double Preco;
	
	public automovel(String marca, String modelo, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		Preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}
	
	
	
}
