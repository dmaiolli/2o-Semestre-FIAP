<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calcular Frete</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
	<div class="container my-3">
		<form name="dados" id="dados" method="post" action="calculoFrete.jsp">
			<div class="form-group">
				<label for="name">Nome:</label>
				<input type="text" id="nome" name="nome" class="form-control">
			</div>
			<div class="form-group">
				<label for="valor">Valor:</label>
				<input type="number" id="valor" name="valor" class="form-control">
			</div>
			<div class="form-group">
				<label for="estado">UF: </label>
				<select id="estado" name="estado" class="form-control">
					<option value="0">AM</option>
					<option value="1">ES</option>
					<option value="2">GO</option>
					<option value="3">MS</option>
					<option value="4">PR</option>
					<option value="5">RS</option>
					<option value="6">SC</option>
					<option value="7">SP</option>
				</select>
			</div>
			<button type="submit" name="enviar" class="btn btn-info">Calcular</button>
		</form>
	</div>

</body>
</html>