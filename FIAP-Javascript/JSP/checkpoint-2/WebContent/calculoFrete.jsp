<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Valor frete</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
	<% 
	String nome = request.getParameter("nome");
	
	String valorStr = request.getParameter("valor");
	Double valor = Double.parseDouble(valorStr);
	
	String estado = request.getParameter("estado");
	Integer valueEstado = Integer.parseInt(estado);
	
	Double frete = 1.0;
	
	String[] estados = new String[8];
	estados[0] = "AM";
	estados[1] = "ES";
	estados[2] = "GO";
	estados[3] = "MS";
	estados[4] = "PR";
	estados[5] = "RS";
	estados[6] = "SC";
	estados[7] = "SP";
	
	switch(valueEstado){
	case 0: 
		frete = valor * 0.10;
		break;
	case 1:
		frete = valor * 0.10;
		break;
	case 2:
		frete = valor * 0.12;
		break;
	case 3:
		frete = valor * 0.12;
		break;
	case 4:
		frete = valor * 0.09;
		break;
	case 5:
		frete = valor * 0.09;
		break;
	case 6:
		frete = valor * 0.09;
		break;
	case 7:
		frete = valor * 0.125;
		break;
	}
	Double valorTotal = valor + frete;
	%>
	
	<div class="container">
		<h2 class="display-4 my-3">Valor total do pedido</h2>
		
		<p class="lead">Nome: <%=nome%></p>
		<p class="lead">Valor do pedido: <%=valor%></p>
		<p class="lead">Valor do frete: <%=frete%></p>
		<p class="lead">Valor total: <%=valorTotal %></p>
		<p class="lead">Estado: <%=estados[Integer.parseInt(estado)]%></p>
	
		<p><a href="frete.jsp" class="btn btn-outline-info btn-lg">Voltar</a>
	</div>
</body>
</html>