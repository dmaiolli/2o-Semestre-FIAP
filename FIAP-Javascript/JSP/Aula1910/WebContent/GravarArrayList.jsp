<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Garvando em um Array List</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
</head>
<body>
	<div class="container my-3">
	<h2 class="disply-4">Usando classes</h2>
	
	<form name="dados" id="dados" method="post" action="InserirDados.jsp">
	
	<div class="form-group my-3">
		<label for="nome">Nome: </label>
		<input type="text" class="form-control" id="nome" name="nome" required>
	</div>
	
	<div class="form-group my-3">
		<label for="email">Email: </label>
		<input type="text" class="form-control" id="email" name="email" required>
	</div>
	
	<div class="form-group my-3">
		<label for="endereco">Endereço: </label>
		<input type="text" class="form-control" id="endereco" name="endereco">
	</div>
	
	<div class="my-3">
	<button type="submit" name="enviar" class="btn btn-success">Gravar Pessoa</button>
	<a href="ExibirDados.jsp" class="btn btn-info">Exibir Dados Gravados</a>
	</div>
	
	</form>
	</div>

</body>
</html>