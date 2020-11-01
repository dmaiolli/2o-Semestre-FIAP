package br.com.fiap.skilltest.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.skilltest.bo.CargoBO;
import br.com.fiap.skilltest.bo.QuestoesBO;
import br.com.fiap.skilltest.domain.Cargo;
import br.com.fiap.skilltest.domain.FuncCargo;
import br.com.fiap.skilltest.domain.Questionario;
import br.com.fiap.skilltest.domain.Questoes;

/**
 * Servlet implementation class CadastraCargo
 */
@WebServlet("/CadastraCargo")
public class CadastraCargo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastraCargo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cargo = request.getParameter("cargo");
		String gerente = request.getParameter("gerente");
		String habilidade = request.getParameter("habilidade");
		String pesoHabilidade = request.getParameter("pesoHabilidade");
		String pergunta = request.getParameter("pergunta");
		String pesoPergunta = request.getParameter("pesoPergunta");

		Cargo cargo1 = new Cargo(cargo);
		CargoBO negocio = new CargoBO();
		
		try {
			negocio.cadastra(cargo1);
			request.setAttribute("cargo", cargo1);
			request.getRequestDispatcher("CargoCadastrado.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", e.getMessage());
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}
		
		String habilidade1 = request.getParameter("habilidade1");
		String habilidade2 = request.getParameter("habilidade2");
		String habilidade3 = request.getParameter("habilidade3");
		
		Integer pesoHabilidade1 = Integer.parseInt(request.getParameter("pesoHabilidade1"));
		Integer pesoHabilidade2 = Integer.parseInt(request.getParameter("pesoHabilidade2"));
		Integer pesoHabilidade3 = Integer.parseInt(request.getParameter("pesoHabilidade3"));
		
		Questoes hability1 = new Questoes(habilidade1, pesoHabilidade1, "habilidade");
		Questoes hability2 = new Questoes(habilidade2, pesoHabilidade2, "habilidade");
		Questoes hability3 = new Questoes(habilidade3, pesoHabilidade3, "habilidade");
		
		
		String pergunta1 = request.getParameter("pergunta1");
		String pergunta2 = request.getParameter("pergunta2");
		String pergunta3 = request.getParameter("pergunta3");
		
		Integer pesoPergunta1 = Integer.parseInt(request.getParameter("pesoPergunta1"));
		Integer pesoPergunta2 = Integer.parseInt(request.getParameter("pesoPergunta2"));
		Integer pesoPergunta3 = Integer.parseInt(request.getParameter("pesoPergunta3"));
		
		Questoes question1 = new Questoes(pergunta1, pesoPergunta1, "pergunta");
		Questoes question2 = new Questoes(pergunta2, pesoPergunta2, "pergunta");
		Questoes question3 = new Questoes(pergunta3, pesoPergunta3, "pergunta");
		
		QuestoesBO negocio1 = new QuestoesBO();
		
		try {
			negocio1.cadastra(hability1);
			negocio1.cadastra(hability2);
			negocio1.cadastra(hability3);
			request.setAttribute("habilidade1", hability1);
			request.setAttribute("habilidade2", hability2);
			request.setAttribute("habilidade3", hability3);
			
			negocio1.cadastra(question1);
			negocio1.cadastra(question2);
			negocio1.cadastra(question3);
			request.setAttribute("pergunta1", question1);
			request.setAttribute("pergunta2", question2);
			request.setAttribute("pergunta3", question3);
			request.getRequestDispatcher("QuestaoCadastrada.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", e.getMessage());
			request.getRequestDispatcher("erro.jsp").forward(request, response);
		}
		

	}

}
