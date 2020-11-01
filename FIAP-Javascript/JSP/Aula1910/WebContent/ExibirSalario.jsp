<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>

	<div class="container my-3">

		<p class="my-3 lead">
			Nome do funcionário: 
			<%=request.getAttribute("nome")%>
		</p>

		<p class="my-3 lead">
			Salário Atual do funcionário: 
			<%=request.getAttribute("salario")%>
		</p>
		
		<p class="my-3 lead">
			Desconto de IR: 
			<%=request.getAttribute("ir")%>
		</p>
		
		<p class="my-3 lead">
			Desconto de INSS: 
			<%=request.getAttribute("inss")%>
		</p>
		
		<p class="my-3 lead">
			Salário atualizado: 
			<%=request.getAttribute("novoSalario")%>
		</p>
		
		<a href="Pagamento.jsp" class="btn btn-info">Novo cálculo</a>

	</div>

</body>
</html>