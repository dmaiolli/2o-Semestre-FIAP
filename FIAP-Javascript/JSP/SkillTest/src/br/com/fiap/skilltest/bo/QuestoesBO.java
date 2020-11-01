package br.com.fiap.skilltest.bo;

import java.sql.SQLException;

import br.com.fiap.skilltest.dao.QuestoesDAO;
import br.com.fiap.skilltest.domain.Questoes;

public class QuestoesBO {
	public void cadastra(Questoes questao) throws Exception {
		QuestoesDAO questaoDao = new QuestoesDAO();
		try {
			questaoDao.salva(questao);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
	}
	

}
