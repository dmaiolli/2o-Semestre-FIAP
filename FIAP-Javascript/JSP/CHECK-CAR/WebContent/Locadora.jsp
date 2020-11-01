<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locadora Check-CAR</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>

<body>
	<div class="container my-3">
		<form name="locadora" method="post"
			action="DadosSalvos.jsp">
			<div class="form-group">
			
				<label for="nome">Nome do cliente:</label> 
				<input type="text" id="nome" name="nome" class="form-control" required>

				<label for="dt-locacao">Data da locação:</label> 
				<input type="date" id="dt-locacao" name="dt-locacao" class="form-control" required>
					
				<label for="veiculo">Tipo de veículo</label>
				<select class="custom-select custom-select-sm" name="veiculo" required>
					<option value="1">Classe 1</option>
					<option value="2">Classe 2</option>
					<option value="3">Classe 3</option>
				</select>				
				
				<label for="qtd-diarias">Quantidade de diárias:</label> 
				<input type="number" id="qtd-diarias" name="qtd-diarias" class="form-control" required>
			</div>
			<a href="ExibirDados.jsp" class="btn btn-info">Ver veículos locados</a>
			<button type="submit" name="enviar" class="btn btn-success">Gravar locação</button>
		</form>
	</div>

</body>
</html>