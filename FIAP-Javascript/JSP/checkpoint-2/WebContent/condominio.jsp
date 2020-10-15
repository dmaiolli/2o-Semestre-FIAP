<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cálculo condomínio</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

	<div class="container my-3">
		<form name="valor-condominio" method="post" action="calculoCondominio.jsp">
			<div class="form-group">
				<label for="valor">Valor do Condomínio:</label>
				<input type="number" id="valor" name="valor" class="form-control">
			</div>
			<button type="submit" name="enviar" class="btn btn-info">Calcular</button>
		</form>
	</div>

</body>
</html>