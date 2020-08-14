package ArrayList.Exercicios;

public class TesteConcessionaria {

	public static void main(String[] args) {
		Concessionaria concessionaria = new Concessionaria();
		
		Automovel ka = new Automovel("Ford", "Ka", 48899);
		Automovel golf = new Automovel("Volkswagen", "Golf", 78130);
		Automovel celta = new Automovel("Chevrolet", "celta", 19900);
		
		concessionaria.adicionaVeiculo(ka);
		concessionaria.adicionaVeiculo(golf);
		concessionaria.adicionaVeiculo(golf);
		concessionaria.adicionaVeiculo(golf);
		concessionaria.adicionaVeiculo(celta);
		
		System.out.println(concessionaria.consultaEstoqueVeiculo());
		
		concessionaria.vendaVeiculo(ka);
		
		System.out.println(concessionaria.consultaEstoqueVeiculo());
		
		System.out.println(concessionaria.somaEstoque());
		
		System.out.println(concessionaria.consultaVeiculo(golf));
		
		System.out.println(concessionaria.controleEstoque(golf));
	}
}
