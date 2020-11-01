<%@page import="br.com.fiap.dao.Dados"%>
<%@page import="br.com.fiap.bean.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados Gravados</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	
	<div class="container my-3 p-5 bg-info">
	
		<!-- chamar a pessoa - criar uma pessoa e salvar no Array -->
		<%
		
		//Recuperamos
		 Pessoa p = new Pessoa();
		p.setNome(request.getParameter("nome"));
		p.setEmail(request.getParameter("email"));
		p.setEndereco(request.getParameter("endereco"));
		
		
		//Gravamos no Array
		Dados.pessoas.add(p);
		
		%>
		
		<h4 class="display-4">Pessoa cadastrada com sucesso !!!</h4>
		<a href="GravarArrayList.jsp" class="btn btn-dark">Gravar outra pessoa</a>
		
	
	</div>

</body>
</html>