<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recuperando valor do condominio</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>
	<%
	String valorStr = request.getParameter("valor");
	Double valor = Double.parseDouble(valorStr);
	
	Double fundoReserva = valor * 1.05;
	Double benfeitorias = valor * 1.07;
	Double taxaAdm = valor * 0.15;
	Double total = valor + fundoReserva + benfeitorias + taxaAdm;
	
	%>
	<div class="container">
	<h2 class="display-4 my-3">Cálculo</h2>
		<p class="lead">
			Fundo de reserva = <%=fundoReserva %>
		</p>
		<p class="lead">
			Benfeitoria = <%=benfeitorias %>
		</p>
		<p class="lead">
			Taxa de Administração = <%=taxaAdm %>
		</p>
		<p class="lead">
			Total = <%=total %>
		</p>
	</div>

</body>
</html>