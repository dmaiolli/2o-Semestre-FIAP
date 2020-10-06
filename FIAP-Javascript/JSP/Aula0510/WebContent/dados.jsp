<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Pessoas</title>
<link>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>

	<div class="container my-3">
		<form method="get" name="dados" id="dados" action="getDados.jsp">

			<div class="form-group">
				<label for="nome">Nome: </label> 
				<input type="text" id="nome" name="nome" class="form-control">
			</div>

			<div class="form-group">
				<label for="email">Email: </label> 
				<input type="email" id="email" name="email" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="estado">UF: </label> 
				<select id="estado" name="estado" class="form-control">
					<option value="0">Rio de Janeiro</option>
					<option value="1">Rio Grande do sul</option>
					<option value="2">São Paulo</option>
				</select>
			</div>
			
			<button type="submit" name="enviar" class="btn btn-info">Enviar</button>
		</form>
	</div>

</body>
</html>