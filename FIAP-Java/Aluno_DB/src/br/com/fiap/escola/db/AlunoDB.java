package br.com.fiap.escola.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.escola.model.Aluno;

public class AlunoDB {

	private Connection conn;

	public AlunoDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			this.conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm86487",
					"171201");

		} catch (ClassNotFoundException e) {
			System.err.printf("N�o foi poss�vel localizar o driver: %s", e.getMessage());
		} catch (SQLException e) {
			System.err.printf("Ocorreu um erro com a conex�o com o banco de dados: %s", e.getMessage());
		}
	}

	public void salvaUpdate(int rm, int ativo) {
		try {
			String sql = String.format("update tb_aluno set ativo = %d where rm like  '%s'", ativo, rm);

			Statement stmt = this.conn.createStatement();
			stmt.executeUpdate(sql);
			this.desconecta(this.conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void salva(Aluno aluno) {
		try {

			String sql = String.format(
					"insert into tb_aluno(id, rm, nome, ativo, nota1, nota2) "
							+ "values(sq_aluno.nextval, %s, '%s', %s, %s, %s)",
					aluno.getRm(), aluno.getNome(), aluno.getAtivo() ? 1 : 0, aluno.getNota1(), aluno.getNota2());

			Statement stmt = this.conn.createStatement();
			stmt.executeUpdate(sql);

			this.desconecta(this.conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void desconecta(Connection conn) throws SQLException {
		if (conn != null)
			conn.close();
	}


	public List<Aluno> consultaAtivos() {
		try {
			List<Aluno> alunosAtivos = new ArrayList<Aluno>();
			Statement stmt = this.conn.createStatement();
			String sql = "select * from tb_aluno where ativo = 1";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Integer id = rs.getInt("id");
				Integer rm = rs.getInt("rm");
				String nome = rs.getString("nome");
				Boolean ativo = rs.getBoolean("ativo");
				Double nota1 = rs.getDouble("nota1");
				Double nota2 = rs.getDouble("nota2");

				alunosAtivos.add(new Aluno(id, rm, nome, ativo, nota1, nota2));
			}
			this.desconecta(this.conn);
			return alunosAtivos;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Aluno> consultaTodos() {
		try {
			List<Aluno> alunos = new ArrayList<Aluno>();

			Statement stmt = this.conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tb_aluno");

			while (rs.next()) {
				Integer id = rs.getInt("id");
				Integer rm = rs.getInt("rm");
				String nome = rs.getString("nome");
				Boolean ativo = rs.getBoolean("ativo");
				Double nota1 = rs.getDouble("nota1");
				Double nota2 = rs.getDouble("nota2");

				alunos.add(new Aluno(id, rm, nome, ativo, nota1, nota2));
			}

			this.desconecta(this.conn);
			return alunos;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}


	public void excluiAluno(int rm) {
		try {
			Statement stmt = this.conn.createStatement();
			String sql = String.format("delete from tb_aluno where rm = %d", rm);
			stmt.executeUpdate(sql);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}