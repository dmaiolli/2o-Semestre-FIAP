package br.com.fiap.skilltest.bo;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.skilltest.dao.CargoDAO;
import br.com.fiap.skilltest.domain.Cargo;

public class CargoBO {

	public void cadastra(Cargo cargo1) throws Exception {
		CargoDAO cargoDao = new CargoDAO();
		try {
			cargoDao.salva(cargo1);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
	}
	
	public List <Cargo> getCargos() throws Exception {
		CargoDAO cargoDao = new CargoDAO();
		try {
			return cargoDao.consultaTodos();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
	}

	
}
