package br.com.fiap.patterns.dao.interfaces;

import java.util.List;

public interface SellerDAO<T> {

	List<T> findAll();
	T findByID(Long id);
	void save(T t);
	void update(T t);
	void delete(Long id);
}
