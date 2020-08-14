package ArrayList.CollectionAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteMochilao {

	public static void main(String[] args) {
		
		Mochilao mochilaoEuropa = new Mochilao("Europa 2018", "Andrey Masiero");
		
		List<Destino> destinosImutaveis = mochilaoEuropa.getDestinos();
		
		System.out.println(destinosImutaveis);
		
		List<Destino> destinos = new ArrayList<>(destinosImutaveis);
		
		Collections.sort(destinos);
		
		System.out.println(destinos);

//		
//		mochilaoEuropa.getDestinos().add(new Destino("Paris", 9396)); // Error, because its been altered the method getDestino on class "Mochilao"
//		
		
		mochilaoEuropa.adiciona(new Destino("Paris", 9636));
		mochilaoEuropa.adiciona(new Destino("Lyon", 466));
		
		System.out.println(mochilaoEuropa);
	}
}
