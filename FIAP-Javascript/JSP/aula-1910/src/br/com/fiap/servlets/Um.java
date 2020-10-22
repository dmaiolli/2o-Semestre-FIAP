package br.com.fiap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Um
 */
@WebServlet(
		description = "Meu primeiro sevlet",
		urlPatterns = { "/Um", "/Teste" })
public class Um extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Um() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Primeiro Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Dados da requisição</h1>");
		out.println(this.getClass() + "<br>");
		out.println("nome da máquina: " + request.getContextPath() + "<br>");
		out.println("Endereço da máquina: " + request.getLocalAddr() + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
