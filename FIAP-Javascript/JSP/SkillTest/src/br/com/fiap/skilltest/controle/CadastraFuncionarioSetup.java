package br.com.fiap.skilltest.controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.skilltest.bo.CargoBO;
import br.com.fiap.skilltest.domain.Cargo;

/**
 * Servlet implementation class CadastraFuncionarioSetup
 */
@WebServlet("/CadastraFuncionarioSetup")
public class CadastraFuncionarioSetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastraFuncionarioSetup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CargoBO cargobo = new CargoBO();
		try {
			List <Cargo> cargo = cargobo.getCargos();
			request.setAttribute("listaCargo", cargo);
			request.getRequestDispatcher("Adm/cadastra-funcionario.jsp").forward(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
