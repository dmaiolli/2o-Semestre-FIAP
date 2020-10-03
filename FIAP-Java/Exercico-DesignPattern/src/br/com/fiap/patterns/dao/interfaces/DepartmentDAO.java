package br.com.fiap.patterns.dao.interfaces;

import java.util.List;

public interface DepartmentDAO {
	
	List<String> findAll();
	String findByID(Long id);
	void save(String person);
	void update(String person);
	void delete(Long id);
}
