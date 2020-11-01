package br.com.fiap.servlets;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Locacao;
import br.com.fiap.dao.Dados;

/**
 * Servlet implementation class GetInfo
 */
@WebServlet("/GetDados")
public class GetDados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		String nome = request.getParameter("nome");
		String dataLocacao = request.getParameter("dt-locacao");
		String tipoVeiculo = request.getParameter("veiculo");
		Integer qtdDiarias = Integer.parseInt(request.getParameter("qtd-diarias"));
		
		double totalPagar = Locacao.calculaPagar(qtdDiarias, tipoVeiculo);
		
		request.setAttribute("nome", nome);
		request.setAttribute("dtLocacao", dataLocacao);
		request.setAttribute("tipoVeiculo", tipoVeiculo);
		request.setAttribute("qtdDiarias", qtdDiarias);
		request.setAttribute("totalPagar", formatador.format(totalPagar));
		
		System.out.println(totalPagar);
		
		Locacao locacao = new Locacao(nome, dataLocacao, tipoVeiculo, qtdDiarias, totalPagar);
		
		request.getRequestDispatcher("ExibirDados.jsp").forward(request, response);
	}

}
