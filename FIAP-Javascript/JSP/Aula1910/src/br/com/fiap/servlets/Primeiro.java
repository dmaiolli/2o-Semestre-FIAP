package br.com.fiap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Primeiro
 */
@WebServlet(
		description = "Meu primiero Servlet", 
		urlPatterns = { 
				"/Primeiro", 
				"/ServeletUm", 
				"/Um"
		})
public class Primeiro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Primeiro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Primeiro Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Dados da requisição</h1>");
		out.println(this.getClass() + "<br>");
		out.println("Nome da máquina: " + request.getContextPath() + "<br>");
		out.println("Endereço da máquina: " + request.getLocalAddr() + "<br>");
		out.println("Porta usada: " + request.getLocalPort() + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
