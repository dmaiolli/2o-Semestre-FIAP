package br.com.fiap.pousada.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.pousada.model.Quarto;

public class QuartoBD {
	private Connection conn;
	
	public QuartoBD() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", 
					"usuario", "senha");
			
		} catch(ClassNotFoundException e) {
			System.err.printf("Não foi possível localizar o driver: %s", e.getMessage());
		} catch(SQLException e) {
			System.err.println("Ocorreu um erro na conexão com o banco de dados");
			System.err.println(e.getMessage());
		}
	}
	
	public void SalvaQuarto(Quarto quarto) {
		try {

			String sql = String.format("insert into t_psd_quarto(nr_quarto, nr_max_pessoas, vl_diaria)"
					+ "values(sq_t_psd_quarto.nextval, %s, %s)",
					quarto.getMaxPessoas(), quarto.getValorDiaria());
			
			Statement stmt = this.conn.createStatement();
			stmt.executeUpdate(sql);
		
			this.desconecta(this.conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void desconecta(Connection conn) throws SQLException {
		if(!conn.isClosed()) conn.close();
	}
	
	public List<Quarto> consultaQuarto() {
		try {
			List<Quarto> quartos = new ArrayList<>();
						
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from t_psd_quarto");
		
			while(rs.next()) {
				Integer nr = rs.getInt("nr_quarto");
				Integer mp = rs.getInt("nr_max_pessoas");
				Double de = rs.getDouble("vl_diaria");
				quartos.add(new Quarto(nr, mp, de));
			}
			
			this.desconecta(this.conn);
			return quartos;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
