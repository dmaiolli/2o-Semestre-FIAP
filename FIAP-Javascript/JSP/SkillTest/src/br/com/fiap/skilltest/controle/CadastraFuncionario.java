package br.com.fiap.skilltest.controle;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.skilltest.bo.FuncionarioBO;
import br.com.fiap.skilltest.domain.Funcionario;

/**
 * Servlet implementation class CadastraFuncionario
 */
@WebServlet("/CadastraFuncionario")
public class CadastraFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastraFuncionario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("nome");
		Long cpf = Long.parseLong(request.getParameter("cpf"));
		LocalDate dataNascimento = LocalDate.parse(request.getParameter("dataNascimento"));
		String email = request.getParameter("email");

		Funcionario funcionario = new Funcionario(nome, dataNascimento, email, cpf, "funcionario");
		FuncionarioBO negocio = new FuncionarioBO();
		try {
			negocio.cadastra(funcionario);
			request.setAttribute("funcionario", funcionario);
			request.getRequestDispatcher("FuncionarioCadastrado.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", e.getMessage());
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}

	}

}
