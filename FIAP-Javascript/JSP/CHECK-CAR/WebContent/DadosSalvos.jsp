<%@page import="br.com.fiap.bean.Locacao"%>
<%@page import="br.com.fiap.dao.Dados"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locação agendada com sucesso</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>

	<div class="container my-3 p-5 bg-warning">

		<%
			String nome = request.getParameter("nome");
			String dataLocacao = request.getParameter("dt-locacao");
			String tipoVeiculo = request.getParameter("veiculo");
			Integer quantidadeDiarias = Integer.parseInt(request.getParameter("qtd-diarias"));
			Double totalPagar = 0.0;
			
			totalPagar = Locacao.calculaPagar(quantidadeDiarias, tipoVeiculo);

			Locacao loc = new Locacao();
			loc.setNomeCliente(nome);
			loc.setDataLocacao(dataLocacao);
			loc.setTipoVeiculo(tipoVeiculo);
			loc.setQuantidadeDiarias(quantidadeDiarias);
			loc.setTotalPagar(totalPagar);

			Dados.dadosVeiculos.add(loc);
		%>

		<h4 class="display-4">Locação cadastrada com sucesso</h4>
		<a href="Locadora.jsp" class="btn btn-dark">Gravar outra pessoa</a>
		<a href="ExibirDados.jsp" class="btn btn-info">Ver veículos locados</a>
		


	</div>

</body>
</html>