package br.com.fiap.patterns.dao.generics;

import java.util.List;

public interface DAO<T> {
	List<T> findAll();
	T findById();
	void save(T t);
	void update(T t);
	void delete(Long id);
}
