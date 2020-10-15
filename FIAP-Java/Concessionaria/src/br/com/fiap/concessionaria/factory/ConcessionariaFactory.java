package br.com.fiap.concessionaria.factory;

import br.com.fiap.concessionaria.domain.Automovel;
import br.com.fiap.concessionaria.domain.Hatch;
import br.com.fiap.concessionaria.domain.Picape;
import br.com.fiap.concessionaria.domain.Sedan;


public class ConcessionariaFactory {
	public Automovel create(final String automovelTipo) {
        switch (automovelTipo) {
            case "SEDAN":
    		    System.out.printf("Carro do tipo %s sendo preparado.\n", automovelTipo);
                return new Sedan();
            case "HATCH":
    		    System.out.printf("Carro do tipo %s sendo preparado.\n", automovelTipo);
                return new Hatch();
            case "PICAPE":
    		    System.out.printf("Carro do tipo %s sendo preparado.\n", automovelTipo);
                return new Picape();
            default:
                throw new IllegalArgumentException(
                        "Tipo de carro inexistente: " + automovelTipo
                );
        }
    }
}
