<%@page import="java.util.List"%>
<%@page import="br.com.fiap.skilltest.domain.Cargo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="Adm/css/main.css">
<link rel="stylesheet" href="Adm/css/style.css">
<title>Cadastro de funcionários</title>
</head>

<body>

	<main>
		<nav class="navbar">
			<ul class="cima">
				<img src="./images/foto.png" alt="perfil">
			</ul>

			<ul class="meio">
				<li><a href="./index.html"><img
						src="./images/lista-funcionarios.png" alt="Lista de funcionários"></a>
				</li>
				<li><a href="./cadastra-cargo.html"><img
						src="./images/add-cargo.png" alt="Adiciona cargo"></a></li>
				<li><a href="./cadastra-funcionario.jsp"><img
						src="./images/add-funcionario.png" alt="Adiciona funcionário"></a>
				<li><a href="./cadastra-gerente.html"><img
						src="./images/user-adm.png" alt="Adiciona funcionário"></a></li>
			</ul>

			<ul class="fim">
				<a href="./ajuda.html"><img src="./images/help.png" alt="Ajuda"></a>
			</ul>
		</nav>

		<div class="content">
			<header>
				<input type="search" id="busca" placeholder="Busca">
			</header>

			<div class="cadastro funcionario">
				<div class="cadastro-usuario">
					<form
						action="../CadastraFuncionario"
						method="post" id="usuario">
						<h2>CADASTRO DE USUÁRIOS</h2>
						<fieldset>
							<input type="text" id="full-name" name="nome" required
								placeholder="Nome completo">
						</fieldset>
						<fieldset>
							<div class="flex">
								<input type="number" id="cpf" name="cpf" required
									placeholder="CPF"> <input type="date"
									name="dataNascimento" placeholder="Data de nascimento">
							</div>
						</fieldset>
						<fieldset>
							<input type="email" id="email" name="email" required
								placeholder="Email">
						</fieldset>

						<fieldset class="bt-salva">
							<input type="submit" value="Salvar">
						</fieldset>


					</form>

				</div>

				<div class="selecao-cargo">
					<form action="" id="cargo">
						<h2>CARGO</h2>
						<fieldset>
							<select name="area" id="" required>
								<option value="">Selecione a �rea</option>
								<option value="Infra">Infra</option>
								<option value="Banco-dados">Banco de dados</option>
								<option value="BackEnd">BackEnd</option>
							</select>
						</fieldset>

						
						<fieldset>
							<select name="cargo" required>
								<option value="" selected>Selecione o cargo</option>
								<%
								List<Cargo> lista = (List<Cargo>) request.getAttribute("listaCargo");
								for(Cargo c : lista){
									
								%>
								<option value="<%=c.getId() %>"><%=c.getNome() %></option>
								<% 
								}								
								%>
							</select>
						
						</fieldset>
						
						<fieldset>
							<input type="date" name="dataEntrada" id="" required
								placeholder="Data de entrada">
						</fieldset>

						<fieldset>
							<input type="date" name="dataSaida" id="" required
								placeholder="Data de saída">
						</fieldset>


					</form>
				</div>
			</div>
		</div>
	</main>

</body>

</html>