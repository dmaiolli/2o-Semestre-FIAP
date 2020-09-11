package src.br.com.fiap.transferencia.bd;

import java.sql.*;

import src.br.com.fiap.transferencia.model.Conta;

public class UsuarioBD {

	private Connection conn;
	
	public UsuarioBD() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", 
					"rm86487", "171201");
		} catch (ClassNotFoundException e) {
			System.err.printf("Não foi possível localizar o driver: %s", e.getMessage());
		} catch(SQLException e) {
			System.err.printf("Erro na conexão com o banco de dados: %s", e.getMessage());
		}
	}
	
	public void criaConta(Conta conta) {
		try {
			
		String sql = String.format("insert into t_conta(nr_conta, vl_saldo) values (sq_t_conta, %s)", conta.getValor());
		
		Statement stmt = this.conn.createStatement();
		stmt.executeUpdate(sql);
		
		this.desconecta(this.conn);
		} catch(SQLException e) {
			System.err.printf("Não foi possível localizar o driver: %s", e.getMessage());
		}
	}
	
	public void desconecta(Connection conn) throws SQLException{
		if (!conn.isClosed()) conn.close();
	}
	
}
