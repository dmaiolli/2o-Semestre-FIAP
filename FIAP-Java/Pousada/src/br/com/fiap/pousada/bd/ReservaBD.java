package br.com.fiap.pousada.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.pousada.model.Reserva;

public class ReservaBD {
	private Connection conn;
	
	public ReservaBD() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", 
					"rm84281", "031091");
			
		} catch(ClassNotFoundException e) {
			System.err.printf("Não foi possível localizar o driver: %s", e.getMessage());
		} catch(SQLException e) {
			System.err.println("Ocorreu um erro na conexão com o banco de dados");
			System.err.println(e.getMessage());
		}
	}
	public void AdicionaReserva(Reserva reserva) {
		try {
			String sql = String.format("insert into tb_reserva(id_reserva, nm_cliente, dt_entrada, dt_saida, nr_quarto, ds_quarto)"
					+ "values(sq_reserva.nextval, %s, TO_DATE('dd/mm/yyyy'), TO_DATE('dd/mm/yyyy'), %s, %s)", reserva.getCliente(), reserva.getDataEntrada(),
					reserva.getDataSaida(), reserva.getQuarto().getNumero(), reserva.getQuarto().getCategoria());
			
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
	public List<Reserva> consultaTodos() {
		try {
			List<Reserva> reservas = new ArrayList<>();
						
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tb_reserva");
		
			while(rs.next()) {
				Integer id = rs.getInt("id_reserva");
				String nm = rs.getString("nm_cliente");
				Date de = rs.getDate("dt_entrada");
				Date ds = rs.getDate("dt_saida");
				Integer qp = rs.getInt("nr_pessoas");
				Integer nr = rs.getInt("nr_quarto");
				
				reservas.add(new Reserva(id, nm, nr, de, ds, qp));
			}
			
			this.desconecta(this.conn);
			return reservas;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
