package br.com.fiap.pousada.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.pousada.model.Quarto;
import br.com.fiap.pousada.model.Reserva;

public class ReservaBD {
	private Connection conn;
	
	public ReservaBD() {
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

	public void SalvaReserva(Reserva reserva) {
		try {
			Date dtEntrada = java.sql.Date.valueOf(reserva.getDataEntrada());
			Date dtSaida = java.sql.Date.valueOf(reserva.getDataSaida());

			reserva.getQuarto();
			String sql = String.format("insert into t_psd_reserva(id_reserva, nr_quarto, dt_entrada, dt_saida, nr_pessoas)"
					+ "values(sq_t_psd_reserva.nextval, %s, TO_DATE('%s', 'yyyy/mm/dd'), TO_DATE('%s', 'yyyy/mm/dd'), %s)",
					reserva.getQuarto(), dtEntrada.toString(), dtSaida.toString(), reserva.getQtdePessoas());
			
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
	
	public List<Reserva> consultaReserva() {
		try {
			List<Reserva> reservas = new ArrayList<>();
						
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from t_psd_reserva");
			Quarto quarto = new Quarto();
			quarto.setNumero(2);
			
			while(rs.next()) {
				
				Integer id = rs.getInt("id_reserva");
				
				LocalDate de = rs.getDate("dt_entrada").toLocalDate();

				LocalDate ds = rs.getDate("dt_saida").toLocalDate();

				Integer qp = rs.getInt("nr_pessoas");
				
				reservas.add(new Reserva(quarto.getNumero(), id, de, ds, qp));
			}
			
			this.desconecta(this.conn);
			return reservas;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
