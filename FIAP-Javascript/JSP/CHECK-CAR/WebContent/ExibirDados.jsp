<%@page import="br.com.fiap.bean.Locacao"%>
<%@page import="java.util.List"%>
<%@page import="br.com.fiap.dao.Dados"%>
<%@page import="br.com.fiap.dao.Dados"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locações</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class="container my-3">
		<table class="table table-striped">
			<tr>
				<th>Nome</th>
				<th>Data de locação</th>
				<th>Tipo de veículo</th>
				<th>Quantidade de diarias</th>
				<th>Total a pagar</th>
			</tr>

			<!-- Dados do Array List -->
			<%
				for (Locacao locacoes : Dados.dadosVeiculos) {
			%>
			<tr>
				<td><%=locacoes.getNomeCliente()%></td>
				<td><%=locacoes.getDataLocacao()%></td>
				<td><%=locacoes.getTipoVeiculo()%></td>
				<td><%=locacoes.getQuantidadeDiarias()%></td>
				<td><%=locacoes.getTotalPagar()%></td>
				<%
					}
				%>
			</tr>
		</table>
		<a href="Locadora.jsp" class="btn btn-info">Gravar outra
			locação</a>

	</div>

</body>
</html>