package br.com.fiap.pousada.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.pousada.model.Quarto;
import br.com.fiap.pousada.model.Reserva;

public class PousadaBD {
	private Connection conn;
	
	public PousadaBD() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", 
					"rm86487", "171201");
			
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
					+ "values(%d, %d, %d)", quarto.getNumero(),	Quarto.getMaxPessoas(), quarto.getValorDiaria());
			
			Statement stmt = this.conn.createStatement();
			stmt.executeUpdate(sql);
		
			this.desconecta(this.conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void SalvaReserva() {
		try {
			String sql = String.format("insert into t_psd_reserva(id_reserva, dt_entrada, dt_saida, nr_pessoas)"
					+ "values(SQ_T_PSD_QUARTO.nextval, TO_DATE(20/08/2020, 'dd/mm/yyyy'), TO_DATE(30/08/2020, 'dd/mm/yyyy'), 2)");
//					,reserva.getDataEntrada(), reserva.getDataSaida(), reserva.getQtdePessoas());
			
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
	public List<Reserva> consultaReserva() {
		try {
			List<Reserva> reservas = new ArrayList<>();
						
			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from t_psd_reserva");
		
			while(rs.next()) {
				Integer id = rs.getInt("id_reserva");
				Date de = rs.getDate("dt_entrada");
				LocalDate dent = ((java.sql.Date) de).toLocalDate();

				Date ds = rs.getDate("dt_saida");
				LocalDate dsai = ((java.sql.Date) ds).toLocalDate();

				Integer qp = rs.getInt("nr_pessoas");
				reservas.add(new Reserva(id, consultaQuarto().get(0), dent, dsai, qp));
			}
			
			this.desconecta(this.conn);
			return reservas;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
