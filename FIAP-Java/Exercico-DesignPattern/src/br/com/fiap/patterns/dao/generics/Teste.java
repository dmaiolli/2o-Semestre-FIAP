package br.com.fiap.patterns.dao.generics;

public class Teste {
	public static void main(String[] args) {
		DAO<?> dao = new SellerDAO();
		
		dao = new DepartmentDAO();
		
		DAO<String> departmentDao = new DepartmentDAO();
	}

}
