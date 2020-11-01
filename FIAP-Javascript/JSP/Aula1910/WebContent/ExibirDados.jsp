<%@page import="br.com.fiap.dao.Dados"%>
<%@page import="br.com.fiap.bean.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pessoas gravadas</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<div class="container my-3">
		<table class="table table-striped">
			<tr>
				<th>Nome</th>
				<th>Email</th>
				<th>Endereço</th>
			</tr>

			<!-- Dados do Array List -->
			<%
			for(Pessoa p: Dados.pessoas){
			%>
			<tr>
			<td><%=p.getNome() %></td>
			<td><%=p.getEmail() %></td>
			<td><%=p.getEndereco() %></td>
			<%
			}
			%>
			</tr>
		</table>
		<a href="GravarArrayList.jsp" class="btn btn-info">Gravar outra pessoa</a>

	</div>


</body>
</html>