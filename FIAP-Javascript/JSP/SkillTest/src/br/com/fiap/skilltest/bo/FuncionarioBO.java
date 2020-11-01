package br.com.fiap.skilltest.bo;

import java.sql.SQLException;

import br.com.fiap.skilltest.dao.FuncionarioDAO;
import br.com.fiap.skilltest.domain.Funcionario;

public class FuncionarioBO {
	public void cadastra(Funcionario funcionario) throws Exception {
		FuncionarioDAO funcionarioDao = new FuncionarioDAO();
		try {
			funcionarioDao.salva(funcionario);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
	}
	
}
