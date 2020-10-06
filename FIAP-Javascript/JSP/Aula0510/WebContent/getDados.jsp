<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recuperando dados da pessoa</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<h2 class="display-4 my-3">Recuperando dados da pessoa</h2>
	
	<%
	// recuperar pelo name - parametro
	String nome = request.getParameter("nome");
	String email = request.getParameter("email");
	String UF = request.getParameter("estado");
	// exibir o valor - retorna oque estiver no value
	out.print(UF);
	
	// criando um array de estados
	String[] estadosBR = new String[3];
	estadosBR[0] = "Rio de Janeiro";
	estadosBR[1] = "Rio Grande do sul";
	estadosBR[2] = "São Paulo";
	
	%>
	
	<!-- Exibir na página oque foi recuperado -->
	<p class="lead">
		Nome: <%=nome%>
	</p>
	
	<p class="lead">
		Email: <%=email%>
	</p>
	
	<p class="lead">
		UF: <%=estadosBR[Integer.parseInt(UF)]%>
	</p>
	
	<p>
	
	<a href="dados.jsp">Voltar a página anterior</a>

	</div>	
</body>
</html>