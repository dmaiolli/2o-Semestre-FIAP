package br.com.fiap.skilltest.validation;

import br.com.fiap.skilltest.domain.FuncCargo;
import br.com.fiap.skilltest.exception.CadastroException;
import br.com.fiap.skilltest.helper.DateHelper;

public class CadastroValidator {
	public static void validaDataEntrada(FuncCargo funcaoFuncionario) throws CadastroException {
		if(DateHelper.ehAnteriorAtual(funcaoFuncionario.getDataEntrada())) {
			throw new CadastroException("A data de entrada deve ser maior igual a data de hoje.");
		}
	}
}
