package br.com.fiap.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		// OJDBC -> Oracle Java Database Connectivity
			try {	
				// Carregar o driver na mem�ria
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// Criar a conex�o com o banco de dados
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm86487", "171201");
				
				System.out.println("Conex�o com o banco de dados efetuada com sucesso");
				
				Statement stmt = conn.createStatement();
				
				stmt.executeUpdate("insert into tb_tarefa(id, descricao, data_limite)"
						+ "values(sq_tarefa.nextval, 'Deitar e dormir', "
						+ "to_date('19/08/2020', 'dd/mm/yyyy'))");
				
				stmt.executeUpdate("update tb_tarefa set feita = 1 where descricao like '%Deitar%'");
				
				stmt.executeUpdate("delete from tb_tarefa where id = 2");
				
				ResultSet rs = stmt.executeQuery("select * from tb_tarefa");
				
				while(rs.next()) {
					Integer id = rs.getInt("id");
					String descricao = rs.getString("descricao");
					LocalDate dataLimite = rs.getDate("data_limite").toLocalDate();
					Boolean feita = rs.getBoolean("feita");
					
					System.out.printf("Tarefa = { %d, %s, %s, %s}\n", id, descricao, dataLimite.toString(), feita);
				}
				
				
				// Fechar a conex�o com o banco de dados
				conn.close();
				
			} catch(ClassNotFoundException e) {
				System.err.printf("N�o foi poss�vel localizar o driver: %s", e.getMessage());
			} catch(SQLException e) {
				System.err.printf("Ocorreu um erro com a conex�o com o banco de dados: %s", e.getMessage());
			}
			
	}
}
